package entity;

import javax.persistence .*;

@Entity
@Table(name = "categorias")
public class Categoria {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_categorias")
        private Long id;

        @Column(name = "nombre", nullable = false, length = 100)
        private String nombre;

        @Column(name = "descripcion", nullable = false, length = 150)
        private String descripcion;

        // Creando constructor vacio
        public Categoria() {

        }

        // Creando getters y setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }


        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }


        //Creando toString con StringBuild
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Categorias [idCategorias=");
            builder.append(id);
            builder.append(", nombre=");
            builder.append(nombre);
            builder.append(", descripcion=");
            builder.append(descripcion);
            builder.append("]");
            return builder.toString();
        }

    }