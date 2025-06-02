/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class Informacion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el nombre del artista, película o serie
        System.out.print("Ingrese el nombre de un artista, película o serie: ");
        String entrada = scanner.nextLine();
        
        // Determinar la información basándose en la entrada del usuario
        switch (entrada.toLowerCase()) {
            case "michael jackson":
                System.out.println("Michael Jackson fue un famoso cantante y bailarín, conocido como \"El Rey del Pop\".");
                break;
            case "inception":
                System.out.println("Inception es una película de ciencia ficción dirigida por Christopher Nolan, lanzada en 2010.");
                break;
            case "stranger things":
                System.out.println("Stranger Things es una serie de televisión de ciencia ficción y terror, ambientada en la década de 1980.");
                break;
            case "pablo picasso":
                System.out.println("Pablo Picasso fue un destacado pintor y escultor español, cofundador del movimiento cubista.");
                break;
            case "titanic":
                System.out.println("Titanic es una película romántica y de desastre dirigida por James Cameron, estrenada en 1997.");
                break;
            default:
                System.out.println("Lo sentimos, no tengo información sobre \"" + entrada + "\".");
                break;
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}