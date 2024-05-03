package modelo;

public class Pelicula extends Titulo{
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void mostrarFichaTecnica() {
        System.out.println("***** FICHA TÉCNICA DE LA PELÍCULA *****");
        System.out.println("Nombre de la película: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos");
        System.out.println("EL director de la pelicula es: " + getDirector());
        System.out.println("_".repeat(30));
    }
}
