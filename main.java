import java.util.Scanner;

class main {

    public static int calcularMinutos(int bateria) {
        int minutos = 0;

        while (bateria < 100) {
            bateria = bateria + 8;
            if (bateria > 100) {
                bateria = 100;
            }
            minutos++;
        }
        return minutos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "si";

        while (opcion.equals("si")) {
            System.out.print("¿Cuánta bateria tiene? (0-100):");
            int bateria = sc.nextInt();

            if (bateria < 0 || bateria > 100) {
                System.out.println("Error: debe estar entre el 0 y el 100");
            } else {
                int minutos = calcularMinutos(bateria);
                System.out.println("faltan " + minutos + " minutos para cargar completamente");
            }

            System.out.print("¿Revisar bateria de nuevo? (si/no):");
            opcion = sc.next();
        }

        System.out.println("Fin de la revision");
    }
}