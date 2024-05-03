import java.util.Scanner;

import modelo.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula();
        matrix.nombre = "Matrix";
        matrix.tiempoDeDuracionEnMinutos = 120;
        matrix.fechaDeLanzamiento = 1999;

        System.out.println("El nombre de la película es: " + matrix.nombre);
        System.out.println("La duración en minutos es: " + matrix.tiempoDeDuracionEnMinutos);
        System.out.println("La fecha de lanzamiento es: " + matrix.fechaDeLanzamiento);
        System.out.println("_".repeat(30));

        Pelicula encanto = new Pelicula();
        encanto.nombre = "Encanto";
        encanto.tiempoDeDuracionEnMinutos = 120;
        encanto.fechaDeLanzamiento = 2022;

        encanto.mostrarFichaTecnica();
        matrix.mostrarFichaTecnica();
    }
}