
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static listaLigada lista =new listaLigada();       

    public static void agregar() throws IOException {
        int dato;
        System.out.println("Escribe dato a Guardar");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);
        
    }
    public static void main(String[] args) throws IOException{
        int respuesta;
        System.out.println("Progrma que manipula una lista ligada");
        do {
            System.out.println("Menu de opciones");
            System.out.println("1.- Agregar nodo al final");
            System.out.println("2.- Imprimir lista");
            System.out.println("3.- Insertar en una pocison");
            System.out.println("4.- Eliminar en una pocison");
            System.out.println("5.- Contar nodos");
            System.out.println("6.- Salir del programa");
            
            System.out.println("Escribe la opcion seleccionada");
            entrada = bufer.readLine();
            respuesta = Integer.parseInt(entrada);
            switch (respuesta) {
                case 1:
                    agregar();
                    break;
                case 2: 
                    System.out.println("--------------------------");
                    System.out.println("Contenido de la lista:");
                    lista.printList();
                    System.out.println("--------------------------");
                    break;
                case 6:
                    System.out.println("Adiós papu :´v");
                    System.exit(0);
                default:System.out.println("opcion no valida");
                    break;
            }
        } while (respuesta != 6);
    }
}


