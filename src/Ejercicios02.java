//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Ejercicios02 {

    // Ejercicio 4: Calcular el salario semanal con horas extras
    public static String ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas en la semana: ");
        double horasTrabajadas = scanner.nextDouble();
        double salario;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * 12; // 12 euros la hora
        } else {
            double horasExtras = horasTrabajadas - 40;
            salario = (40 * 12) + (horasExtras * 16); // 16 euros la hora para horas extras
        }
        return String.format("El salario semanal es %.2f euros.", salario);
    }

    // Ejercicio 7: Calcular la media de tres notas
    public static String ejercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3; // Media de las notas
        return String.format("La media de las tres notas es %.2f.", media);
    }

    // Ejercicio 10: Determinar el horóscopo a partir del día y mes de nacimiento
    public static String ejercicio10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();
        String horoscopo;

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            horoscopo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            horoscopo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            horoscopo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            horoscopo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            horoscopo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            horoscopo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            horoscopo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            horoscopo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            horoscopo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            horoscopo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            horoscopo = "Sagitario";
        } else {
            horoscopo = "Capricornio"; // Para el mes de diciembre
        }
        return String.format("Tu horóscopo es %s.", horoscopo);
    }

    // Ejercicio 13: Ordenar tres números enteros introducidos por teclado
    public static String ejercicio13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Ordenar los números
        int mayor = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));
        int medio = num1 + num2 + num3 - mayor - menor; // El número que queda es el del medio

        return String.format("Los números ordenados son: %d, %d, %d.", menor, medio, mayor);
    }

    // Ejercicio 16: Preguntas para determinar la probabilidad de infidelidad
    public static String ejercicio16() {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;
        String respuesta;

        // Preguntas
        System.out.print("¿Tu pareja te esconde cosas? (verdadero/falso): ");
        respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("verdadero")) puntos += 3;

        System.out.print("¿Tu pareja ha cambiado mucho en los últimos tiempos? (verdadero/falso): ");
        respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("verdadero")) puntos += 3;

        System.out.print("¿Has notado que tu pareja está más distante? (verdadero/falso): ");
        respuesta = scanner.next();
        if (respuesta.equalsIgnoreCase("verdadero")) puntos += 3;

        // Aquí se pueden agregar más preguntas si se desea

        // Conclusión
        if (puntos >= 6) {
            return "Hay una alta probabilidad de infidelidad.";
        } else {
            return "No hay indicios claros de infidelidad.";
        }
    }

    // Ejercicio 19: Contar cuántos dígitos tiene un número entero
    public static String ejercicio19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero (hasta 5 dígitos): ");
        int numero = scanner.nextInt();
        int contador = 0;
        int numAbs = Math.abs(numero); // Tomar el valor absoluto

        // Contar los dígitos
        while (numAbs > 0) {
            numAbs /= 10; // Eliminar el último dígito
            contador++;
        }

        // Para el caso de 0
        if (numero == 0) {
            contador = 1;
        }

        return String.format("El número tiene %d dígitos.", contador);
    }
}