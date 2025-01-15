/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap_3_ejerciciop19;

/**
 *
 * @author ASUS
 */
public class Calcular {
    private double longitudLado;
    private double perimetro;
    private double altura;
    private double area;

    public Calcular(double longitudLado) {
        this.longitudLado = longitudLado;
        calcularPropiedades();
    }

    private void calcularPropiedades() {
        perimetro = 3 * longitudLado;
        altura = (Math.sqrt(3) * longitudLado) / 2;
        area = (Math.sqrt(3) * (longitudLado * longitudLado)) / 4;
    }

    public double obtenerPerimetro() {
        return perimetro;
    }

    public double obtenerAltura() {
        return altura;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerLongitudLado() {
        return longitudLado;
    }

    public void establecerLongitudLado(double longitudLado) {
        this.longitudLado = longitudLado;
        calcularPropiedades();
    }
}
