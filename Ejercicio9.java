public class Ejercicio9 {
    public static void main(String[] args) {
        int [] numeros = {100,250,150,300,220, 180, 400,120};
        int suma = 0;
        System.out.println("Precio por debajo de $200: ");
        for (int precio : numeros) { //for each -> enhaced for
            if (precio < 200) {
                System.out.println(precio);
                suma += precio;
            }
        }
        System.out.println("suma total: " + suma);
    }
}
