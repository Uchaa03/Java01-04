//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicios03 {

    // Ejercicio 3: Muestra múltiplos de 5 de 0 a 100 usando un bucle do-while
    public static void ejercicio3() {
        int i = 0;
        System.out.println("Múltiplos de 5 de 0 a 100:");
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }

    // Ejercicio 6: Muestra números del 320 al 160 contando de 20 en 20 usando un bucle do-while
    public static void ejercicio6() {
        int i = 320;
        System.out.println("Números de 320 a 160 contando de 20 en 20:");
        do {
            System.out.println(i);
            i -= 20;
        } while (i >= 160);
    }

    // Ejercicio 9: Contar cuántos dígitos tiene un número introducido por teclado
    public static String ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        int contador = 0;

        // Contar dígitos
        while (numero != 0) {
            numero /= 10; // Eliminar el último dígito
            contador++;
        }

        // Para el caso de 0
        if (contador == 0) {
            contador = 1;
        }

        return String.format("El número tiene %d dígitos.", contador);
    }

    // Ejercicio 12: Mostrar los n primeros términos de la serie de Fibonacci
    public static void ejercicio12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce cuántos términos de Fibonacci quieres ver: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Términos de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int siguiente = a + b; // Sumar los dos últimos términos
            a = b;
            b = siguiente;
        }
    }

    // Ejercicio 15: Mostrar potencias de un número dado con exponentes entre 1 y n
    public static void ejercicio15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = scanner.nextInt();

        System.out.println("Potencias de " + base + ":");
        for (int i = 1; i <= exponente; i++) {
            double potencia = 1; // Resetear la potencia
            for (int j = 1; j <= i; j++) {
                potencia *= base; // Calcular la potencia
            }
            System.out.printf("%.0f ^ %d = %.0f%n", base, i, potencia);
        }
    }

    // Ejercicio 18: Obtener números enteros entre dos números introducidos y contar de 7 en 7
    public static void ejercicio18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Asegurarse de que los números son distintos
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
            return;
        }

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        System.out.println("Números entre " + menor + " y " + mayor + " contando de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }
    }

    // Ejercicio 21: Contar números introducidos, calcular la media de impares y el mayor de los pares
    public static void ejercicio21() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double sumaImpares = 0;
        int mayorPar = Integer.MIN_VALUE;
        int numero;

        System.out.println("Introduce números (introduce un número negativo para terminar):");
        do {
            numero = scanner.nextInt();
            if (numero >= 0) { // Solo contar números positivos
                contador++;
                if (numero % 2 != 0) { // Es impar
                    sumaImpares += numero;
                } else { // Es par
                    if (numero > mayorPar) {
                        mayorPar = numero; // Actualizar mayor par
                    }
                }
            }
        } while (numero >= 0);

        double mediaImpares = (contador > 0) ? (sumaImpares / contador) : 0;

        System.out.printf("Se introdujeron %d números.\n", contador);
        System.out.printf("La media de los impares es %.2f.\n", mediaImpares);
        System.out.printf("El mayor de los pares es %d.\n", mayorPar);
    }

    public static void main(String[] args) {
        // Llamar a los ejercicios
        ejercicio3();
        ejercicio6();
        System.out.println(ejercicio9());
        ejercicio12();
        ejercicio15();
        ejercicio18();
        ejercicio21();
    }
}