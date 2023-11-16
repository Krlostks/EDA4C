public class matrices {

    public int[][] imprimir( matriz[][]){

    }
    public static void main(String[] args) throws Exception {
        int[][] matriz1 = new int[3][3];
        int valor  = 1;
        //for para rellenar la matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = valor;
                valor++;
            }
        }
    }
}
