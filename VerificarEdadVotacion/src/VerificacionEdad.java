/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class VerificacionEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la edad del usuario
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        // Verificar si el usuario es elegible para votar
        if (edad >= 18) {
            System.out.println("Usted es elegible para votar.");
        } else {
            System.out.println("Usted no es elegible para votar.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}