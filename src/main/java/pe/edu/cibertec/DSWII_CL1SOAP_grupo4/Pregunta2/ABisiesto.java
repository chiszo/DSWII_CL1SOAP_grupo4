package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2;

import java.util.Scanner;

public class ABisiesto {

    public static void main(String[] args) {
        int year = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca el año");
        year =  Integer.valueOf(scanner.nextLine ());
        if (year != 0){
            System.out.println(resultado(year));
        }
        else System.out.println("Error");
    }

    public static Boolean isValid(int year){
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public static String resultado(int year){
        if(isValid(year)){
            return "El año " + year + " sí es bisiesto";
        } return "El año " + year + " no es bisiesto";
    }
}
