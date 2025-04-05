import java.util.Scanner;

/*
    Ejercicio 4: Clasificador de Edades
    ## Escribe un programa que acepte la edad de una persona como input y
    la clasifique en alguno de los siguientes grupos:

    ## 0 a 12: Niño
    ## 13 a 19: Adolescente
    ## 20 a 59: Adulto
    ## 60 y más: Adulto Mayor
    ## Si la edad es negativa, imprime “Edad inválida”

 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Te clea tu edad: ");
        int edad = sc.nextInt();
        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres: Niño ");
        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Eres: Adolescente");
        }else if (edad >= 20 && edad <= 59) {
            System.out.println("Eres: Adulto ");
        }else if (edad >= 60 ) {
            System.out.println("Eres: Adulto mayor ");
        }else if (edad <= 0) {
            System.out.println("Edad negativa ");
        }

    }
}
