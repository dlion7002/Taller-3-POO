/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_3_ejerciciop18;

/**
 *
 * @author ASUS
 */
public class Calcular {
    private int codigoEmpleado;
    private String nombreEmpleado;
    private double numHoras;
    private double valorHora;
    private double porcentajeRetencionFuente;

    public Calcular(int codigoEmpleado, String nombreEmpleado, double numHoras, double valorHora, double porcentajeRetencionFuente) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.numHoras = numHoras;
        this.valorHora = valorHora;
        this.porcentajeRetencionFuente = porcentajeRetencionFuente / 100; 
    }

    public double calcularSalarioBruto() {
        return numHoras * valorHora;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto * (1 - porcentajeRetencionFuente);
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
}
