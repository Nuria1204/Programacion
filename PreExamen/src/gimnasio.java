import java.util.ArrayList;
import java.util.Scanner;

public class gimnasio {
    static void main() {
        ArrayList<socio> socios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Socios Iniciales
        socios.add(new socio("Ana", "121456W",25,"01/01/2024",true ));
        socios.add(new socio("Antonio", "121196F",30,"01/01/2025",true ));
        socios.add(new socio("Alba", "281456R",19,"23/04/2024",true ));
        socios.add(new socio("Alberto", "422456L",22,"29/09/2025",true ));
        socios.add(new socio("Luis", "321450P",24,"01/01/2026",true ));
        socios.add(new socio("Luna", "922356V",50,"24/08/2023",true ));

        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1 Alta socio");
            System.out.println("2 Baja socio");
            System.out.println("3 Ver socios activos");
            System.out.println("4 Ver socios inactivos");
            System.out.println("5 Borrar socio");
            System.out.println("6 Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            //Alta Socios
            if (opcion ==1){
                System.out.println("Nombre:");
                String nombre = sc.nextLine();

                System.out.println("DNI:");
                String dni = sc.nextLine();

                boolean duplicado = false;
                for (socio s: socios){
                    if (s.getDni().equals(dni)){
                        duplicado = true;
                    }
                }
                if (duplicado){
                    System.out.println("DNI ya existe");
                }else{
                    System.out.println("Edad:");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Fecha de inscripción:");
                    String fechaInscripcion = sc.nextLine();

                    socios.add(new socio(nombre, dni,edad, fechaInscripcion, true));
                    System.out.println("Socio añadido correctamente");
                }
            }
            //Baja socio
            if (opcion == 2){
                System.out.println("DNI:");
                String dni = sc.nextLine();

                for (socio s: socios){
                    if (s.getDni().equals(dni)){
                        s.setActivo();
                        System.out.println("Socio dado de baja correctamente");
                    }
                }
            }
            //Socios activos
            if (opcion ==3){
                for (socio s: socios){
                    s.setActivo();
                    System.out.println(s);
                }
            }
            //Socios inactivos
            if (opcion == 4){
                for (socio s: socios){
                   if (!s.isActivo());
                   System.out.println(s);
                }
            }
            //Borrar socio
            if (opcion == 5){
                System.out.println("DNI:");
                String dni = sc.nextLine();

                for (int i = 0; i < socios.size(); i++){
                    if (socios.get(i).getDni().equals(dni)){
                        socios.remove(i);
                        System.out.println("Socio eliminado correctamente");
                        break;
                    }
                }
            }

        }while (opcion != 6);
        System.out.println("Programa terminado");
    }
}
