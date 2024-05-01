package com.kibobazar.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.kibobazar.app.security.jwt.JWTAuthenticationFilter;
import com.kibobazar.app.security.jwt.JWTAuthorizationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.List;



/*
 * @EneableWebSecurity: habilita la configuracion de seguridad web en una aplicacion Spring Boot
 * @Configuration: contiene configuraciones para la aplicacion, como definiciones de beans y configuracion de componentes
 * y que debe ser considerada durante la inicializacion del contexto de la aplicacion.
 * */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
/*	@Bean
	UserDetailsService userDetailService(PasswordEncoder passwordEncoder) {
		UserDetails emma = User.builder()
				.username("emma")
				.password(passwordEncoder.encode("123"))
				.roles("ADMIN")
				.build();
		UserDetails Kris = User.builder()
				.username("Kris")
				.password(passwordEncoder.encode("456"))
				.roles("CLIENTE")
				.build();
		UserDetails Rodo = User.builder()
				.username("Rodo")
				.password(passwordEncoder.encode("789"))
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(emma, Kris, Rodo);
				}*/
	
	//STEP 1.1 Crear un bean en PassworsEncoder
	/*
	 * Crear un bean de BCryptPasswordEncoder
	 * BCryptPasswordEncoder es una implementacion de PasswordEncoder proporcionada
	 * por Spring Security. Se utiliza para codificar y verificar contraseñas utilizando
	 * el algoritmo de hashing bcrypt.
	 * El algoritmo incorpora un sal aleatoria por cada contraseña, lo que agrega una capa
	 * adicional de seguridad.
	 * */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	//STEP 2 Realizar configuraciones personalizadas del filter chain
	@Bean
	SecurityFilterChain filterChain(
			HttpSecurity http,
			AuthenticationManager authManager,
			JWTAuthorizationFilter jwtAuthorizationFilter) 
					throws Exception {
		
		JWTAuthenticationFilter jwtAuthenticationFilter = new JWTAuthenticationFilter();
		jwtAuthenticationFilter.setAuthenticationManager(  authManager );
		jwtAuthenticationFilter.setFilterProcessesUrl("/login");
		
		
		// STEP 2.1 Deshabilitar la seguridad
		/*return http.authorizeHttpRequests(authorize -> authorize.anyRequest().permitAll())
				.csrf(csrf -> csrf.disable()).httpBasic(withDefaults())
				.build();*/
		
		//STEP 2.2 Personalizar la seguridad en los endpoints
		return http
				.authorizeHttpRequests(authorize -> authorize
						.requestMatchers("/", "index.html", "/assets/*").permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/clientes").permitAll()
						.requestMatchers(HttpMethod.GET,"/api/v1/productos", "/api/v1/productos/**").permitAll()
						.requestMatchers("/api/v1/clientes", "/api/v1/privilegios/**").hasAuthority("ADMIN")
						.requestMatchers("/api/v1/clientes/**",
								         "/api/v1/pedidos/**",
								         "/api/v1/pedidos-has-productos/**")
						.hasAnyRole("ADMIN", "CLIENTE")
						.anyRequest().authenticated()
						)
				// STEP 7: Agregamos el filtro de autenticación del login
				// interceptar las solicitudes de autenticación 
				// y generamos el token en la respuesta
				.addFilter(jwtAuthenticationFilter)
				// STEP 8: Agregamos el filtro para las demas solicitudes verificando el token JWT
				// Interceptamos las solicitudes , extraemos y validamos el token
				// y autenticamos al usuario
				.addFilterBefore( jwtAuthorizationFilter  ,  UsernamePasswordAuthenticationFilter.class)					
			    // no es necesario almacenar información de sesión en el servidor, 
				// ya que toda la información necesaria para la autenticación 
				// se encuentra en el token, y cada solicitud es autónoma.				 
				.sessionManagement(managment -> managment.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.csrf( csrf-> csrf.disable() )
				.httpBasic( withDefaults() ) 
				.build();
	}
	
	//STEP 3 Autenticacion basada en usuarios de la BD
	/*
	 * AuthentucationManager: Gestiona las operaciones de autenticacion.
	 * getSharedObject: Obtiene una instancia compartida de AuthenticacionManagerBuilder
	 * .userDetailsService: Configura el AuthenticationManagerBuilder
	 * para utilizar un servicio de  carga detalles especificos
	 * del usuario durante el proceso de autenticacion.
	 * */
	
	@Bean
	AuthenticationManager authManager(
			HttpSecurity httpSecurity,
			PasswordEncoder passwordEncoder,
			UserDetailsService userDetailsService
			) throws Exception{
		AuthenticationManagerBuilder authManagerBuilder = httpSecurity
				.getSharedObject(AuthenticationManagerBuilder.class);
		
		authManagerBuilder
		.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
		
		return authManagerBuilder.build();
	}
// STEP 6: opcional, configurar los CORS en caso de que no funcione 
// @CrossOrigin(origins = "*") en los controladores
@Bean
CorsConfigurationSource corsConfigurationSource() {
	CorsConfiguration configuration = new CorsConfiguration();
	configuration.setAllowedOrigins( List.of("http://127.0.0.1:5500", "https://ecommer-generica.netlify.app") );
	configuration.setAllowedMethods( List.of("GET", "POST", "PUT", "DELETE") );
	configuration.setAllowedHeaders( List.of("Authorization","Content-Type") );
	
	// Para todas las rutas en la aplicación ("/**"), 
	// aplique la configuración CORS definida en el objeto configuration.
	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	source.registerCorsConfiguration("/**", configuration);
	return source;
	
}


}