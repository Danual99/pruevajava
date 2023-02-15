package modelos;

import java.util.Objects;

public class Empleado {

    private Integer id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String numTelefono;
    private Empresa empresa;
    private Contrato contrato;

    public Empleado(Integer id, String dni, String nombre, String apellidos, String direccion, String numTelefono, Empresa empresa, Contrato contrato) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    public Empleado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return Objects.equals(getId(), empleado.getId()) && Objects.equals(getDni(), empleado.getDni()) && Objects.equals(getNombre(), empleado.getNombre()) && Objects.equals(getApellidos(), empleado.getApellidos()) && Objects.equals(getDireccion(), empleado.getDireccion()) && Objects.equals(getNumTelefono(), empleado.getNumTelefono()) && Objects.equals(getEmpresa(), empleado.getEmpresa()) && Objects.equals(getContrato(), empleado.getContrato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDni(), getNombre(), getApellidos(), getDireccion(), getNumTelefono(), getEmpresa(), getContrato());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", empresa=" + empresa.getCodigoEmpresa() +
                ", contrato=" + contrato +
                '}';
    }
}
