package pe.edu.cibertec.DSWII_CL1SOAP_grupo4.Pregunta2;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class BPromedioAlumno {
    public static void main(String[] args) {
       /* double nota1 = 0, nota2 = 0, nota3 = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca 3 notas");

        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();

        System.out.println(resultado(nota1, nota2, nota3));*/

    }

    private double promedioAlumno(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public String resultado(double nota1, double nota2, double nota3){
        if (promedioAlumno(nota1,nota2,nota3)>=70){
            return "Aprobado";
        }
        return "Desaprobado";
    }
}
