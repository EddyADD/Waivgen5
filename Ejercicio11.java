import java.util.Arrays;


public class Ejercicio11 {
    public static void main(String[] args) {
        String [] paises = {"New York", "Londos", "Paris", "Tokio", "Sydney"};
        String [] modificados = new String[paises.length];
        for(int i=0; i<paises.length; i++){
            modificados[i] = paises[i].toUpperCase();
            //System.out.println(modificados[i]);
        }
        System.out.println(Arrays.toString(modificados)); //Immpime arrays con estilo.


    }
}
