import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersión en Java");
        // System.out.println("Película Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        //no es un dato primitivo, es una clase que ya viene incluida en el lenguaje para manejar textos
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Esta incluido en el plan básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("La medía de la evaluación de " + nombre + " es: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película Popular en el momento");
        }else{
            System.out.println("Película Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Por favor ingresa la calificación de " + nombre);
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionesUsuario += notaPelicula;
        }
        System.out.println("La calificación de la pelicula por el usuario es: " + mediaEvaluacionesUsuario / 3);
    }
}
