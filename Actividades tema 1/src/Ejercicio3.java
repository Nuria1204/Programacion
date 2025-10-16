import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Introduccion
        int ventaselectronicas;
        int ventastienda;
        int totalventas;
        double porcentajeelectronicas;
        double porcentajetienda;
        Scanner juan= new Scanner(System.in);

        //Desarrollo
        System.out.println("Introduce los datos");
        ventaselectronicas= juan.nextInt();
        ventastienda= juan.nextInt();
        totalventas= juan.nextInt();
        porcentajeelectronicas= juan.nextInt();
        porcentajetienda= juan.nextInt();
        totalventas= ventaselectronicas+ventastienda;
        porcentajeelectronicas=(ventaselectronicas*100) /totalventas;
        porcentajetienda= (ventastienda* 100) / totalventas;

        //Final
        System.out.println("Resultado ventas"+ totalventas);
        System.out.println("Resultado porcentajeelectroicas"+ porcentajeelectronicas);
        System.out.println("Resultado porcentajetienda"+ porcentajetienda);



    }
}
