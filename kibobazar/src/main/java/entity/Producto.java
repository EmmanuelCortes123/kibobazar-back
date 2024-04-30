package entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombre;

    @Column(name = "talla", nullable = false, length = 10)
    private String talla;

    @Column(name = "imagen", nullable = false, length = 200)
    private String imagen;

    @Column(name = "material", nullable = false, length = 100)
    private String material;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "medidas", nullable = false, length = 150)
    private String medidas;

    @Column(name = "precio", nullable = false, precision = 9, scale = 2)
    private BigDecimal precio;


    // Creando constructor vacio
    public Producto(){

    }

    //Creando la relacion entre entidades
    @ManyToOne
    private Categoria categoria;

    // Creando getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long idProducto) {
        this.id = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //Creando toString con StringBuild
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Producto [idProducto=");
        builder.append(id);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append(", talla=");
        builder.append(talla);
        builder.append(", imagen=");
        builder.append(imagen);
        builder.append(", material=");
        builder.append(material);
        builder.append(", descripcion=");
        builder.append(descripcion);
        builder.append(", medidas=");
        builder.append(medidas);
        builder.append(", precio=");
        builder.append(precio);
        builder.append(", categoria=");
        builder.append(categoria);
        builder.append("]");
        return builder.toString();
    }
}
