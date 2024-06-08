package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2;

import java.util.Scanner;

public class CSerieNumero {
    public static void main(String[] args) {
        int limite=0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un número límite");
        limite = scanner.nextInt();
        resultado(limite);
    }

    private static void resultado(int limite){
        for (int i=1; i<=limite;i++){
            System.out.println(i+" es "+isvalid(i));
        }
    }
    //no cuenta el mismo número
    private static boolean isvalid(int numero){
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}
