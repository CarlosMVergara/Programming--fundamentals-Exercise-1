package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        float nota;

        System.out.println("Ingrese la nota del examen (Escribir un número real entre 0 y 10): ");
        nota = leer.nextFloat();

        if (nota < 5) {
            System.out.println("Nota: " + nota + " Reprobado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Nota: " + nota + " Notable");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Nota: " + nota + " Sobresaliente");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("Nota: " + nota + " Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Nota: " + nota + " Excelente");
        }

    }

}
