import java.util.Scanner;
/*
Challenge: Precio del Cine

Escribe un programa que calcule el precio de una entrada de cine bajo las siguientes condiciones:

El precio de la entrada es de $10.
Si la persona es estudiante Y tiene 18 años de edad o menos, obtiene un 50% de descuento (el precio es $5).
Si la edad de la persona es menor a 13 años O mayor a 65 años, obtienen un descuento de 30% (el precio es $7).
Si ninguna de las condiciones mencionadas aplican, pagan el precio completo.
Si la edad es negativa, imprime “Edad Inválida” y no calcules el precio.

El programa debe tomar 2 inputs: la edad de la persona y si son estudiantes o no. Determina el precio final.

 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Opten un descuento con tu edad, precio normal $10 DOLARES -----");
        System.out.print("Ingrese tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Eres estudiante, teclea si (S) y no (N): ");
        char estudiante = sc.next().charAt(0);
        if (edad < 0) {
            System.out.println("Edad invalida");
        }else if (estudiante == 'S') {
            if (edad <= 18) {
                System.out.println("edad: " +edad+ ", 50% de descuento, precio de $" + 10/2 + " dolares" );
            }else {
                System.out.println("edad: " +edad+ " no hay descuento, precio de $10 dolares" );
            }
        } else if (estudiante == 'N') {
            if (edad <=13 || edad >= 65) {
                System.out.println("edad: "+edad+ ", 30% de descuento, precio de $" + 10*.3 + " dolares");
            }else {
                System.out.println("edad: " +edad+ " no hay descuento, precio de $10" );
            }

        }

    }
}
