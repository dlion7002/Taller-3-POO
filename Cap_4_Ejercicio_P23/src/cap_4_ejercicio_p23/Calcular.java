/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_4_ejercicio_p23;

/**
 *
 * @author ASUS
 */
public class Calcular {
    private double a;
    private double b;
    private double c;
    private double solucion1;
    private double solucion2;

    // Constructor para inicializar los coeficientes de la ecuación
    public Calcular(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calcularSoluciones(); // Llamada para inicializar las soluciones
    }

    // Método para calcular las soluciones de la ecuación
    private void calcularSoluciones() {
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        } else if (discriminante == 0) {
            solucion1 = solucion2 = -b / (2 * a);
        } else {
            solucion1 = -1;
            solucion2 = -1;
        }
    }

    // Métodos para obtener las soluciones
    public double getSolucion1() {
        return solucion1;
    }

    public double getSolucion2() {
        return solucion2;
    }
}
