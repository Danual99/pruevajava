package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Factura {

    private Integer id;

    private String codigoFactura;

    private Double importeBase;

    private Double descuento;

    private  Double iva;

    private Double totalAPagar;

    private LocalDate fechaEmision;

    private LocalDate fechaVencimiento;

    private Boolean pagada;

    private List<LineaFactura> lineaFactura;

    private Cliente cliente;


    public Factura(Integer id, String codigoFactura, Double importeBase, Double descuento, Double iva, Double totalAPagar, LocalDate fechaEmision, LocalDate fechaVencimiento, Boolean pagada, List<LineaFactura> lineaFactura, Cliente cliente) {
        this.id = id;
        this.codigoFactura = codigoFactura;
        this.importeBase = importeBase;
        this.descuento = descuento;
        this.iva = iva;
        this.totalAPagar = totalAPagar;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.pagada = pagada;
        this.lineaFactura = lineaFactura;
        this.cliente = cliente;
    }

    public Factura() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Double getImporteBase() {
        return importeBase;
    }

    public void setImporteBase(Double importeBase) {
        this.importeBase = importeBase;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(Double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Boolean getPagada() {
        return pagada;
    }

    public void setPagada(Boolean pagada) {
        this.pagada = pagada;
    }

    public List<LineaFactura> getLineaFactura() {
        return lineaFactura;
    }

    public void setLineaFactura(List<LineaFactura> lineaFactura) {
        this.lineaFactura = lineaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura factura)) return false;
        return Objects.equals(getId(), factura.getId()) && Objects.equals(getCodigoFactura(), factura.getCodigoFactura()) && Objects.equals(getImporteBase(), factura.getImporteBase()) && Objects.equals(getDescuento(), factura.getDescuento()) && Objects.equals(getIva(), factura.getIva()) && Objects.equals(getTotalAPagar(), factura.getTotalAPagar()) && Objects.equals(getFechaEmision(), factura.getFechaEmision()) && Objects.equals(getFechaVencimiento(), factura.getFechaVencimiento()) && Objects.equals(getPagada(), factura.getPagada()) && Objects.equals(getLineaFactura(), factura.getLineaFactura()) && Objects.equals(getCliente(), factura.getCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCodigoFactura(), getImporteBase(), getDescuento(), getIva(), getTotalAPagar(), getFechaEmision(), getFechaVencimiento(), getPagada(), getLineaFactura(), getCliente());
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", codigoFactura='" + codigoFactura + '\'' +
                ", importeBase=" + importeBase +
                ", descuento=" + descuento +
                ", iva=" + iva +
                ", totalAPagar=" + totalAPagar +
                ", fechaEmision=" + fechaEmision +
                ", fechaVencimiento=" + fechaVencimiento +
                ", pagada=" + pagada +
                ", lineaFactura=" + lineaFactura +
                ", cliente=" + cliente +
                '}';
    }
}
