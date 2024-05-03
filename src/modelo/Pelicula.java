package modelo;

public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    double evaluacion;
    boolean incluidoEnElPlanBasico;
    String sinopsis;
    int tiempoDeDuracionEnMinutos;

    //Void porque no retorna nada
    void mostrarFichaTecnica(){
        System.out.println("***** FICHA TÉCNICA *****");
        System.out.println("Nombre de la película. " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Tiempo de duración: " + tiempoDeDuracionEnMinutos + " minutos");
        System.out.println("_".repeat(30));
    }
}
