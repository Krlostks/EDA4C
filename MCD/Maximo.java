package MCD;
import java.util.Scanner;
public class Maximo {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Ingrese el primer valor: ");
        int n1 = sc.nextInt();

        System.out.println("Ingrese el segundo valor: ");
        int n2 = sc.nextInt();
        
        int Mcd = Resultado(n1,n2);
        int mcdnt = Resultadont (n1, n2);
        
        System.out.println("El maximo comun divisor de los numeros es: " + Mcd);
        System.out.println("pero tambien es: "+ mcdnt);

        sc.close();
    }

    public static int Resultado(int a, int b){
        while (b!= 0){
            int temp = b;
            b = a%b;
            a = temp; 
        }
        return a; 
    }
        public static int Resultadont(int c, int d){
        if ( d == 0){
            return c;
        } else {
            return Resultadont(d, c % d);
        }
    } 
}


