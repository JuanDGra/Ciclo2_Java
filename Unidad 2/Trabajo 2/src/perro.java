public class perro {
    // Atributos
     // public, private. protected
    private boolean perseguirCola = true;
    private String orinar;
    private String nombre;
    private int edad;

    // Constructor -- Es el método llamado cuando se crea una nueva
    // def __init__():
    public perro(String nombre, int edad, String orinar, boolean perseguirCola) {
        this.nombre = nombre;
        this.edad = edad;
        this.orinar = orinar;
        this.perseguirCola = perseguirCola;
    }

    // Métodos


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getOrinar() {
        return orinar;
    }
    public void setOrinar(String orinar) {
        this.orinar = orinar;
    }
    public boolean isPerseguirCola() {
        return perseguirCola;
    }
    public void setPerseguirCola(boolean perseguirCola) {
        this.perseguirCola = perseguirCola;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
