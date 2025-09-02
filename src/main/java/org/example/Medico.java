package org.example;

public class Medico extends Persona{
    /*Médico: especialidad (cirujano, oftalmólogo, etc.), servicio (cirugía, oftalmología, etc.), número de consultorio.
    La aplicación a desarrollar debe permitir:
    Empleado por Planilla: salario mensual, porcentaje adicional por hora extra.*/

    private String especialidad;
    private String servicio;
    private int numeroConsultorio;
    private int salario;
    private int porcentajeAdicionalHoraExtra;
    public Medico() {
    }

    public Medico(String especialidad, String servicio, int numeroConsultorio, int salario, int porcentajeAdicionalHoraExtra) {
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.numeroConsultorio = numeroConsultorio;
        this.salario = salario;
        this.porcentajeAdicionalHoraExtra = porcentajeAdicionalHoraExtra;
    }

    public Medico(int numeroDni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudad, String especialidad, String servicio, int numeroConsultorio, int salario, int porcentajeAdicionalHoraExtra) {
        super(numeroDni, nombre, apellido, fechaNacimiento, direccion, ciudad);
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.numeroConsultorio = numeroConsultorio;
        this.salario = salario;
        this.porcentajeAdicionalHoraExtra = porcentajeAdicionalHoraExtra;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public int getSalario() {
        return salario;
    }

    public int getPorcentajeAdicionalHoraExtra() {
        return porcentajeAdicionalHoraExtra;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setPorcentajeAdicionalHoraExtra(int porcentajeAdicionalHoraExtra) {
        this.porcentajeAdicionalHoraExtra = porcentajeAdicionalHoraExtra;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especialidad='" + especialidad + '\'' +
                ", servicio='" + servicio + '\'' +
                ", numeroConsultorio=" + numeroConsultorio +
                ", salario=" + salario +
                ", porcentajeAdicionalHoraExtra=" + porcentajeAdicionalHoraExtra +
                '}';
    }
}
