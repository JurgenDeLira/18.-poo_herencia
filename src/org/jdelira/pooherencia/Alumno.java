package org.jdelira.pooherencia;

public class Alumno extends Persona{
    private String institucion;
    private double notaMatematicas;
    private double notaIngles;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializando constructor...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        this(nombre, apellido, edad); //aplica como super por tomar el de arriba
        this.institucion = institucion;
    }

    public Alumno (String nombre, String apellido, int edad,
                   String institucion, double notaMatematicas, double notaIngles,
                   double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematicas = notaMatematicas;
        this.notaIngles = notaIngles;
        this.notaHistoria = notaHistoria;
    }


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar();
        return saludar + " soy un alumno y mi nombre es " + getNombre();
    }
    public  double calcularPromedio(){
        //System.out.println("calcularPromedio " + Alumno.class.getCanonicalName());
        return (notaHistoria + notaIngles +notaMatematicas)/3;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaIngles=" + notaIngles +
                ", notaHistoria=" + notaHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
