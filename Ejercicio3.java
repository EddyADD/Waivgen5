import java.util.Scanner;
/*Ejercicio 3: Calculadora de Calificaciones

Escribe un programa que tome la calificación de un estudiante (0 - 100)
 como input y asigne una letra basado en los siguientes criterios:

 90 a 100: “A”
80 a 89: “B”
70 a 79: “C”
60 a 69: “D”
Debajo de 60: “F”

Imprime la letra asignada de acuerdo a la calificación.
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        int num = 90;

        if (num >= 90 && num <= 100) {
            System.out.println("A");
        }else if (num >= 80 && num <= 89) {
            System.out.println("B");
        }else if (num >= 70 && num <= 79) {
            System.out.println("C");
        }else if (num >= 60 && num <= 69) {
            System.out.println("D");
        }else if (num < 60) {
            System.out.println("F");
        }

    }
}
// TAREA
/*Ejercicio 4: Clasificador de Edades

Escribe un programa que acepte la edad de una persona como input y la clasifique en alguno de los siguientes grupos:

0 a 12: Niño
13 a 19: Adolescente
20 a 59: Adulto
60 y más: Adulto Mayor
Si la edad es negativa, imprime “Edad inválida”

Ejercicio 5: Semáforo

Escribe un programa que tome un color de semáforo “Rojo”, “Amarillo” o “Verde” como input e imprima la acción apropiada:

Rojo: Alto
Amarillo: Bajar velocidad
Verde: Avance
Otro input: Color inválido

Challenge: Precio del Cine

Escribe un programa que calcule el precio de una entrada de cine bajo las siguientes condiciones:

El precio de la entrada es de $10.
Si la persona es estudiante Y tiene 18 años de edad o menos, obtiene un 50% de descuento (el precio es $5).
Si la edad de la persona es menor a 13 años O mayor a 65 años, obtienen un descuento de 30% (el precio es $7).
Si ninguna de las condiciones mencionadas aplican, pagan el precio completo.
Si la edad es negativa, imprime “Edad Inválida” y no calcules el precio.

El programa debe tomar 2 inputs: la edad de la persona y si son estudiantes o no. Determina el precio final.

pastebin.com
*/