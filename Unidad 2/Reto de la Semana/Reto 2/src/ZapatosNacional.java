public class ZapatosNacional extends Zapatos {
    
    // CONSTANTES
    private final static String REGION= "Cundinamarca";

    // ATRIBUTOS
    private String region;

    // CONSTRUCTORES
    public ZapatosNacional() {
        region = REGION;
    }

    public ZapatosNacional(String region) {
        this.region = region;
    }

    public ZapatosNacional(String marca, String tipo_material, int precioBase, String region) {
        super(marca, tipo_material, precioBase);
        this.region = region;
    }

    // METODOS
    public double calcularPrecio() {
        double precioFinal = super.calcularPrecio();
        if (region.equals("Cundinamarca")) {
            precioFinal += 10000;
        }
        return precioFinal;
    }

}
