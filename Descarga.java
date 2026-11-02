import java.util.Scanner;

public class Descarga {

    public static double calcularTiempo(double tamano, double velocidad) {
        double tiempo = tamano / velocidad;
        return tiempo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamaño del archivo en MB: ");
        double tamano = sc.nextDouble();

        System.out.print("Velocidad en MB/s: ");
        double velocidad = sc.nextDouble();

        if (tamano < 0) {
            System.out.println("Error: el tamaño no puede ser negativo");
        } else if (velocidad <= 0) {
            System.out.println("Error: la velocidad debe ser mayor a 0");
        } else {
            double tiempo = calcularTiempo(tamano, velocidad);
            System.out.println("Tiempo estimado: " + tiempo + " segundos");
        }
    }
}