import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class SistemaEstudiantes {

    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Set<String> ciudades = new HashSet<>();
        Map<String, ArrayList<Estudiante>> mapaCiudades = new HashMap<>();
        Queue<Estudiante> cola = new LinkedList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader("estudiantes.csv"));
            String linea;

            while((linea = br.readLine()) != null){

                System.out.println("Leyendo: " + linea);

                String[] datos = linea.split(",");

                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciudad = datos[2];
                double nota = Double.parseDouble(datos[3]);

                Estudiante e = new Estudiante(nombre,edad,ciudad,nota);

                estudiantes.add(e);
            }

            br.close();

        } catch(Exception e){
            e.printStackTrace();
        }

        // Mostrar estudiantes
        System.out.println("LISTA DE ESTUDIANTES");
        for(Estudiante e : estudiantes){
            System.out.println(e);
        }

        //Guardar ciudades únicas
        for(Estudiante e : estudiantes){
            ciudades.add(e.getCiudad());
        }

        System.out.println("\nCIUDADES UNICAS");
        for(String c : ciudades){
            System.out.println(c);
        }

        //Agrupar estudiantes por ciudad
        for(Estudiante e : estudiantes){

            if(!mapaCiudades.containsKey(e.getCiudad())){
                mapaCiudades.put(e.getCiudad(), new ArrayList<>());
            }

            mapaCiudades.get(e.getCiudad()).add(e);
        }

        System.out.println("\nESTUDIANTES POR CIUDAD");

        for(String ciudad : mapaCiudades.keySet()){

            System.out.println("Ciudad: " + ciudad);

            for(Estudiante e : mapaCiudades.get(ciudad)){
                System.out.println("  " + e);
            }
        }

        //Cola de atención
        cola.addAll(estudiantes);

        System.out.println("\nATENDIENDO ESTUDIANTES");

        while(!cola.isEmpty()){

            Estudiante e = cola.poll();

            System.out.println("Atendiendo a: " + e);
        }

    }
}