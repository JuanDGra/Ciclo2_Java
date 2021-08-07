public class ProyeccionPublica {
    private int pTiempo;
    private double pCapital;
    private double pInteres;

    public ProyeccionPublica() {
        pTiempo = 0;
        pCapital = 0.0;
        pInteres = 0.0;
    }

    public String inversion(int pTiempo, double pCapital, double pInteres) {
    
        double resultado = 0;

        double interesSimple = pCapital * pInteres * pTiempo;

        double interesCompuesto = pCapital * (Math.pow(1 + pInteres, pTiempo) -1 );

        resultado = interesCompuesto - interesSimple;

        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + resultado;
    }

}
