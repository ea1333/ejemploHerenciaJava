/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia.entidades;

import proyherencia.interfaces.CalculosFormas;

/**
 *
 * @author user
 */
public class Rectangulo implements CalculosFormas {
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public Double calcularArea() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public Double calcularPerimetro() {
        return (this.getBase() + this.getAltura()) * 2;
    }
    
}
