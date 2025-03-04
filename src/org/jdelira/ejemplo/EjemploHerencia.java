package org.jdelira.ejemplo;

import org.jdelira.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("======= Creando la instancia de la clase Alumno =======");
        Alumno alumno = new Alumno();
        alumno.setNombre("Jorge");
        alumno.setApellido("De Lira");
        ((Alumno)alumno).setInstitucion("Instituto Nacional");
        alumno.setNotaIngles(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);

        System.out.println("======= Creando la instancia de la clase AlumnoInternacional =======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Jimbo");
        alumnoInt.setApellido("Gallagher");
        alumnoInt.setPais("Estados unidos");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaIngles(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        System.out.println("======= Creando la instancia de la clase Profesor =======");
        Profesor profesor = new Profesor();
        profesor.setNombre("Johana");
        profesor.setApellido("Medina");
        profesor.setAsignatura("Matemáticas");

        System.out.println("======= - =======");
        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion() ); // se hace un cast para poder invocar
        System.out.println(alumnoInt.getNombre()
        + " " + alumno.getApellido()
        + " " + alumno.getInstitucion());
        System.out.println("Profesor " + profesor.getAsignatura()
        + ": " + profesor.getNombre()
        + " " + profesor.getApellido()
        + ", " + alumnoInt.getPais());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
