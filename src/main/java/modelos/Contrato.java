package modelos;

import java.util.Objects;

public class Contrato {

    private Integer id;
    private Double salarioBase;
    private TipoContrato tipoContrato;

    public Contrato(Integer id, Double salarioBase, TipoContrato tipoContrato) {
        this.id = id;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
    }

    public Contrato() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contrato contrato)) return false;
        return Objects.equals(getId(), contrato.getId()) && Objects.equals(getSalarioBase(), contrato.getSalarioBase()) && getTipoContrato() == contrato.getTipoContrato();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSalarioBase(), getTipoContrato());
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", salarioBase=" + salarioBase +
                ", tipoContrato=" + tipoContrato +
                '}';
    }
}
