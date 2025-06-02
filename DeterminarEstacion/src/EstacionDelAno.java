/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class EstacionDelAno {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el número del mes
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = scanner.nextInt();
        
        // Variable para almacenar la estación
        String estacion;

        // Determinar la estación del año usando switch
        switch (mes) {
            case 1: // Enero
            case 2: // Febrero
            case 12: // Diciembre
                estacion = "Invierno";
                break;
            case 3: // Marzo
            case 4: // Abril
            case 5: // Mayo
                estacion = "Primavera";
                break;
            case 6: // Junio
            case 7: // Julio
            case 8: // Agosto
                estacion = "Verano";
                break;
            case 9: // Septiembre
            case 10: // Octubre
            case 11: // Noviembre
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido. Ingrese un número entre 1 y 12.";
                break;
        }

        // Imprimir la estación correspondiente
        System.out.println("La estación correspondiente es: " + estacion);
        
        // Cerrar el scanner
        scanner.close();
    }
}