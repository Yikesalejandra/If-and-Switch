/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ConvertidorTemperatura {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la temperatura en Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Mostrar el menú de opciones
        System.out.println("Seleccione la opción de conversión:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        // Variable para almacenar la temperatura convertida
        double temperaturaConvertida;

        // Realizar la conversión usando switch
        switch (opcion) {
            case 1: // Convertir a Fahrenheit
                temperaturaConvertida = (celsius * 9/5) + 32;
                System.out.printf("La temperatura en Fahrenheit es: %.2f°F%n", temperaturaConvertida);
                break;
            case 2: // Convertir a Kelvin
                temperaturaConvertida = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin es: %.2f K%n", temperaturaConvertida);
                break;
            default:
                System.out.println("Opción inválida. Por favor seleccione 1 o 2.");
                break;
        }

        // Cerrar el scanner
        scanner.close();
    }
}