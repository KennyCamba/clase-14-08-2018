/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesclase;

/**
 *
 * @author Municipio de Gye
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombre, int edad, String cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        return (nombre.compareTo(o.nombre)) + (edad - o.edad);
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Persona))
            return false;
        Persona p = (Persona)o;
        return nombre.equals(p.nombre) && edad ==  p.edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    @Override
    public int hashCode() {
        return cedula.hashCode();
    }
}
