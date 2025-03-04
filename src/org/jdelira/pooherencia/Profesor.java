package org.jdelira.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: inicializando constructor...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos días soy el profesor de "
                + getAsignatura() + ", mi nombre es "
                + getNombre() + " " + getApellido();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura;
    }
}
