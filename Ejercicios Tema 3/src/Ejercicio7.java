import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Introducción
        String jugador1, jugador2;
        String ganador;
        Scanner sc = new Scanner(System.in);

        // Desarrollo
        System.out.println("Opciones: piedra, papel, tijera, lagarto, spock");
        System.out.print("Jugador 1, elige una opción: ");
        jugador1 = sc.nextLine();
        System.out.print("Jugador 2, elige una opción: ");
        jugador2 = sc.nextLine();

        // Si ambos eligen lo mismo
        if (jugador1.equals(jugador2)) {
            ganador = "Empate";
        } else {
            // Determinar el ganador
            switch (jugador1) {
                case "tijera":
                    if (jugador2.equals("papel") || jugador2.equals("lagarto")) {
                        ganador = "Jugador 1 gana (Tijeras cortan papel o decapitan lagarto)";
                    } else {
                        ganador = "Jugador 2 gana";
                    }
                    break;

                case "papel":
                    if (jugador2.equals("piedra") || jugador2.equals("spock")) {
                        ganador = "Jugador 1 gana (Papel cubre piedra o refuta Spock)";
                    } else {
                        ganador = "Jugador 2 gana";
                    }
                    break;

                case "piedra":
                    if (jugador2.equals("tijera") || jugador2.equals("lagarto")) {
                        ganador = "Jugador 1 gana (Piedra aplasta tijeras o lagarto)";
                    } else {
                        ganador = "Jugador 2 gana";
                    }
                    break;

                case "lagarto":
                    if (jugador2.equals("spock") || jugador2.equals("papel")) {
                        ganador = "Jugador 1 gana (Lagarto envenena Spock o come papel)";
                    } else {
                        ganador = "Jugador 2 gana";
                    }
                    break;

                case "spock":
                    if (jugador2.equals("tijera") || jugador2.equals("piedra")) {
                        ganador = "Jugador 1 gana (Spock rompe tijeras o vaporiza piedra)";
                    } else {
                        ganador = "Jugador 2 gana";
                    }
                    break;

                default:
                    ganador = "Opción no válida. Intenta de nuevo.";
                    break;
            }
        }
        // Final
        System.out.println(ganador);

    }
}

