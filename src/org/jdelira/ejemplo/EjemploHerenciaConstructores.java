package org.jdelira.ejemplo;

import org.jdelira.pooherencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("Jorge", "De Lira", 30, "Instituto Nacional");
        alumno.setNotaIngles(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("jorge@correo.com");

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Jimbo", "Gallagher", "Estados unidos");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaIngles(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("jimbo@correo.com");

        System.out.println("======= Creando la instancia de la clase Profesor =======");
        Profesor profesor = new Profesor("Johana", "Medina", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("johana@correo.com");

        System.out.println("======= - =======");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo datos en común del tipo Persona: ");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad:  " + persona.getEdad()
                + ", email: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota inglés: " + ((Alumno) persona).getNotaIngles());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }
        }
        // System.out.println(persona.getPais()); Aqui no funcionaria porque no estas haciendo un instanceof
        if(persona instanceof  Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("======= - =======");
    }
}
