package PRACTICA2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class PRACTICA_2 {
    public static BufferedReader bufer =  new BufferedReader (new InputStreamReader(System.in));
    public static String entrada; 
    
    
    public static int[] leernums( int s) throws IOException{
    int [] arreglo = new int[s]; 
    
    for (int i = 0; i < arreglo.length; i++) {
        System.out.println("Ingrese el valor [" + i + "]");
        entrada = bufer.readLine(); 
        arreglo[i]= Integer.parseInt(entrada);
    }
    return arreglo;
    }
    public static void calcularmayor(int [] l) {
        int k = l[0]; 
        for (int i = 0; i < l.length; i++) {
            if ( l[i]>k) {
                k = l[i];
            }
        }
        System.out.println("El numero mayor es: " + k);
    }
    public static void calcularmenor(int[] j){
        int r = j[0];
        for (int i = 0; i < j.length; i++) {
            if (j[i]<r) {
                r = j[i];
            }
        }
        System.out.println("El numero menor es: " + r);
    }

    public static void calcularImpar(int[] o){
        int impares = 0;
        int pares = 0;
        System.out.println();
        for (int i = 0; i < o.length; i++) {
            if (i % 2 != 0) {
                impares= impares +1;     
                pares = o.length - impares;
            }
        } 
            for (int t = 0; t < o.length; t++) {
                if (o[t] % 2 != 0) {
                    System.out.println("numero impar:" + o[t]);
                }
            }for (int d = 0; d < o.length; d++) {
                if (o[d] % 2 == 0) {
                    System.out.println("numero par:" + o[d]);
                
            }
            
        }
        System.out.println("el arreglo tiene " + impares+" numeros impares");
        System.out.println("el arreglo tiene " + pares +" numeros pares");
    }
    public static void main(String[] args) throws IOException {
        int [] valores;
        int t;

    System.out.println( "ingrese el tamaño del arreglo: ");
    entrada = bufer.readLine();
    t = Integer.parseInt(entrada);
    
    valores = leernums(t);
    calcularmayor(valores);
    calcularmenor(valores);
    calcularImpar(valores);


    }
}
