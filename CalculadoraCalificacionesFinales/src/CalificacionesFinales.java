/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class CalificacionesFinales {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar notas de parciales
        double parciales = solicitarNota(scanner, "Ingrese la nota de parciales (0-100): ");
        // Solicitar nota del proyecto
        double proyecto = solicitarNota(scanner, "Ingrese la nota del proyecto (0-100): ");
        // Solicitar nota del examen final
        double examenFinal = solicitarNota(scanner, "Ingrese la nota del examen final (0-100): ");

        // Calcular la calificación final
        double notaFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
        
        // Imprimir el promedio final
        System.out.printf("La calificación final es: %.2f%n", notaFinal);
        
        // Cerrar el scanner
        scanner.close();
    }

    // Método para solicitar y validar la entrada de una nota
    private static double solicitarNota(Scanner scanner, String mensaje) {
        double nota;
        while (true) {
            System.out.print(mensaje);
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 100) {
                break; // Salir del bucle si la nota es válida
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 100. Intente de nuevo.");
            }
        }
        return nota;
    }
}
