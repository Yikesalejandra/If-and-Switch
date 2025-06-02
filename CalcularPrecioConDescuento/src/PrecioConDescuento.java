/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class PrecioConDescuento {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el precio original del producto
        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();
        
        // Inicializar variable para el precio final
        double precioFinal;
        
        // Calcular el precio final basado en el descuento
        if (precioOriginal <= 100) {
            precioFinal = precioOriginal; // Sin descuento
        } else if (precioOriginal > 100 && precioOriginal <= 200) {
            precioFinal = precioOriginal * 0.90; // 10% de descuento
        } else if (precioOriginal > 200 && precioOriginal <= 500) {
            precioFinal = precioOriginal * 0.80; // 20% de descuento
        } else {
            precioFinal = precioOriginal * 0.75; // 25% de descuento
        }

        // Imprimir el precio final
        System.out.printf("El precio final después del descuento es: %.2f%n", precioFinal);

        // Cerrar el scanner
        scanner.close();
    }
}