public class Ejercicio2 {
    static void main() {

        //Introduccion
        int suma=0;
        for (int i=0; i< 100; i++){
            suma = suma + 1;
            suma += i;
        }
        System.out.println(suma);
    }
}
