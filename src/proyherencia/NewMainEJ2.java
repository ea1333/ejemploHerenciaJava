/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia;

import proyherencia.entidades.Electrodomestico;
import proyherencia.entidades.Lavadora;
import proyherencia.entidades.Televisor;

/**
 *
 * @author user
 */
public class NewMainEJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Electrodomestico e = new Electrodomestico();
//        e.crear();
//        System.out.println(e.toString());
        Lavadora l = new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        System.out.println(l.toString());
        Televisor tv = new Televisor();
        tv.crearTele();
        tv.precioFinal();
        System.out.println(tv.toString());
    }
    
}
