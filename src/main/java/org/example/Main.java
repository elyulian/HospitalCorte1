package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();


        Medico medico1 = new Medico(1004233, "Julian", "Herrera", "09/09/2001", "cll 8 #1a", "Madrid", "Cirujano", "Cirujia", 315, 25000000, 10);
        Medico medico2 = new Medico(32130, "Sebastian", "Ortiz", "09/09/2001", "cll 8 #1a", "Madrid", "Oftamologo", "Oftamologia", 316, 26000000, 10);
        Medico medico3 = new Medico(230123, "carlos", "romero", "09/09/2001", "cll 8 #1a", "Madrid", "Cirujano", "Cirujia", 317, 25000000, 10);

        medicos.add(medico1);
        medicos.add(medico2);
        medicos.add(medico3);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------ Hospital-------");
            System.out.println("1. Registrar datos (Empleado - Paciente - Medico)");
            System.out.println("2. Registrar cita medica");
            System.out.println("3. Listar Medicos por especialidad");
            System.out.println("4. Listar los datos (nombres y apellidos) de los pacientes atendidos por un médico determinado (ingresando su código).");
            System.out.println("5. Salir");
            System.out.println("\n Ingrese una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Registrar datos");
                    System.out.println("Tipo de usuario que desea registrar?");
                    System.out.println("1. Empleado");
                    System.out.println("2. Paciente");
                    System.out.println("3. Medico");
                    switch (opcion) {
                        case 1:
                            System.out.println("Que tipo de empleado desea registrar?");
                            System.out.println("1. Planilla");
                            System.out.println("2. Eventual");
                            opcion = scanner.nextInt();
                            switch (opcion) {
                                case 1:
                                    EmpleadoPlanilla empleadoPlanilla = new EmpleadoPlanilla();
                                    empleados.add(empleadoPlanilla);
                                    break;
                                case 2:
                                    EmpleadoEventual empleadoEventual = new EmpleadoEventual();
                                    empleados.add(empleadoEventual);

                                    break;
                                default:
                                    System.out.println("Tipo de empleado no valido");
                            }
                            break;
                        case 2:
                            Paciente paciente = new Paciente();
                            pacientes.add(paciente);

                            break;
                        case 3:
                            Medico medico = new Medico();
                            medicos.add(medico);
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese la especialidad a buscar: ");
                    String especialidad = scanner.next();
                    for (Medico medico : medicos) {
                        if (medico.getEspecialidad().equalsIgnoreCase(especialidad)) {
                            System.out.println("Médico: " + medico.getNombre() + " " + medico.getApellido() + ", Especialidad: " + medico.getEspecialidad());
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        } while (opcion != 5);

    }
}

