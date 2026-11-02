class main {

    public static void mostrarEtiqueta(String guia, String destino, double peso) {
        System.out.println("Guia: " + guia);
        System.out.println("Destino: " + destino);
        System.out.println("Peso: " + peso + " kg");
    }

    public static void main(String[] args) {
        mostrarEtiqueta("GUIA-02", "Guerrero", 10);
    }
}