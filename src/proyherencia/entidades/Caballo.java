/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia.entidades;

/**
 *
 * @author user
 */
public class Caballo extends Animal {

    public Caballo() {
        super();
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String Alimentarse() {
        return "Comida de caballo";
    }
    
}
