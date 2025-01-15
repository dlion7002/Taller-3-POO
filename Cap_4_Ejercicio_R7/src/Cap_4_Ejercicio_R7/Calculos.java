/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap_4_Ejercicio_R7;

/**
 *
 * @author ASUS
 */
public class Calculos {
    double a, b;
    
    Calculos(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public String ans() {
        if (a > b) {
    return (a + " es mayor que " + b);
    }
        else if (a == b) {
    return (a + " es igual que " + b);
    }
        else {
    return (a + " es menor que " + b);
        }
    }
}
