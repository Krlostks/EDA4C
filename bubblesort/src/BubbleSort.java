import java.io.BufferedReader;
import java.io.InputStreamReader;
import files.Files;

public class BubbleSort {
    public static void imprimirArreglo(int[] arreglo) {
        for(int numero : arreglo){
            System.out.println(numero);
        }
    }

    public static int[] bubbleSort(int[] arreglo) {
        boolean cambios = false;
        int auxiliar; 
        do {
            cambios = false;
            for (int i = 0; i < arreglo.length -1; i++) {
                if (arreglo[i]>arreglo[i+1]) {
                    auxiliar = arreglo[i];
                    arreglo [i] = arreglo [i+1];
                    arreglo [i+1] = auxiliar;
                    cambios = true;
                }
            }
        } while (cambios == true);
        return arreglo;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bufer = new BufferedReader(
            new InputStreamReader(System.in));

        String filename;
        int[] datos;
        Files archivo = new Files();

        System.out.println("Ordenamiento burbuja");
        System.out.println("Escribe el nombre del archivo");
        filename = bufer.readLine();
        datos = archivo.archivoInt(filename);
        datos = bubbleSort(datos);
        imprimirArreglo(datos);
        archivo.arregloArchivo("resultado", datos);
    }
}
