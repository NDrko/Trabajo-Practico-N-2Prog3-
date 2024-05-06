// Clase Principal
public class Principal {
    public static void main(String[] args) {
        Casa casa = new Casa(12345, 200, "Calle Principal", 3, 2, true);
        Apartamento apartamento = new Apartamento(54321, 100, "Avenida Central", 1, false);

        System.out.println("Detalles de la Casa:");
        casa.imprimir();
        System.out.println("Precio de venta: $" + formatPrecio(casa.calcularPrecio()));

        System.out.println("\nDetalles del Apartamento:");
        apartamento.imprimir();
        System.out.println("Precio de venta: $" + formatPrecio(apartamento.calcularPrecio()));
    }

    public static String formatPrecio(double precio) {
        return String.format("%.2f", precio);
    }
}
