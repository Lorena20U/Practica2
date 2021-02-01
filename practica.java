import java.util.Scanner;

/**
 *
 * @author yanet
 */

public class practica {

    public static double[] debitos = new double[10];
    public static double[] creditos = new double[5];
    public static int contd;
    public static int contc;
    public static double totalDebitos = 0.0;
    public static double promedioDebitos = 0.0;
    public static double debitoGrande = 0.0;
    public static double totalCreditos = 0.0;
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);

        System.out.println("Bienvenido!!!");

        //Ingresar datos
        System.out.println("\nIngrese los credito: ");
        System.out.println("Cuantos creditos desea ingresar: ");
        contc = n.nextInt();
        for (int i = 0; i < contc; i++) {
            System.out.println("\t#" + (i + 1) + ": ");
            creditos[i] = n.nextDouble();
        }

        System.out.println("\nIngrese los debitos: ");
        System.out.println("cuantos debitos desea ingresar: ");
        contd = n.nextInt();
        for (int j = 0; j < contd; j++) {
            System.out.println("\t#" + (j + 1) + ": ");
            debitos[j] = n.nextDouble();
        }


        //Totales
        for (int a = 0; a < contc; a++) {
            totalCreditos = totalCreditos + creditos[a];
        }
        
        for (int b = 0; b < contd; b++) {
            totalDebitos = totalDebitos + debitos[b];
        }
        promedioDebitos = totalDebitos / contd;

        //Debito mas grande
        for (int g = 0; g < contd; g++) {
            if (debitoGrande < debitos[g]) {
                debitoGrande = debitos[g];
            }
        }
        
        imprimir();
        System.out.println("Gracias por usar el sistema!! :D ");
    }

    private static void imprimir() {
        System.out.println("\nOperaciones realizadas: ");
        System.out.println("\tTotal Debitos: " + totalDebitos);
        System.out.println("\tTotal Creditos: " + totalCreditos);
        System.out.println("\tSaldo Total: " + (totalCreditos - totalDebitos));
        System.out.println("\tPromedio de Debitos: " + promedioDebitos);
        System.out.println("\tDebito mas grande: " + debitoGrande);
        System.out.println("\t\tOperaciones de credito: " + contc);
        System.out.println("\t\tOperaciones de debito: " + contd);
        System.out.println("\t\t\tTotal de Operaciones realizadas: " + (contd + contc));
    }
}
