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
public abstract class Electrodomestico {
    protected Double precio;
    protected String color;
    protected Character consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumo() {
        return consumo;
    }

    public void setConsumo(Character consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    public void comprobarColor(String color) {
        if ("blanco".equals(color) || "negro".equals(color) || "rojo".equals(color) || "azul".equals(color) || "gris".equals(color)) {
            this.setColor(color);
        } else {
            this.setColor("blanco");
        }
    }
    
    public void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            this.setConsumo(letra);
        } else {
            this.setConsumo('F');
        }
    }
    
    public void crear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio");
        this.setPrecio(sc.nextDouble());
        System.out.println("Color");
        this.comprobarColor(sc.next());
        System.out.println("Consumo");
        this.comprobarConsumoEnergetico(sc.next().charAt(0));
        System.out.println("Peso");
        this.setPeso(sc.nextDouble());
    }
    
    public void precioFinal() {
        Double p = 0.0;
        switch (this.getConsumo()) {
            case 'A':
                p += 1000;
                break;
            case 'B':
                p += 800;
                break;
            case 'C':
                p += 600;
                break;
            case 'D':
                p += 500;
                break;
            case 'E':
                p += 300;
                break;
            case 'F':
                p += 100;
                break;
        }
        if (this.getPeso() >= 1 && this.getPeso() < 19) {
            p += 100;
        } else if (this.getPeso() >= 20 && this.getPeso() <= 49) {
            p += 500;
        } else if (this.getPeso() >= 50 && this.getPeso() <= 79) {
            p += 800;
        } else if (this.getPeso() >= 80) {
            p += 1000;
        }
        this.setPrecio(this.getPrecio() + p);
    }
    
}
