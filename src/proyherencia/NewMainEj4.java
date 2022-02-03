/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia;

import proyherencia.entidades.Circulo;
import proyherencia.entidades.Rectangulo;

/**
 *
 * @author user
 */
public class NewMainEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo(4.0, 8.0);
        System.out.println(c);
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
        Rectangulo r = new Rectangulo(4.0, 8.0);
        System.out.println(r);
        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());
    }
    
}
