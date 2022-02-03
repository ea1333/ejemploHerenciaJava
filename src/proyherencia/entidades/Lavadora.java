/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia.entidades;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lavadora extends Electrodomestico {
    private Double carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Double carga, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString() + ", carga=" + carga + '}';
    }
    
    @Override
    public void crear() {
        Scanner sc = new Scanner(System.in);
        super.crear();//Llama al método de la clase padre Electrodomestico
        System.out.println("Carga");
        this.setCarga(sc.nextDouble());
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.getCarga() > 30) {
            this.setPrecio(this.getPrecio() + 500);
        }
    }
    
}
