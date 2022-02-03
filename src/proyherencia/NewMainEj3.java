/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia;

import java.util.ArrayList;
import proyherencia.entidades.Electrodomestico;
import proyherencia.entidades.Lavadora;
import proyherencia.entidades.Televisor;

/**
 *
 * @author user
 */
public class NewMainEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList();
        lista.add(new Lavadora(30.00, 3500.00, "blanco", 'B', 50.00));
        lista.add(new Lavadora(75.00, 4000.00, "blanco", 'A', 100.00));
        lista.add(new Televisor(32.0, true, 4000.00, "negro", 'C', 3.0));
        lista.add(new Televisor(40.0, true, 6000.00, "negro", 'A', 5.0));
        Double precioTotal = 0.0;
        for (Electrodomestico elec : lista) {
            if (elec instanceof Lavadora) {
                elec.precioFinal();
                System.out.println(elec.toString());
            }
            if (elec instanceof Televisor) {
                elec.precioFinal();
                System.out.println(elec.toString());
            }
            precioTotal += elec.getPrecio();
        }
        System.out.println("Precio total: " + precioTotal);
    }
    
}
