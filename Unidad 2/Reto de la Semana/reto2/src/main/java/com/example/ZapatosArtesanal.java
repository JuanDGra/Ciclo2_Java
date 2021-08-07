package com.example;

public class ZapatosArtesanal extends Zapatos {
    
    // CONSTANTES
    private final static int TAMAÑO = 40;

    // ATRIBUTOS
    private int tamaño;

    // CONSTRUCTORES

    public ZapatosArtesanal() {
        tamaño = TAMAÑO;
    }

    public ZapatosArtesanal(int tamaño) {
        this.tamaño = tamaño;
    }

    public ZapatosArtesanal(String marca, String tipo_material, int precioBase, int tamaño) {
        super(marca, tipo_material, precioBase);
        this.tamaño = tamaño;    }

    // METODOS
    public double calcularPrecio() {
        double precioFinal = super.calcularPrecio();
        if (tamaño < 40) {
            precioFinal = precioFinal + 10000;
        } else {
            precioFinal = precioFinal + 4500;
        }
        return precioFinal;
    }

}
