public class Switches {
    public static void main(String[] args) {
        //caeo solo acepta valores primtivos
        //char, byte, short, int, String, enum
        //Los caos deben ser CCONSTANTES e ntmepo de compilacion:
        //Final, tipo permisivo, declarado e inicializado.
        // equalsIgnoreCase
        final int a = 3; // nose cambia
        switch (a) {
            case 1:
                System.out.println("1");

                break;

            default:
                throw new IllegalStateException("Unexpected value: " + a);
        }
    }
}
