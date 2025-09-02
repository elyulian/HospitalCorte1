package org.example;

import java.util.Arrays;

public class Paciente extends Persona{

    public Paciente(){
        super();
    }
    public Paciente(int numeroDni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudad, String numeroHistoriaClinica, String sexo, String grupoSanguineo, String[] listaMedicamentosAlergicos) {
        super(numeroDni, nombre, apellido, fechaNacimiento, direccion, ciudad);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.listaMedicamentosAlergicos = listaMedicamentosAlergicos;
    }

    private String numeroHistoriaClinica;
    private String sexo;
    private String grupoSanguineo;
    private String[] listaMedicamentosAlergicos;

    public String getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }
    public void setNumeroHistoriaClinica(String numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    public String[] getListaMedicamentosAlergicos() {
        return listaMedicamentosAlergicos;
    }
    public void setListaMedicamentosAlergicos(String[] listaMedicamentosAlergicos) {
        this.listaMedicamentosAlergicos = listaMedicamentosAlergicos;
    }
    /**
     * Paciente:
     * número de historia clínica, sexo, grupo sanguíneo, lista de medicamentos a los que esalérgico.
     * */
    @Override
    public String toString() {
        return "Paciente{" +
                "numeroHistoriaClinica='" + numeroHistoriaClinica + '\'' +
                ", sexo='" + sexo + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", listaMedicamentosAlergicos=" + Arrays.toString(listaMedicamentosAlergicos) +
                '}';
    }
}
