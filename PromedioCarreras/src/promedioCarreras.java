package practica1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedioCarreras {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el número de grupos: ");
        int numGrupos = Integer.parseInt(reader.readLine());

        double[] promedioGrupos = new double[numGrupos];

        for (int i = 0; i < numGrupos; i++) {
            System.out.print("Ingrese la cantidad de estudiantes en el grupo " + (i + 1) + ": ");
            int numEstudiantes = Integer.parseInt(reader.readLine());

            double sumaPromedios = 0;

            for (int j = 0; j < numEstudiantes; j++) {
                System.out.print("Ingrese el promedio del estudiante " + (j + 1) + " del grupo " + (i + 1) + ": ");
                double promedioEstudiante = Double.parseDouble(reader.readLine());
                sumaPromedios += promedioEstudiante;
            }

            double promedioGrupo = sumaPromedios / numEstudiantes;
            promedioGrupos[i] = promedioGrupo;
        }

        double sumaPromediosGenerales = 0;

        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Promedio del grupo " + (i + 1) + ": " + promedioGrupos[i]);
            sumaPromediosGenerales += promedioGrupos[i];
        }

        double promedioGeneral = sumaPromediosGenerales / numGrupos;
        System.out.println("Promedio general de la carrera de TICS: " + promedioGeneral);
    }
}