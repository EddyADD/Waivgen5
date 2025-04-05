public class Ejercicio7 {
    public static void main(String[] args) {
        double [] temperatura = {72.2,68.5, 70.1, 34.3, 45.5, 55.3};
        double suma = 0;
        for (double temp : temperatura) {
            suma += temp;
        }
        double promedio = suma / temperatura.length;
        System.out.println("El promedio es: " + promedio);

        for (double temp : temperatura) {
            if (temp > promedio) {
                System.out.println(temp);
            }
        }



    }
}
