import modelo.Pelicula;
import modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setTiempoDeDuracionEnMinutos(120);
        matrix.setFechaDeLanzamiento(1999);
        matrix.setDirector("Lana Wachowski & Lilly Wachowski");
        
        /*Sin utilizar las buenas practicas de POO*/
        // System.out.println("El nombre de la película es: " + matrix.nombre);
        // System.out.println("La duración en minutos es: " + matrix.tiempoDeDuracionEnMinutos);
        // System.out.println("La fecha de lanzamiento es: " + matrix.fechaDeLanzamiento);
        // System.out.println("_".repeat(30));

        // Pelicula encanto = new Pelicula();
        // encanto.nombre = "Encanto";
        // encanto.tiempoDeDuracionEnMinutos = 120;
        // encanto.fechaDeLanzamiento = 2022;

        // encanto.mostrarFichaTecnica();
        matrix.mostrarFichaTecnica();

        Serie papel = new Serie();
        papel.setNombre("La casa de papel");
        papel.setFechaDeLanzamiento(2020);
        papel.setTemporadas(4);
        papel.setEpisodiosPorTemporada(10);
        papel.setMinutosPorEpisodio(60);
        papel.mostrarFichaTecnica();
    }
}