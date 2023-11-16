import java.util.Scanner;

public class App {   
    public static void main(String[] args) {
         //crear matriz original de 2 filas y 3 columnas
        int[][] M = new int[2][3];  

        //lectura de datos por teclado
        leerDatos(M);

        //mostrar matriz original
        System.out.println("Matriz original");
        mostrarMatriz(M);

        //calcular la matriz transpuesta
        int [][] T = matrizTranspuesta(M);

        //mostrar matriz transpuesta
        System.out.println("Matriz transpuesta");
        mostrarMatriz(T);

    }

    //método para introducir datos a la matriz desde teclado
    public static void leerDatos(int[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de datos de la matriz:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "]=");
                M[i][j] = sc.nextInt();
            }
        }
        sc.close(); 
    }

    //método para obtener la transpuesta de una matriz
    public static int[][] matrizTranspuesta(int[][] a) {
        //creamos la matriz transpuesta
        //el número de filas será igual al número de columnas de la matriz original
        //el número de columnnas será igual al número de filas de la matriz original                              
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    //método para mostrar una matriz por pantalla
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}

