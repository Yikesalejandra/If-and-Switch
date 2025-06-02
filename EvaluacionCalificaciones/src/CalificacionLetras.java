/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class CalificacionLetras {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la calificación numérica
        System.out.print("Ingrese la calificación numérica (0-100): ");
        double calificacion = scanner.nextDouble();
        
        // Verificar los rangos y asignar la letra correspondiente
        char letra;
        
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        } else if (calificacion < 60 && calificacion >= 0) {
            letra = 'F';
        } else {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
            scanner.close();
            return; // Salir del programa si la calificación es inválida
        }

        // Imprimir la letra de la calificación
        System.out.println("La calificación en letra es: " + letra);
        
        // Cerrar el scanner
        scanner.close();
    }
}