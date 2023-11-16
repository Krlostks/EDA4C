import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de filas de la primera matriz: ");
        int filasMatriz1 = scanner.nextInt();
        System.out.print("Ingresa el número de columnas de la primera matriz: ");
        int columnasMatriz1 = scanner.nextInt();
        System.out.print("Ingresa el número de filas de la segunda matriz: ");
        int filasMatriz2 = scanner.nextInt();
        System.out.print("Ingresa el número de columnas de la segunda matriz: ");
        int columnasMatriz2 = scanner.nextInt();

        int[][] matriz1 = obtenerValoresMatriz(filasMatriz1, columnasMatriz1, scanner);
        int[][] matriz2 = obtenerValoresMatriz(filasMatriz2, columnasMatriz2, scanner);

        int[][] matrizResultado = multiplicarMatrices(matriz1, matriz2);

        System.out.println("Matriz A:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz B");
        imprimirMatriz(matriz2);
        System.out.println("Matriz C Resultado=");
        imprimirMatriz(matrizResultado);
    }

    public static int[][] obtenerValoresMatriz(int filas, int columnas, Scanner scanner) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingresa el valor de [" + (i + 1) + "], [" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filasMatriz1 = matriz1.length;
        int columnasMatriz1 = matriz1[0].length;
        int filasMatriz2 = matriz2.length;
        int columnasMatriz2 = matriz2[0].length;

        if (columnasMatriz1 != filasMatriz2) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return null;
        }

        int[][] matrizResultado = new int[filasMatriz1][columnasMatriz2];

        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                for (int k = 0; k < filasMatriz2; k++) {
                    matrizResultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return matrizResultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("["+ matriz[i][j]+"]" + "   ");
            }
            System.out.println();
        }
    }
}