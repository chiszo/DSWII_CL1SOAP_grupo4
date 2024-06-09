package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class CSerieNumero {
    public static void main(String[] args) {
        /*
        int limite=0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un número límite");
        limite = scanner.nextInt();
        resultado(limite);*/
    }

    public String resultado(int limite){
        String resultado ="";
        if (limite!=0){
            for (int i=1; i<=limite;i++){
                resultado = resultado + (i+" es "+isvalid(i)+ " \n");
            }
            return resultado;
        }
        return "no es válido";
    }
    //no cuenta el mismo número
    private boolean isvalid(int numero){
        int suma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        return suma == numero;
    }
}
