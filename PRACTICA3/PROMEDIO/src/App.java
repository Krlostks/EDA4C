import files.Files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws Exception {
        Files arch = new Files();
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int [] calificacionesP1; 
        int [] calificacionesP2; 
        int [] calificacionesP3;
        int [] calificacionesP4;
        int [] calificacionesF; 
        int [] promediosG;
        int[] promF;
        int promC ;
        String filename;
        int proms;
        System.out.println("Escribe el nombre del archivo del parcial 1: ");
        filename = bufer.readLine();
        calificacionesP1 = arch.archivoInt(filename);
        System.out.println("califiaciones del p1: ");
        for (int numeros : calificacionesP1) {
            System.out.println(numeros);            
        }
        System.out.println("Escribe el nombre del archivo del parcial 2: ");
        filename = bufer.readLine();
        calificacionesP2 = arch.archivoInt(filename);
        System.out.println("califiaciones del p2: ");
        for (int numeros : calificacionesP2) {
            System.out.println(numeros);            
        }
        System.out.println("Escribe el nombre del archivo del parcial 3: ");
        filename = bufer.readLine();
        calificacionesP3 = arch.archivoInt(filename);
        System.out.println("califiaciones del p3: ");
        for (int numeros : calificacionesP3) {
            System.out.println(numeros);            
        }
        System.out.println("Escribe el nombre del archivo del parcial 4: ");
        filename = bufer.readLine();
        calificacionesP4 = arch.archivoInt(filename);
        System.out.println("califiaciones del p4: ");
        for (int numeros : calificacionesP4) {
            System.out.println(numeros);            
        }
        calificacionesF = new int[calificacionesP1.length];
        for (int i = 0; i < calificacionesP1.length; i++) {
            calificacionesF [i]= (calificacionesP1 [i] + calificacionesP2 [i] + calificacionesP3 [i] + calificacionesP4 [i]) / 4;
        }
        System.out.println("Escribe el nombre del archivo: ");
        filename =bufer.readLine();
        arch.arregloArchivo(filename, calificacionesF);
        System.out.println("califi");



        promediosG = arch.archivoInt(filename);
        int guardar = 0;
        for (int i = 0; i < promediosG.length; i++) {
            guardar = guardar + promediosG[i];
        }
        proms = guardar / promediosG.length;
        System.out.println("el promdio general es: "+ proms );




    }

}
