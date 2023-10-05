package Clase_5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                // Pedir al usuario que ingrese un país
                System.out.print("Ingresa un país: ");
                String pais = scanner.nextLine();

                // Concatenar la URL de búsqueda en Google Maps
                String url = "https://www.google.com/maps/search/" + pais;

                // Mostrar la URL en la consola
                System.out.println("URL de búsqueda en Google Maps: " + url);

                // Cerrar el objeto Scanner
                scanner.close();
            }
        }