import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos = 100;
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Elige alguna opcion: ");

            opcion = sc.nextInt();

            if (opcion == 1) {
                puntos = puntos + 20;
                System.out.println("ganaste 20 puntos más:" + puntos);
            } else if (opcion == 2) {
                if (puntos >= 15) {
                    puntos = puntos - 15;
                    System.out.println("gastaste 15 puntos más: " + puntos);
                } else {
                    System.out.println("Opcion inválida, tienes menos de 15 puntos");
                }
            } else if (opcion == 3) {
                System.out.println("tienes " + puntos + "puntos");
            } else if (opcion == 4) {
                System.out.println("saliendo del juego");
            } else {
                System.out.println("Opción no valida.");
            }
        }
    }
}