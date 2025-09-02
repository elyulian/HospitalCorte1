package org.example;

public class EmpleadoEventual extends Empleado {
    /*Empleado: número de empleado, cargo, salario, fecha de contratación.
    *
    *
    *
    * Empleado por Planilla: salario mensual, porcentaje adicional por hora extra.
Empleado Eventual: honorarios por hora, número de horas totales (normales + extras) trabajadas,
*  fecha de término del contrato.
    *
    *
    * */

    private String SalarioMensual;
    private double porcentajeAdicionalPorHoraExtra;


    public EmpleadoEventual() {
        super();
    }


    public EmpleadoEventual(int numeroDni, String nombre, String apellido, String fechaNacimiento, String direccion, String ciudad, int numeroEmpleado, String cargo, double salario, String salarioMensual, double porcentajeAdicionalPorHoraExtra) {
        super(numeroDni, nombre, apellido, fechaNacimiento, direccion, ciudad, numeroEmpleado, cargo, salario);
        SalarioMensual = salarioMensual;
        this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
    }

    public String getSalarioMensual() {
        return SalarioMensual;
    }

    public double getPorcentajeAdicionalPorHoraExtra() {
        return porcentajeAdicionalPorHoraExtra;
    }

    public void setSalarioMensual(String salarioMensual) {
        SalarioMensual = salarioMensual;
    }

    public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
        this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
    }

    @Override
    public String toString() {
        return "EmpleadoEventual{" +
                "SalarioMensual='" + SalarioMensual + '\'' +
                ", porcentajeAdicionalPorHoraExtra=" + porcentajeAdicionalPorHoraExtra +
                '}';
    }
}
