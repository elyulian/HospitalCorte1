package org.example;

public class Cita {

    private String numeroCita;
    private String nombrePaciente;
    private String apellidoPaciente;
    private String fecha;
    private String servicio;
    private String hora;
    private int codMedico;
    public Cita() {
    }

    public Cita(String numeroCita, String nombrePaciente, String apellidoPaciente, String fecha, String servicio, String hora, int codMedico) {
        this.numeroCita = numeroCita;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.fecha = fecha;
        this.servicio = servicio;
        this.hora = hora;
        this.codMedico = codMedico;
    }

    public int getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(int codMedico) {
        this.codMedico = codMedico;
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


    public void setHora(String hora) {
        this.hora = hora;
    }
}
