package Clase_5;
import java.util.Scanner;
public class Ciudades {

        public static void main(String[] args) {
            Scanner ciudadscan = new Scanner(System.in);

            // Arreglo de ciudades y sus apodos
            String[] ciudades = {"Caracas", "Maracaibo", "Valencia", "Barquisimeto", "Merida"};
            String[] apodos = {"la Ciudad de la Furia", "la Tierra del Sol Amada", "la Ciudad de las tres culturas", "la Ciudad Crepuscular", "la Ciudad de los Caballeros"};

            // Mostrar las opciones disponibles al usuario
            System.out.println("Selecciona una ciudad de Venezuela con un numero del 1 al 5 para obtener su apodo:");
            for (int contador = 0; contador < ciudades.length; contador++) {
                System.out.println((contador + 1) + ". " + ciudades[contador]);
            }

            // Leer la selección del usuario
            int seleccion = ciudadscan.nextInt();

            // Verificar que la selección esté dentro del rango válido
            if (seleccion >= 1 && seleccion <= ciudades.length) {
                // Mostrar el apodo de la ciudad seleccionada
                String ciudadSeleccionada = ciudades[seleccion - 1];
                String apodo = apodos[seleccion - 1];
                System.out.println("El apodo de " + ciudadSeleccionada + " es " + apodo);
            } else {
                System.out.println("Selección no válida. Por favor, elige un número entre 1 y " + ciudades.length);
            }

            // Cerrar el objeto Scanner
            ciudadscan.close();
        }
    }


