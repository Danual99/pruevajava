package modelos;

import java.util.Objects;

public class Almacen {

    private Integer identificador;

    private String nombre;

    private Integer capacidad;


    //---Constructor---

    public Almacen(Integer identificador, String nombre, Integer capacidad){
        this.identificador = identificador;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    //---Constructor Vacio---

    public Almacen(){


    }


    //---Get&Set---


    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    //---Equals&Hashcode---


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Almacen almacen)) return false;
        return Objects.equals(getIdentificador(), almacen.getIdentificador()) && Objects.equals(getNombre(), almacen.getNombre()) && Objects.equals(getCapacidad(), almacen.getCapacidad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdentificador(), getNombre(), getCapacidad());
    }

    //---ToString---


    @Override
    public String
    toString() {
        return "Almacen{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
