import java.util.Scanner;
import modelo.Pelicula;
import modelo.Serie;

public class Menu {
    public void mostrarMenu() {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcion != 9) {
            mostrarOpciones();
            opcion = obtenerOpcionValida(scanner);
            switch (opcion) {
                case 1:
                    registrarPelicula(scanner);
                    break;
                case 2:
                    registrarSerie(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("*".repeat(40));
                    System.out.println("El número ingresado es incorrecto!");
                    System.out.println("*".repeat(40));
                    break;
            }
        }
        scanner.close();
    }

    private void mostrarOpciones() {
        System.out.println("""
                Bienvenido a Screenmatch
                1) Registrar nueva Película
                2) Registrar nueva Serie
                9) Salir
                """);
    }

    private int obtenerOpcionValida(Scanner scanner) {
        int opcion;
        while (true) {
            System.out.println("Ingrese una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 9) {
                    break;
                }
            } else {
                scanner.next(); // Limpiar el buffer
            }
            System.out.println("Opción inválida, por favor intente nuevamente.");
        }
        scanner.nextLine(); // Limpiar el buffer
        return opcion;
    }

    private void registrarPelicula(Scanner scanner) {
        System.out.println("Ingrese el nombre de la película: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la película: ");
        int fechaDeLanzamiento = scanner.nextInt();
        System.out.println("Ingrese la duración en minutos de la película: ");
        int duracionEnMinutos = scanner.nextInt();
        Pelicula pelicula = new Pelicula(nombre, fechaDeLanzamiento, duracionEnMinutos);
        pelicula.mostrarFichaTecnica();
    }

    private void registrarSerie(Scanner scanner) {
        System.out.println("Ingrese el nombre de la Serie: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la serie: ");
        int fechaDeLanzamiento = scanner.nextInt();
        System.out.println("Ingrese el número de temporadas de la serie: ");
        int temporadas = scanner.nextInt();
        System.out.println("Ingrese el número de episodios por temporada: ");
        int episodiosPorTemporada = scanner.nextInt();
        System.out.println("Ingrese el tiempo de duración por episodio: ");
        int minutosPorEpisodio = scanner.nextInt();
        Serie serie = new Serie(nombre, fechaDeLanzamiento, temporadas, episodiosPorTemporada, minutosPorEpisodio);
        serie.mostrarFichaTecnica();
    }
}
