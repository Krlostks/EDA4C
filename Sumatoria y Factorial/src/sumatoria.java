import java.util.Scanner;

public class sumatoria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el límite inferior: ");
        int limiteInferior = scanner.nextInt();
        
        System.out.print("Ingrese el límite superior: ");
        int limiteSuperior = scanner.nextInt();
        
        scanner.close();
        
        long resultado = SumatoriaRecursiva(limiteInferior, limiteSuperior);
        
        System.out.println("La sumatoria de " + limiteInferior + " al cuadrado hasta " + limiteSuperior + " al cuadrado es: " + resultado);
    }
    
    public static long SumatoriaRecursiva(int lim_inf, int lim_sup) {
        if (lim_inf > lim_sup) {
            return 0; 
        } else {
            long result = lim_inf * lim_inf;
            long sumaRecursiva = SumatoriaRecursiva(lim_inf + 1, lim_sup);
            return result + sumaRecursiva;
        }
    }
}
