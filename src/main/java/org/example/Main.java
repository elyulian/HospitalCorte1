package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        List<Paciente> pacientes = new ArrayList<>();
        List<Medico> medicos = new ArrayList<>();
        List<Cita> citas = new ArrayList<>();

        Paciente paciente1 = new Paciente(123456, "Andres", "Gomez", "01/01/2000", "cll 8 #1a", "Bogota", "HC123", "Masculino", "O+", new String[]{"Penicilina", "Aspirina"});
        Paciente paciente2 = new Paciente(654321, "Maria", "Lopez", "02/02/1995", "cll 9 #2b", "Medellin", "HC456", "Femenino", "A+", new String[]{"Ibuprofeno"});
        Paciente paciente3 = new Paciente(789012, "Juan", "Perez", "03/03/1988", "cll 10 #3c", "Cali", "HC789", "Masculino", "B+", new String[]{"Ninguno"});

        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);

        Medico medico1 = new Medico(1004233, "Julian", "Herrera", "09/09/2001", "cll 8 #1a", "Madrid",101 ,"Cirujano", "Cirujia", 315, 25000000, 10);
        Medico medico2 = new Medico(32130, "Sebastian", "Ortiz", "09/09/2001", "cll 8 #1a", "Madrid",102, "Oftamologo", "Oftamologia", 316, 26000000, 10);
        Medico medico3 = new Medico(230123, "carlos", "romero", "09/09/2001", "cll 8 #1a", "Madrid",103 ,"Cirujano", "Cirujia", 317, 25000000, 10);
        Medico medico4 = new Medico(230123, "Marco", "Ceballos", "09/09/2001", "cll 8 #1a", "Madrid",104 ,"Odontologo", "Odontogia", 319, 25000000, 10);

        medicos.add(medico1);
        medicos.add(medico2);
        medicos.add(medico3);
        medicos.add(medico4);

        Cita cita1 = new Cita("CIT001", "Andres", "Gomez", "15/10/2023", "Consulta General", "10:00 AM", 101);
        Cita cita2 = new Cita("CIT002", "Maria", "Lopez", "16/10/2023", "Consulta General", "11:00 AM", 102);
        Cita cita3 = new Cita("CIT003", "Juan", "Perez", "17/10/2023", "Consulta General", "12:00 PM", 101);

        citas.add(cita1);
        citas.add(cita2);
        citas.add(cita3);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        String especialidad;

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
                                    System.out.println("Ingrese el numero DNI:");
                                    int dni = scanner.nextInt();
                                    empleadoPlanilla.setNumeroDni(dni);
                                    System.out.println("Ingrese el nombre:");
                                    String nombre = scanner.next();
                                    empleadoPlanilla.setNombre(nombre);
                                    System.out.println("Ingrese el apellido:");
                                    String apellido = scanner.next();
                                    empleadoPlanilla.setApellido(apellido);
                                    System.out.println("Ingrese la fecha de nacimiento: ");
                                    String fechaNacimiento = scanner.next();
                                    empleadoPlanilla.setFechaNacimiento(fechaNacimiento);
                                    System.out.println("Ingrese la direccion: ");
                                    String direccion = scanner.next();
                                    empleadoPlanilla.setDireccion(direccion);
                                    System.out.println("Ingrese la ciudad: ");
                                    String ciudad = scanner.next();
                                    empleadoPlanilla.setCiudad(ciudad);
                                    System.out.println("Ingrese el numero de empleado: ");
                                    int numeroEmpleado = scanner.nextInt();
                                    empleadoPlanilla.setNumeroEmpleado(numeroEmpleado);
                                    System.out.println("Ingrese el cargo: ");
                                    String cargo = scanner.next();
                                    empleadoPlanilla.setCargo(cargo);
                                    System.out.println("Ingrese el salario: ");
                                    double salario = scanner.nextDouble();
                                    empleadoPlanilla.setSalario(salario);
                                    System.out.println("Ingrese el porcentaje adicional por hora extra: ");
                                    double honorariosPorHora = scanner.nextDouble();
                                    empleadoPlanilla.setHonorariosPorHora(honorariosPorHora);
                                    System.out.println("Ingrese el numero de horas totales trabajadas: ");
                                    int numeroHorasTotalesTrabajadas = scanner.nextInt();
                                    empleadoPlanilla.setNumeroHorasTotalesTrabajadas(numeroHorasTotalesTrabajadas);
                                    System.out.println("Ingrese la fecha de termino del contrato: ");
                                    System.out.println("Ingrese los Honorarios por hora");
                                    double honorarios = scanner.nextDouble();
                                    empleadoPlanilla.setHonorariosPorHora(honorarios);


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
                    System.out.println("Creando cita medica...");
                    Cita cita = new Cita();
                    System.out.println("Ingrese numero de DNI del paciente: ");
                    int dniPaciente = scanner.nextInt();

                    do {
                        boolean pacienteEncontrado = false;
                        for (Paciente p : pacientes) {
                            if (p.getNumeroDni() == dniPaciente) {
                                pacienteEncontrado = true;
                                cita.setNombrePaciente(p.getNombre());
                                cita.setApellidoPaciente(p.getApellido());
                                System.out.println("Ingrese la fecha de la cita ");
                                String fechaCita = scanner.next();
                                cita.setFecha(fechaCita);
                                System.out.println("Ingrese la hora de la cita: ");
                                String horaCita = scanner.next();
                                cita.setHora(horaCita);
                                System.out.println("Ingrese la especialidad para la cita: ");
                                 especialidad = scanner.next();
                                System.out.println("Medicos disponibles");
                                for (Medico medico : medicos) {
                                    if (medico.getEspecialidad().equalsIgnoreCase(especialidad)) {
                                        System.out.println("Médico: " + medico.getNombre() + " " + medico.getApellido() + ", Especialidad: " + medico.getEspecialidad() +" Codigo: "+medico.getCodigoMedico());
                                    }
                                }
                                System.out.println("Ingrese el codigo del medico: ");
                                int codMedico = scanner.nextInt();
                                cita.setCodMedico(codMedico);
                                citas.add(cita);
                                break;
                            }
                        }
                        if (!pacienteEncontrado) {
                            System.out.println("Paciente no encontrado. Ingrese un DNI válido: ");
                            dniPaciente = scanner.nextInt();
                        } else {
                            break;
                        }
                    } while (true);


                    break;
                case 3:
                    System.out.println("Ingrese la especialidad a buscar: ");
                    especialidad = scanner.next();
                    System.out.println("Medicos disponibles");
                    for (Medico medico : medicos) {
                        if (medico.getEspecialidad().equalsIgnoreCase(especialidad)) {
                            System.out.println("Médico: " + medico.getNombre() + " " + medico.getApellido() + ", Especialidad: " + medico.getEspecialidad());
                        }
                    }
                    break;
                case 4:
                    for (Medico c: medicos){
                        System.out.println(c.getNombre()+" "+c.getApellido()+" Codigo: "+c.getCodigoMedico());
                    }
                    System.out.println("Ingrese el código del médico para ver sus pacientes atendidos: ");
                    int codigoMedico = scanner.nextInt();

                    for (Cita c : citas) {
                        if (c.getCodMedico() == codigoMedico) {
                            System.out.println("Paciente " + c.getNombrePaciente() + "- " + c.getApellidoPaciente());
                        }
                    }


                    break;
                default:
                    System.out.println("Opción no válida");

            }
        } while (opcion != 5);

    }
}

