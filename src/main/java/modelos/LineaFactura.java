package modelos;

import java.util.Objects;

public class LineaFactura {

    private Integer id;

    private Factura factura;

    private Producto producto;

    private Integer cantidad;

    public LineaFactura(Integer id, Factura factura, Producto producto, Integer cantidad) {
        this.id = id;
        this.factura = factura;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public LineaFactura() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LineaFactura that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFactura(), that.getFactura()) && Objects.equals(getProducto(), that.getProducto()) && Objects.equals(getCantidad(), that.getCantidad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFactura(), getProducto(), getCantidad());
    }

    @Override
    public String toString() {
        return "LineaFactura{" +
                "id=" + id +
                ", factura=" + factura +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                '}';
    }
}
