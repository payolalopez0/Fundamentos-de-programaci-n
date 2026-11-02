import java.util.Scanner;

public class main {

    public static double calcularRenta(double tarifa, double horas) {
        double total = tarifa * horas;
        return total;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("Lo que debe pagar es: $" + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tarifa por cada hora:");
        double tarifa = sc.nextDouble();

        System.out.print("Horas:");
        double horas = sc.nextDouble();

        if (tarifa <= 0 || horas <= 0) {
            System.out.println("Debe ser mayor a 0");
        } else {
            double total = calcularRenta(tarifa, horas);
            mostrarComprobante(total);
        }
    }
}