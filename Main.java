import java.util.Scanner;

public class Main {

    public static int[] capturarCalificaciones() {
        Scanner sc = new Scanner(System.in);
        int[] calificaciones = new int[10];

        for (int i = 0; i < 10; i++) {
            int cal = -1;
            while (cal < 0 || cal > 100) {
                System.out.print("calificación del alumno " + (i + 1) + ": ");
                cal = sc.nextInt();
                if (cal < 0 || cal > 100) {
                    System.out.println("Calificación invalida, ingresela de nuevo");
                }
            }
            calificaciones[i] = cal;
        }

        return calificaciones;
    }

    public static void mostrarCalificaciones(int[] calificaciones) {
        System.out.println("\nCalificaciones capturadas:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }
    }

    public static int contarAprobados(int[] calificaciones) {
        int aprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] >= 70) {
                aprobados = aprobados + 1;
            }
        }
        return aprobados;
    }

    public static int contarReprobados(int[] calificaciones) {
        int reprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (calificaciones[i] < 70) {
                reprobados = reprobados + 1;
            }
        }
        return reprobados;
    }

    public static void main(String[] args) {
        int[] calificaciones = capturarCalificaciones();
        mostrarCalificaciones(calificaciones);

        int aprobados = contarAprobados(calificaciones);
        int reprobados = contarReprobados(calificaciones);

        System.out.println("\nAlumnos aprobados: " + aprobados);
        System.out.println("Alumnos reprobados: " + reprobados);
    }
}