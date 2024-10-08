import java.util.Random;

public class Ejercicios04 {

    // Ejercicio 1: Muestra la tirada de tres dados y su suma total
    public static void ejercicio1() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1; // Tirada del primer dado
        int dado2 = random.nextInt(6) + 1; // Tirada del segundo dado
        int dado3 = random.nextInt(6) + 1; // Tirada del tercer dado

        int suma = dado1 + dado2 + dado3; // Sumar los resultados

        System.out.printf("Tirada de dados: %d, %d, %d. Suma total: %d%n", dado1, dado2, dado3, suma);
    }

    // Ejercicio 4: Muestra 20 números enteros aleatorios entre 0 y 10
    public static void ejercicio4() {
        Random random = new Random();
        System.out.println("20 números aleatorios entre 0 y 10:");

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(11); // Generar número aleatorio entre 0 y 10
            System.out.print(numero + " ");
        }
        System.out.println(); // Nueva línea al final
    }

    // Ejercicio 7: Muestra tres apuestas de la quiniela para 14 partidos y el pleno al quince
    public static void ejercicio7() {
        Random random = new Random();
        String[] opciones = {"1", "X", "2"}; // Opciones de apuestas

        System.out.println("Apuestas de la quiniela:");
        for (int i = 0; i < 15; i++) { // 14 partidos + pleno al 15
            System.out.printf("Partido %2d: ", i + 1);
            for (int j = 0; j < 3; j++) {
                String apuesta = opciones[random.nextInt(3)]; // Seleccionar opción aleatoria
                System.out.print(apuesta + " ");
            }
            System.out.println(); // Nueva línea al final de cada partido
        }
    }

    // Ejercicio 10: Pinta diez líneas formadas por caracteres aleatorios
    public static void ejercicio10() {
        Random random = new Random();
        char[] caracteres = {'*', '-', '=', '.', '|', '@'}; // Caracteres posibles

        System.out.println("Líneas formadas por caracteres aleatorios:");
        for (int i = 0; i < 10; i++) { // Generar 10 líneas
            int longitud = random.nextInt(40) + 1; // Longitud aleatoria entre 1 y 40
            for (int j = 0; j < longitud; j++) {
                char caracterAleatorio = caracteres[random.nextInt(caracteres.length)]; // Seleccionar carácter aleatorio
                System.out.print(caracterAleatorio); // Imprimir carácter
            }
            System.out.println(); // Nueva línea al final de cada línea
        }
    }

    // Ejercicio 13: Simula la tirada de dos dados hasta que tengan el mismo valor
    public static void ejercicio13() {
        Random random = new Random();
        int dado1, dado2;

        do {
            dado1 = random.nextInt(6) + 1; // Tirada del primer dado
            dado2 = random.nextInt(6) + 1; // Tirada del segundo dado
            System.out.printf("Tirada: %d, %d%n", dado1, dado2); // Mostrar la tirada
        } while (dado1 != dado2); // Repetir hasta que ambos dados sean iguales

        System.out.println("¡Los dados han salido iguales!");
    }

    public static void main(String[] args) {
        // Llamar a los ejercicios
        ejercicio1();
        ejercicio4();
        ejercicio7();
        ejercicio10();
        ejercicio13(); // Llamar al ejercicio 13
    }
}