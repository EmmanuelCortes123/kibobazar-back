package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;


@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_pedidos")
    private Long id;

    @Column(name = "monto", nullable = false, precision = 9, scale = 2)
    private BigDecimal monto;

    @Column(name = "direccion_envio", nullable = false, length = 200)
    private String direccionEnvio;

    @Column(name = "direccion_pedido", nullable = false, length = 200)
    private String direccionPedido;

    @Column(name = "correo", nullable = false, length = 100)
    private String correo;

    @Column(name = "fecha_pedido", nullable = false)
    private Date fechaPedido;

    @Column(name = "estado_pedido", nullable = false, length = 100)
    private String estadoPedido;

    //Creando la relacion entre entidades
    @ManyToOne
    private Cliente cliente;

    // Creando constructor vacio
    public Pedido(){

    }

    // Creando getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Creando toString con
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pedido [id=");
        builder.append(id);
        builder.append(", monto=");
        builder.append(monto);
        builder.append(", direccionEnvio=");
        builder.append(direccionEnvio);
        builder.append(", direccionPedido=");
        builder.append(direccionPedido);
        builder.append(", correo=");
        builder.append(correo);
        builder.append(", fechaPedido=");
        builder.append(fechaPedido);
        builder.append(", estadoPedido=");
        builder.append(estadoPedido);
        builder.append(", cliente=");
        builder.append(cliente);
        builder.append("]");
        return builder.toString();
    }







}

