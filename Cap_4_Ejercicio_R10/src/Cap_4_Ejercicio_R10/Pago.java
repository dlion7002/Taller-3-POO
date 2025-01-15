/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cap_4_Ejercicio_R10;

/**
 *
 * @author ASUS
 */
public class Pago {
    double pat;
    double es;
    double pagmat = 50000;
    
    Pago(double pat, double es, double pagmat) {
        this.pat = pat;
        this.es = es;
        this.pagmat = pagmat;
    }
    
    public double valor_a_pagar() {
        if ((pat > 2000000) && (es > 3)) {
            pagmat = pagmat + pat * 0.03;
        }
        
        return pagmat;
    }
    
    public double obteneInscripcion(double inscripcion){
        return inscripcion;       
    }
    
    public String obtenerNombres(String nombre){
        return nombre;       
    }

}
