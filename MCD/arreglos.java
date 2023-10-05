package MCD;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class arreglos{
    public static BufferedReader bufer =  new BufferedReader (new InputStreamReader(System.in));
    public static String entrada; 
    //metodo que regresa un arreglo de double y recie un parametro entero
    public static double[] leerPromdios(int n) throws IOException{
        double proms[]=  new double[n];
        System.out.println("ingrese los romedio individuales de cada estudiante:");
        for (int i = 0; i < proms.length; i++) {
            System.out.println("Escribe el promedio individual del estudiante con el id " +i+": ");
            entrada =bufer.readLine();
            proms[i]= Double.parseDouble(entrada);
        }
        return proms;
    }

    //Solo regresas un double y recibe un areglo double como parametro
    public static double calcularPromedioGrupo(double[] p){
        double suma = 0; 
        for (int i = 0; i < p.length; i++){
            suma = suma +p[i];
        }
        return suma/p.length;
    }
    public static void impprimirPromedios(double[] proms){
        int i = 0;
        System.out.println("promedios individuales del grupo: ");
        System.out.println("Idalumno           promdio individual");
        System.out.println("-------------------------------------");
        for (double prom : proms) {
            System.out.println("   "+i+"              "+prom);
            i++;
        }
    }
    public static void main(String[]args) throws Exception{
        final int T = 5;  //Declarando y construyendo el arreglo
        double promedioGrupo; 
        
        int [] arreglo= new int[5];  //inicializando las casillas del arreglo en 0
        
        char[] caracters =  new char[T]; //un arreglo
        
        boolean[] datos;  //Un arreglo de booleanos 
        int t; //tamaño variable de arreglos
        
        double[] doble; //areglo de double
        int j; //tamaño del arreglo
        
        //double[] promedios = { 9.1, 8.6 , 7.4, 5.3, 9.2, 6.5 };
        double[] promedios;
        
        for (int i = 0; i < 5 ; i++)
            arreglo[i]= 0;
            //Asi no se puede imprimir el arreglo
            //System.out.println("arreglos");
            //System.out.println(arreglo);

            //Asi si se puede imprimir el arreglo
            System.out.println("Contenido de arreglo");
            for (int i = 0; i < arreglo.length; i++)
                System.out.println("arreglo[" + i + "]=" +arreglo[i]);

            //leer los valores del arreglo caracteres
            System.out.println("Escribe los valores del arreglo caracteres");
            for (int i = 0; i < T ; i++) {
                System.out.println("Escribe el valor " +i+ " :" );
                entrada = bufer.readLine();
                caracters [i] = entrada.charAt(0);
                
                }
                System.out.println("Contenido de arreglo caracteres");
                for (int i = 0; i < caracters.length; i++) {
                    System.out.println("Caracteres[" + i + "]= " + caracters[i]);
                }

                System.out.println("Escribe el tamaño del arreglo de datos");
                entrada = bufer.readLine();
                t = Integer.parseInt(entrada);

                datos = new boolean[t]; //construimos el arreglo datos usando t para darle un tamaño

                for (int i = 0; i < t; i++) {
                    System.out.println("Escribe el valor [" + i + "] de datos:");
                    entrada = bufer.readLine(); //ingresando datos
                    datos [i] = Boolean.parseBoolean(entrada); 
                }
                System.out.println("Valores del arreglo: ");
                for(boolean unDato : datos)
                    System.out.println( unDato );
                
                System.out.println("Escribe el tamaño del areglo:");
                entrada =bufer.readLine();
                j = Integer.parseInt(entrada);
                
                doble = new double[j];

                //declaando su tamaño
                for (int i = 0; i < j; i++) {
                    System.out.println("Escribe el valo de [" + i + "] doble: ");
                    entrada = bufer.readLine(); 
                    doble[i] = Double.parseDouble(entrada);
                }
                System.out.println("Valores del arreglo: ");
                for(double dos : doble)
                   System.out.println(dos);

                
             // inicializando el arreglo 

             //calcular promedio de un grupo
             System.out.println();
             System.out.println("Escribe el tamaño del grupo: ");
             entrada = bufer.readLine();
             t=Integer.parseInt(entrada);

             promedios= leerPromdios(t);
             impprimirPromedios(promedios);
             promedioGrupo=calcularPromedioGrupo(promedios);
             System.out.println("El promedio del grupo es: " +promedioGrupo);
             
                
            }
        }