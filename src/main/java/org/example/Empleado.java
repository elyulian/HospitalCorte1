package org.example;

public class Empleado extends Persona{

    protected int numeroEmpleado;
    protected String cargo;
    protected double salario;

    public Empleado() {
        super();
    }
    public Empleado(int numeroDni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudad, int numeroEmpleado, String cargo, double salario) {
        super(numeroDni, nombre, apellido, fechaNacimiento, direccion, ciudad);
        this.numeroEmpleado = numeroEmpleado;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "numeroEmpleado=" + numeroEmpleado +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
