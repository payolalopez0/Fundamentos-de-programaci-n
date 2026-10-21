import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int puntosObtenidos = 0;
        int masDeMilPuntos = 0;
        int menosOIgualAMil = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingresa la puntuacion obtenida de la partida" + i + ":");
            int puntuacion = sc.nextInt();

            puntosObtenidos = puntosObtenidos + puntuacion;

            if (puntuacion > 1000) {
                masDeMilPuntos++;
            } else {
                menosOIgualAMil++;
            }
        }

        double promedio = puntosObtenidos / 7.0;

        System.out.println("Tus untos acumulados:" + puntosObtenidos);
        System.out.println("Promedio de tu puntuacion:" + promedio);
        System.out.println("Partidas con mas de 1000 puntos:" + masDeMilPuntos);
        System.out.println("Partidas con 1000 puntos o menos:" + menosOIgualAMil);

    }
}
