public class Ejercicio8 {
    public static void main(String[] args) {
        String [] nombres = {"Alicia", "Carlos", "Diana", "Arturo"};
        boolean bandera = false; //Bndera para saber o notar un elemento.
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase("alicia") ) {
                System.out.println("vuelva al intentarlo: " + i);
                System.out.println(nombres[i]);
                bandera = true;
            }
        }
        if(!bandera){
            System.out.println("no existe el nombre");
        }



    }
}
