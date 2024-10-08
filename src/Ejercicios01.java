//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicios01 {

    // Ejercicio 2: Conversor de Euros a Pesetas
    public static String ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros a convertir a pesetas: ");
        int euros = scanner.nextInt();
        double pesetas = 166.386 * euros; // 1 euro = 166.386 pesetas
        return String.format("%.2f euros son %.2f pesetas.", (double) euros, pesetas);
    }

    // Ejercicio 5: Calcular el área de un rectángulo
    public static String ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura; // Área del rectángulo
        return String.format("El área del rectángulo es %.2f.", area);
    }

    // Ejercicio 8: Calcular el salario semanal
    public static String ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();
        double salario = horasTrabajadas * 12; // 12 euros la hora
        return String.format("El salario semanal es %.2f euros.", salario);
    }

    // Ejercicio 11: Conversor de Kb a Mb
    public static String ejercicio11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de Kb a convertir a Mb: ");
        double kilobytes = scanner.nextDouble();
        double megabytes = kilobytes / 1024; // 1 Mb = 1024 Kb
        return String.format("%.2f Kb son %.2f Mb.", kilobytes, megabytes);
    }

    public static void main(String[] args) {
        // Llamar a los ejercicios
        System.out.println(ejercicio2());
        System.out.println(ejercicio5());
        System.out.println(ejercicio8());
        System.out.println(ejercicio11());
    }
}