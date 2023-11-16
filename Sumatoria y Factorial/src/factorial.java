
public class factorial{
public static void main(String[] args) {
   int num = 15;
   int result = factoria(num);
   System.out.println("El factorial de " + num + " es "+ result);
}

// version no recursica

private static int factoria (int num){
    int fact = 1;
    if (num != 0) {
        for(int i = num; i>0; i--){
            fact = fact * i ;
        }
    }
    return fact;
}
}
