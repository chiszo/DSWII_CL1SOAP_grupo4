package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class ABisiesto {

    public static void main(String[] args) {
        /*int year = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca el año");
        year =  scanner.nextInt();
        if (year != 0){
            System.out.println(resultado(year));
        }
        else System.out.println("Error");*/
    }

    private Boolean isValid(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public String resultado(int year){
        if(isValid(year)){
            return "El año " + year + " sí es bisiesto";
        } return "El año " + year + " no es bisiesto";
    }
}
