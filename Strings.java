public class Strings {
    public static void main(String[] args) {
        //String cadena de caracteres
        // Strings son inmutables no pueden cambiar despe de ser creadas
        /*
            charAt(), contaain(), length(), equqls(), equalIgnoreCse(),
            indexOf(), toLowerCse
         */
        String saludos = "hola mundo";
        System.out.println(saludos.charAt(5));
        System.out.println(saludos.indexOf("undo"));

        String [] nombres = {"edgar", "Mager","Jose"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre: " + nombres[i]);
            System.out.println(nombres[i].isEmpty());
        }
    }
}
