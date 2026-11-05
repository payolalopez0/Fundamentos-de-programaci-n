import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unidades = 100;
        double opcion = 0;

        System.out.println("1.Recibir");
        System.out.println("2.Retirar");
        System.out.println("3.Consultar");
        System.out.println("4.Finalizar");
        System.out.println("Ingresa una opcion:");

        opcion = sc.nextDouble();

        int unidadesfinales = 0;
        int unidadesrecibidas = 0;
        int unidadesretiradas = 0;
        int unidadesexitosas = 0;


        if (opcion == 1) {
                System.out.println("Ingresa las unidades a recibir");
                unidades = sc.nextDouble();
                if (unidades < 100);
            System.out.println("total de unidades: "+ unidades);
        } else if (opcion == 2) {
                System.out.println("Ingresa unidades a retirar");
                //System.out.println("Capacidad exedida");
        } else if (opcion == 3) {
                System.out.println("existencias actuales");
        } else if (opcion == 4) {
                System.out.println("finalizado...");
                System.out.println("existencias finales: " + unidadesrecibidas);
                System.out.println("total de unidades recibidas: " + unidadesrecibidas);
                System.out.println("total de unidades retiradas: " + unidadesretiradas);
                System.out.println("recepciones exitosas: " + unidadesexitosas);
                System.out.println("retiros exitosos: " + unidades);
                System.out.println("operaciones rechazadas: " + unidades);
        }
        unidades = sc.nextDouble();
        if (unidades < 30) {
            System.out.println("Inventario bajo");
        }
        }
    }