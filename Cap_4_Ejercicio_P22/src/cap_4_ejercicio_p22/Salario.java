/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_4_ejercicio_p22;

/**
 *
 * @author ASUS
 */
public class Salario {
    String nombre;
    double salarioHora;
    int horasTrabajadas;

    public Salario(String nombre, double salarioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioHora * horasTrabajadas;
    }

    public double obtenerSalario() {
        double salarioMensual = calcularSalarioMensual();
        if (salarioMensual > 450000) {
            return salarioMensual;  
        } else {
            return -1;  
        }
    }
}
