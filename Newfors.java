public class Newfors {
    public static void main(String[] args) {
        int [] edades = {30,35,9,18,99};
        for(int i = 0; i < edades.length; i++) {
            if(edades[i] < 18) {
                System.out.println("Lo sentimos, no puedes pasar, tu edad es " +edades[i]);
                continue;
            }
        }
    }
}
//breaks: Detiene el lopp por completo
//Continue: Detiene iteracion actual y salta a la siguiente≠