package co.reto.semana1;

public class App 
{
    public static void main( String[] args ) {
        ProyeccionPublica resultadoInversion = new ProyeccionPublica();
        System.out.println(resultadoInversion.compararInversion(12,2000000,5));
        ProyeccionPublica resultadoInversion2 = new ProyeccionPublica();
        System.out.println(resultadoInversion2.compararInversion(11,2005000.0,4));
    }
}
