import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Introduccion
        int numerosuerte;
        int dia;
        int mes;
        int anio;
        int suma;
        Scanner sc= new Scanner(System.in);

        //Desarrollo
        System.out.print("Día de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.print("Año de nacimiento: ");
        anio = sc.nextInt();
        numerosuerte= sc.nextInt();
        suma= dia + mes + anio;
        String sumaStr= String.valueOf(suma);  //convierte el número a texto
        for (int i= 0; i < sumaStr.length(); i ++) {  //devuelve el numero 4, porque la cadena son de 4 numeros
            numerosuerte += Character.getNumericValue(sumaStr.charAt(i)); //charAt toma posicion i
        }

        //get convierte 'i' en numero


        //Final
        System.out.println("Tú número de la suerte es:"+ numerosuerte);

    }
}
