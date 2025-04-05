import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ArrayClass {
    int [] num  = {1,2,3,4,5};
    int dos = 2;

    public static void main(String[] args) {
        // Array: Objeto en memoira de tama;o fijo que guarda valores d u nmismo tipo
        // Syntax: tipo de dato + [] + nombre
        System.out.println("--------------------Vectores o Array -----------------");
        int [] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println("Imprime una posision: "+ numbers[numbers.length-1]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(numbers.length);

        int [] numbers2 = {1,2,3,4};


        //////////////////////////////
        System.out.println(" Error runtime es una escencion ");


    }
}
