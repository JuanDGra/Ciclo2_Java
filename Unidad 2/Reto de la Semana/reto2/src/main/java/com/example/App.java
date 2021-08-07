package com.example;

public class App {
    public static void main(String[] args) throws Exception {
        Zapatos zapatos[]=new Zapatos[5];
        zapatos[0]=new Zapatos("Maria", "Sintetico", 7500);
        zapatos[1]=new ZapatosNacional("Antioquia");
        zapatos[2]=new ZapatosArtesanal(30);
        zapatos[3]=new Zapatos();
        zapatos[4]=new ZapatosNacional("Valle");

        Factura4 solucion = new Factura4(zapatos);
        solucion.mostrarTotales();
    }
}
