import java.util.Scanner;
/*
Ejercicio 5: Semáforo

Escribe un programa que tome un color de semáforo “Rojo”, “Amarillo” o “Verde”
como input e imprima la acción apropiada:

Rojo: Alto
Amarillo: Bajar velocidad
Verde: Avance
Otro input: Color inválido

 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un color: ");
        String color = sc.nextLine();

        if (color.equals( "rojo")) {
            System.out.print(" Alto ");
        }else if (color.equals("amarillo")) {
            System.out.print(" Bajar la velocidad ");
        }else if (color.equals("verde")) {
            System.out.print(" Avansce ");
        }else  {
            System.out.print(" Color incorrecto!!  ");
        }


    }
}
