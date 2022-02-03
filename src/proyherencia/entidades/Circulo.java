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
public class Circulo implements CalculosFormas {
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(this.getRadio(), this.getDiametro());
    }

    @Override
    public Double calcularPerimetro() {
        return Math.PI * this.getDiametro();
    }
    
}
