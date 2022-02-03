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
public class Televisor extends Electrodomestico {
    private Double tamanio;
    private Boolean sintonizadorTDA;

    public Televisor() {
        super();
    }

    public Televisor(Double tamanio, Boolean sintonizadorTDA, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.tamanio = tamanio;
        this.sintonizadorTDA = sintonizadorTDA;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getSintonizadorTDA() {
        return sintonizadorTDA;
    }

    public void setSintonizadorTDA(Boolean sintonizadorTDA) {
        this.sintonizadorTDA = sintonizadorTDA;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + ", tamanio=" + tamanio + ", sintonizadorTDA=" + sintonizadorTDA + '}';
    }
    
    public void crearTele() {
        Scanner sc = new Scanner(System.in);
        super.crear();
        System.out.println("Tamaño");
        this.setTamanio(sc.nextDouble());
        System.out.println("Tiene sintonizador TDA? S/N");
        String TDA = sc.next();
        if ("s".equalsIgnoreCase(TDA)) {
            this.setSintonizadorTDA(true);
        } else {
            this.setSintonizadorTDA(false);
        }
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        Double p = 0.0;
        if (this.getTamanio() >= 40) {
            p += (this.getPrecio() * 0.3);
        }
        if (this.getSintonizadorTDA()) {
            p += 500;
        }
        this.setPrecio(this.getPrecio() + p);
    }
    
}
