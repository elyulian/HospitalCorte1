
package org.example;

public class Persona {

    //Persona: número de DNI, nombre, apellido, fecha de nacimiento, dirección, ciudad de procedencia.
    protected int numeroDni;
    protected String nombre;
    protected String apellido;
    protected String fechaNacimiento;
    protected String direccion;
    protected String ciudad;
    public Persona() {
    }

    public Persona(int numeroDni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudad) {
        this.numeroDni = numeroDni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public void setNumeroDni(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "numeroDni=" + numeroDni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
