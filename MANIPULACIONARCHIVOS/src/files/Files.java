package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Files {
     public int contarLineas(String name){
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        int numLineas = 0;
        try {
            archivo = new File ("C:\\ManipulacionArchivos\\"+ name +".txt");  //apunta 
            al archivo
            reader = new FileReader(archivo); //abrir el archivo para su lectura
            bufer = new BufferedReader(reader);
            while ((bufer.readLine()) != null) {
                numLineas++;
            }
            bufer.close();
            
            } catch (Exception e) {
                System.out.println("Error al abrir/leer el archivo " + e.toString());
        }
        return numLineas;
    }
    /*Metodo que lee un archivo de texto plano 
    y almacena cada linea de un arreglo strings*/
    
    public String[] archivoStrings(String name){
        File archivo;//apuntar a un archivo fisico en el DD
        FileReader reader; //Para abrir el archivo
        BufferedReader bufer; //para leer la info del archivo
        String linea;
        String[] arreglo = null;
        int t;
        int i = 0; //indice del arreglo 
    
            try {

            t= contarLineas(name);//Saber cuantas lineas tiene el arreglo
            arreglo = new String[t]; //constrye el arreglo con valor de t 
            archivo = new File ("C:\\ManipulacionArchivos\\"+ name +".txt");  //apunta al archivo
            reader = new FileReader(archivo); //abrir el archivo para su lectura
            bufer = new BufferedReader(reader);

            while ((linea = bufer.readLine()) != null) {
                //System.out.println("linea del archivo: "+ linea); esto ya no sirve, ahoa guardaremos el txt en el arreglo
                arreglo[i] = linea;
                i ++;
            }
            bufer.close();
            
            } catch (Exception e) {
                System.out.println("Error al abrir/leer el archivo " + e.toString());
        }
        return arreglo;
    }
    public int[] archivoInt(String name){
        File archivo;//apuntar a un archivo fisico en el DD
        FileReader reader; //Para abrir el archivo
        BufferedReader bufer; //para leer la info del archivo
        String linea;
        int[] arreglo = null;
        int t;
        int i = 0; //indice del arreglo 
    
            try {

            t= contarLineas(name);//Saber cuantas lineas tiene el arreglo
            arreglo = new int[t]; //constrye el arreglo con valor de t 
            archivo = new File ("C:\\ManipulacionArchivos\\"+ name +".txt");  //apunta al archivo
            reader = new FileReader(archivo); //abrir el archivo para su lectura
            bufer = new BufferedReader(reader);

            while ((linea = bufer.readLine()) != null) {
                //System.out.println("linea del archivo: "+ linea); esto ya no sirve, ahoa guardaremos el txt en el arreglo
                arreglo[i] = Integer.parseInt(linea);
                i ++;
            }
            bufer.close();
            
            } catch (Exception e) {
                System.out.println("Error al abrir/leer el archivo " + e.toString());
        }
        return arreglo;
    }
    public void ModicarArchivo(String name, String contenido){
        
    }

    public void escribirArchivo (String name){
        //apuntador a la seccion de DD donde e cra ese archivo
        FileWriter archivo; 
        //Llave par tener acceso en modo escritura
        PrintWriter writer; 
        //Para leer datos del teclao
        BufferedReader bufer = new BufferedReader(
            new InputStreamReader(System.in));
        String entrada;
        char Respuesta;
        try {
            archivo = new FileWriter("C:\\ManipulacionArchivos\\"+ name +".txt");
            writer= new PrintWriter(archivo);
            do {
                System.out.println("escribe datos para el archivo: ");
                entrada = bufer.readLine();
                writer.println(entrada);
                System.out.println("escribe x para:");
                entrada = bufer.readLine(); 
                Respuesta = entrada.charAt(0);
            } while (Respuesta != 'x');
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear el archivo "+ e.toString());
        }
    }
    public void arregloArchivo (String name, int[] array){
        FileWriter archivo; 
        PrintWriter writer; 

        try {
            archivo = new FileWriter("C:\\ManipulacionArchivos\\"+ name +".txt");
            writer= new PrintWriter(archivo);
            for (int unDato : array) {
                writer.println(unDato);
            }
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear el archivo "+ e.toString());
        }
    }
}
