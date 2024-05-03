package modelo;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episodios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Tiempo de duración por episodio: " + getMinutosPorEpisodio() + " minutos");
        System.out.println("Total duración para ver la serie: " + getTemporadas() * getTemporadas() * getMinutosPorEpisodio() + " minutos");
        System.out.println("_".repeat(30));
    }
}

