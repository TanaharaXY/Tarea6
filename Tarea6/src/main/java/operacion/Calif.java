/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacion;


/**
 *
 * @author Fredo
 */
public class Calif {

    private String nombre;
    private double[] calificaciones;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getCalificacion() {
        return this.calificaciones;
    }

    public void setCalificacion(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public double getPromedio() {

        double suma = 0;
        for (int i = 0; i < this.calificaciones.length; i++) {
            suma += calificaciones[i];

        }
        return suma / this.calificaciones.length;

    }

    public char getCalificacionFinal(double promedio) {

        
        if (promedio >= 51 && promedio <= 60) 
            return 'E';
        
        if (promedio >= 61 && promedio <= 70) 
            return 'D';
        
        if (promedio >= 71 && promedio <= 80) 
            return 'C';
        
        if (promedio >= 81 && promedio <= 90) 
            return 'B';
        
        if (promedio >= 91 && promedio <= 100) 
            return 'A';
        

        return 'F';

    }
    
    public  void imprimeResultado() {
        
        System.out.println("Nombre del alumno:"+this.getNombre());
        for (int i = 0; i < this.calificaciones.length; i++) {
            System.out.println("Calificacion"+(i+1)+":"+this.calificaciones[i]);        
        
        }
        double promedio = this.getPromedio();
        System.out.println("Promedio:" + promedio);
        System.out.println("Calificacion final:" + this.getCalificacionFinal(promedio));
    
    }

}

