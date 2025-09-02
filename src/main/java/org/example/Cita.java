package org.example;

public class Cita {

    private String numeroCita;
    private String nombrePaciente;
    private String apellidoPaciente;
    private String fecha;
    private String servicio;
    private Medico medico;
    private String hora;

    public Cita() {
    }

    public Cita(String numeroCita, String nombrePaciente, String apellidoPaciente, String fecha, String servicio, Medico medico, String hora) {
        this.numeroCita = numeroCita;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.fecha = fecha;
        this.servicio = servicio;
        this.medico = medico;
        this.hora = hora;
    }

    public String getNumeroCita() {
        return numeroCita;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getServicio() {
        return servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getHora() {
        return hora;
    }

    public void setNumeroCita(String numeroCita) {
        this.numeroCita = numeroCita;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
