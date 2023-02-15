package modelos;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private Integer id;
    private String codigoEmpresa;
    private List<Empleado> empleados;
    private TipoEmpresa tipoEmpresa;

    public Empresa(Integer id, String codigoEmpresa, List<Empleado> empleados, TipoEmpresa tipoEmpresa) {
        this.id = id;
        this.codigoEmpresa = codigoEmpresa;
        this.empleados = empleados;
        this.tipoEmpresa = tipoEmpresa;
    }

    public Empresa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa empresa)) return false;
        return Objects.equals(getId(), empresa.getId()) && Objects.equals(getCodigoEmpresa(), empresa.getCodigoEmpresa()) && Objects.equals(getEmpleados(), empresa.getEmpleados()) && getTipoEmpresa() == empresa.getTipoEmpresa();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCodigoEmpresa(), getEmpleados(), getTipoEmpresa());
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", codigoEmpresa='" + codigoEmpresa + '\'' +
                ", empleados=" + empleados +
                ", tipoEmpresa=" + tipoEmpresa +
                '}';
    }
}
