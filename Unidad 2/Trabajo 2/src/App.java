public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        perro pepe = new perro("Pepe", 5, "Alza la pata", true);
        perro reina = new perro("Reina", 2, "Sentada", false);
        pepe.setNombre("Pepe");
        System.out.println(reina.getNombre());
        System.out.println(reina.getEdad());
        System.out.println(pepe.getNombre());
        System.out.println(pepe.getEdad());
    }
}
