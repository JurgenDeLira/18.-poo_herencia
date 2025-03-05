package org.jdelira.ejemplo;

import org.jdelira.pooherencia.Alumno;
import org.jdelira.pooherencia.AlumnoInternacional;
import org.jdelira.pooherencia.Persona;
import org.jdelira.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno("Jorge", "De Lira", 30, "Instituto Nacional");
        alumno.setNotaIngles(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("jorge@correo.com");

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Jimbo", "Schulze", "Alemania");
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
        System.out.println("========================");
        System.out.println(persona);
    }
}
