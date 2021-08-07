public class Factura4 {
    
    Zapatos [] lista;

    // CONSTRUCTORES
    public Factura4(Zapatos lista[]) {
        this.lista = lista;
    }

    // METODOS

    public void mostrarTotales() {
        double totalZapatos = 0;
        double totalZapatosNacional = 0;
        double totalZapatosArtesanal = 0;

        for (Zapatos zapato : lista) {
            double precio = zapato.calcularPrecio();
            totalZapatos += precio;
            if (zapato.getClass() == ZapatosNacional.class) {
                totalZapatosNacional += precio;
            } else if (zapato.getClass() == ZapatosArtesanal.class) {
                totalZapatosArtesanal += precio;
            }
        }
        System.out.println("El precio total de los zapatos es de " + totalZapatos);
        System.out.println("La suma del precio de los ZapatosNacional es de " + totalZapatosNacional);
        System.out.println("La suma del precio de los ZapatosArtesanal es de " + totalZapatosArtesanal);
    }

}
