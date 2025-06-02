/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la cantidad en pesos mexicanos
        System.out.print("Ingrese la cantidad en pesos mexicanos (MXN): ");
        double pesosMexicanos = scanner.nextDouble();
        
        // Mostrar el menú de opciones para la conversión
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        // Variable para almacenar el resultado de la conversión
        double resultado;

        // Realizar la conversión usando switch
        switch (opcion) {
            case 1: // Dólar (USD)
                resultado = pesosMexicanos * 0.054; // Tasa de conversión
                System.out.printf("El equivalente en Dólares (USD) es: %.2f USD%n", resultado);
                break;
            case 2: // Euro (EUR)
                resultado = pesosMexicanos * 0.048; // Tasa de conversión
                System.out.printf("El equivalente en Euros (EUR) es: %.2f EUR%n", resultado);
                break;
            case 3: // Bath (THB)
                resultado = pesosMexicanos * 1.80; // Tasa de conversión
                System.out.printf("El equivalente en Bath (THB) es: %.2f THB%n", resultado);
                break;
            case 4: // Yen (JPY)
                resultado = pesosMexicanos * 7.25; // Tasa de conversión
                System.out.printf("El equivalente en Yenes (JPY) es: %.2f JPY%n", resultado);
                break;
            case 5: // Won (KRW)
                resultado = pesosMexicanos * 70.15; // Tasa de conversión
                System.out.printf("El equivalente en Wons (KRW) es: %.2f KRW%n", resultado);
                break;
            case 6: // Dólar Australiano (AUD)
                resultado = pesosMexicanos * 0.072; // Tasa de conversión
                System.out.printf("El equivalente en Dólares Australianos (AUD) es: %.2f AUD%n", resultado);
                break;
            case 7: // Sol (PEN)
                resultado = pesosMexicanos * 0.19; // Tasa de conversión
                System.out.printf("El equivalente en Soles (PEN) es: %.2f PEN%n", resultado);
                break;
            case 8: // Dólar Canadiense (CAD)
                resultado = pesosMexicanos * 0.073; // Tasa de conversión
                System.out.printf("El equivalente en Dólares Canadienses (CAD) es: %.2f CAD%n", resultado);
                break;
            case 9: // Bolívar (VES)
                resultado = pesosMexicanos * 22.87; // Tasa de conversión
                System.out.printf("El equivalente en Bolívares (VES) es: %.2f VES%n", resultado);
                break;
            case 10: // Peso Argentino (ARS)
                resultado = pesosMexicanos * 9.87; // Tasa de conversión
                System.out.printf("El equivalente en Pesos Argentinos (ARS) es: %.2f ARS%n", resultado);
                break;
            default:
                System.out.println("Opción inválida. Por favor seleccione un número del 1 al 10.");
                break;
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}