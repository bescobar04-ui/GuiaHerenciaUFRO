package cl.ufro.herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("====== INICIANDO PRUEBAS DE HERENCIA (UFRO) ======\n");

        Estudiante estudianteRegular = new Estudiante(
                "Sofía", "21.456.789-0", 19, "Segundo Año", "Av. Francisco Salazar 01145"
        );

        EstudianteDeportista estudianteAtleta = new EstudianteDeportista(
                "Pablo", "20.123.456-7", 21, "Cuarto Año", "Av. Francisco Salazar 01145", "Vóleibol", 10
        );

        System.out.println(">> CASO I: Datos del Estudiante Regular:");
        System.out.println(estudianteRegular.toString());
        System.out.println("Identificador de clase: " + estudianteRegular.metodo());
        System.out.println("------------------------------------------------------------------");

        System.out.println(">> CASO II: Datos del Estudiante Deportista:");
        System.out.println(estudianteAtleta.toString());
        System.out.println("Identificador de clase: " + estudianteAtleta.metodo());
        System.out.println("------------------------------------------------------------------");
    }
}