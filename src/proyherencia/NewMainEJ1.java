/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia;

import proyherencia.entidades.*;

/**
 *
 * @author user
 */
public class NewMainEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal g = new Gato("Fernando", "Pescado", 4, "siamés");
        System.out.println(g.Alimentarse());//Sí, soy muy purista, este método NO es void!
        Perro p = new Perro("Mono", "Carne", 3, "Callejero");
        System.out.println(p.Alimentarse());
    }
    
}
