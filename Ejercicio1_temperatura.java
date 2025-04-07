import java.util.Scanner;

public class Ejercicio1_temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura;
        System.out.println("Ingrese la temperatura del que desea: ");
        temperatura = entrada.nextDouble();
        if (temperatura >= 37) {

            System.out.println("Tienes " + temperatura +  "temperatura cuidate");
        }else
            System.out.println("NO Tienes  Temperatura " + temperatura );

    }
}