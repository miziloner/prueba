package com.example.miziloner.hola.com.example.miziloner.hola.model;

/**
 * Created by miziloner on 13/01/16.
 */
public class Carro {

    private int numPuertas;
    private String marca;
    private String modelo;
    private String placas;

    public Carro() {
    }

    public Carro(int numPuertas, String marca, String modelo, String placas) {
        this.numPuertas = numPuertas;
        this.marca = marca;
        this.modelo = modelo;
        this.placas = placas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }
}
