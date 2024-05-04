import java.util.Scanner;

import modelo.Pelicula;
import modelo.Serie;

public class Menu {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            String menu = """
                    Bienvenido a Screenmatch
                    1) Registrar nueva Película
                    2) Registrar nueva Seríe

                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la película: ");
                    String nombrePelicula = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película: ");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos de la película: ");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombrePelicula);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.mostrarFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la Serie: ");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la seríe: ");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el número de temporadas de la seríe: ");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese el número de episodios por temporada: ");
                    int episodiosTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Tiempo de duración por episodio: ");
                    int duracionPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    Serie serieUsuario = new Serie();
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosTemporada);
                    serieUsuario.setMinutosPorEpisodio(duracionPorEpisodio);
                    serieUsuario.mostrarFichaTecnica();
                    break;
                case 9: 
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("*".repeat(40));
                    System.out.println("El número ingresado es incorrecto!");
                    System.out.println("*".repeat(40));
                    break;
            }
        }
    }
}
