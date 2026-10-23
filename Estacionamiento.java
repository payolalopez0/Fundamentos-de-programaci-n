import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int precioxHora = 15;
        final int descuento = 10;

        int totalCarros = 0;
        double totalRecaudado = 0;
        int carrosConDescuento = 0;

        System.out.println("Si quieres salir, ingresa 0");

        while (true) {
            System.out.print("Horas que estuviste estacionado:");
            double horas = sc.nextDouble();

            if (horas == 0) {
                break;
            }

            if (horas < 0) {
                System.out.println("Horas negativas no son validas, intenta de nuevo");
                continue;
            }

            double pago = horas * precioxHora;

            if (horas > 5) {
                pago = pago - descuento;
                carrosConDescuento++;
                System.out.println(" tu descuento es de $" + descuento + ", aplicadoexitosamente");
            }

            System.out.printf("Este carro pagara:"+ pago);

            totalCarros++;
            totalRecaudado += pago;
        }

        if (totalCarros > 0) {
            double promedio = totalRecaudado / totalCarros;
            System.out.println("Total de automoviles que estuvieron: " + totalCarros);
            System.out.printf("Total de dinero que se gano: $ " + totalRecaudado);
            System.out.println("Carros con descuento: " + carrosConDescuento);
            System.out.printf("Promedio pagado por carro: $ ", promedio);
        } else {
            System.out.println("No se atendio ningun coche hoy");
        }
    }
}