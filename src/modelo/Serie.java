package modelo;

public class Serie extends Pelicula {
    private int temporada;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporada() {
        return temporada;
    }
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public void mostrarFichaTecnica() {
        System.out.println("***** FICHA TÉCNICA DE LA SERIE *****");
        System.out.println("Nombre de la serie: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Tiempo de duración por episodio: " + getMinutosPorEpisodio() + " minutos");
        System.out.println("_".repeat(30));
    }
}

