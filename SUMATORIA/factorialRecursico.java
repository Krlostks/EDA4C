public class factorialRecursico {
    private static int factorial(int num){
        if (num == 0){
            return 1;
        } else {
            return num * factorial (num -1);
        }
    }
    public static void main (String[] args){
        int numero = 5;
        int resultado; 
         System.out.println("programa para calcular el factorial de un numero");
         resultado = factorial(numero);
         System.out.println("El factorial de " + numero +" es " + resultado);
}
}