package org.example;

public class EmpleadoPlanilla extends Empleado {
    /*Empleado: número de empleado, cargo, salario, fecha de contratación.
    *
    * Empleado por Planilla: salario mensual, porcentaje adicional por hora extra.
Empleado Eventual: honorarios por hora, número de horas totales (normales + extras) trabajadas,
*  fecha de término del contrato.
    *
    *
    * */
    private double honorariosPorHora;
    private int numeroHorasTotalesTrabajadas;


    public EmpleadoPlanilla() {
        super();
    }


    public EmpleadoPlanilla(int numeroDni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudad, int numeroEmpleado, String cargo, double salario, double honorariosPorHora, int numeroHorasTotalesTrabajadas, String fechaTerminoContrato) {
        super(numeroDni, nombre, apellido, fechaNacimiento, direccion, ciudad, numeroEmpleado, cargo, salario);
        this.honorariosPorHora = honorariosPorHora;
        this.numeroHorasTotalesTrabajadas = numeroHorasTotalesTrabajadas;
    }

    public void setHonorariosPorHora(double honorariosPorHora) {
        this.honorariosPorHora = honorariosPorHora;
    }

    public void setNumeroHorasTotalesTrabajadas(int numeroHorasTotalesTrabajadas) {
        this.numeroHorasTotalesTrabajadas = numeroHorasTotalesTrabajadas;
    }



    public double getHonorariosPorHora() {
        return honorariosPorHora;
    }

    public int getNumeroHorasTotalesTrabajadas() {
        return numeroHorasTotalesTrabajadas;
    }


    @Override
    public String toString() {
        return "EmpleadoPlanilla{" +
                "honorariosPorHora=" + honorariosPorHora +
                ", numeroHorasTotalesTrabajadas=" + numeroHorasTotalesTrabajadas +
                '}';
    }
}
