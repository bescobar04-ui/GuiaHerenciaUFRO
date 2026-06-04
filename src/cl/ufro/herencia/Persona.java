package cl.ufro.herencia; // Indica que la clase vive en este paquete

public abstract class Persona {
    public String nombre;
    public String rut;
    private int edad;

    public Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", RUT: " + rut + ", Edad: " + edad;
    }

    protected abstract String metodo();
}