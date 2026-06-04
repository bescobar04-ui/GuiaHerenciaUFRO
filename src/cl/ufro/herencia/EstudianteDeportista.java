package cl.ufro.herencia;

public final class EstudianteDeportista extends Estudiante {
    private String deportePractica;
    private int horasEntrenamiento;

    public EstudianteDeportista(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela, String deportePractica, int horasEntrenamiento) {
        super(nombre, rut, edad, nivelAcademico, direccionEscuela);
        this.deportePractica = deportePractica;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Deporte: " + deportePractica + ", Entrenamiento: " + horasEntrenamiento + " hrs/semana";
    }

    @Override
    protected String metodo() {
        return "Instancia perteneciente a la clase: EstudianteDeportista";
    }
}