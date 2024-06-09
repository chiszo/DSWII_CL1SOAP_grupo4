package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2;

import java.util.Scanner;

public class DTrafico {
    public static void main(String[] args) {
        double tasa=0;
        String indicador ="";
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un indicador (C A T M)");
        indicador=scanner.nextLine();
        System.out.println("Introduzca la tasa de alcohol");
        tasa = scanner.nextDouble();
        System.out.println(resultado(indicador,tasa));
    }
    private static boolean isValid(String indicador, double tasa){
        double tasaMax=0;
        switch(indicador){
            case "C": tasaMax = 0.3;
            break;
            case "A": tasaMax = 0.3;
                break;
            case "T": tasaMax = 0.3;
                break;
            default: tasaMax=0.3;
        }
        if(tasa>tasaMax){
            return false;
        }
        return true;
    }

    private static String resultado(String indicador, double tasa){
        if(isValid(indicador,tasa)){
            return "negativo en alcoholemia";
        }
        return "positivo en alcoholemia";
    }
}
