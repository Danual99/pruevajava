package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {

    //----Atributos--

    private  Integer identificador;

    private String codigo;

    private String descripcion;

    private LocalDate fechaCaducidad;

    private TipoProducto tipoProducto;

    private Almacen almacen;

    private Double precio;


    //---Constructor---

    public Producto(Integer identificador, String codigo, String descripcion, LocalDate fechaCaducidad, TipoProducto tipoProducto, Almacen almacen, Double precio) {
        this.identificador = identificador;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fechaCaducidad = fechaCaducidad;
        this.tipoProducto = tipoProducto;
        this.almacen = almacen;
        this.precio = precio;
    }


    //---Constructor Vacio---

    public Producto(){


    }

    //---Get&Set---

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    //---Equals&Hashcode---

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return Objects.equals(getIdentificador(), producto.getIdentificador()) && Objects.equals(getCodigo(), producto.getCodigo()) && Objects.equals(getDescripcion(), producto.getDescripcion()) && Objects.equals(getFechaCaducidad(), producto.getFechaCaducidad()) && getTipoProducto() == producto.getTipoProducto() && Objects.equals(getAlmacen(), producto.getAlmacen()) && Objects.equals(getPrecio(), producto.getPrecio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getCodigo(), getDescripcion(), getFechaCaducidad(), getTipoProducto(), getAlmacen(), getPrecio());
    }


    //---ToString---


    @Override
    public String toString() {
        return "Producto{" +
                "identificador=" + identificador +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", tipoProducto=" + tipoProducto +
                ", almacen=" + almacen +
                ", precio=" + precio +
                '}';
    }
}


