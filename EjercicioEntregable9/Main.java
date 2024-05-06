import java.util.Scanner;

// Clase principal Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos para el vendedor
        System.out.println("Ingrese los datos del vendedor:");
        System.out.print("Nombre: ");
        String nombreVendedor = scanner.nextLine();
        System.out.print("DNI: ");
        String dniVendedor = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilioVendedor = scanner.nextLine();
        System.out.print("Fecha de ingreso: ");
        int fechaIngresoVendedor = scanner.nextInt();
        System.out.print("Ventas mensuales: ");
        double ventasMensuales = scanner.nextDouble();

        // Instanciar el vendedor con los datos ingresados
        Empleado empleado1 = new Vendedor(nombreVendedor, dniVendedor, domicilioVendedor, fechaIngresoVendedor, ventasMensuales);

        // Pedir datos para el administrativo
        System.out.println("Ingrese los datos del administrativo:");
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Nombre: ");
        String nombreAdmin = scanner.nextLine();
        System.out.print("DNI: ");
        String dniAdmin = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilioAdmin = scanner.nextLine();
        System.out.print("Fecha de ingreso: ");
        int fechaIngresoAdmin = scanner.nextInt();
        System.out.print("Horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("¿A trabajado lajornada completa? (Verdadero / Falso): ");
        boolean jornadaCompleta = scanner.nextBoolean();

        // Instanciar el administrativo con los datos ingresados
        Empleado empleado2 = new Administrativo(nombreAdmin, dniAdmin, domicilioAdmin, fechaIngresoAdmin, horasTrabajadas, jornadaCompleta);

        // Pedir datos para el repartidor
        System.out.println("Ingrese los datos del repartidor:");
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Nombre: ");
        String nombreRepartidor = scanner.nextLine();
        System.out.print("DNI: ");
        String dniRepartidor = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilioRepartidor = scanner.nextLine();
        System.out.print("Fecha de ingreso: ");
        int fechaIngresoRepartidor = scanner.nextInt();
        System.out.print("Repartos mensuales: ");
        int repartosMensuales = scanner.nextInt();

        // Instanciar el repartidor con los datos ingresados
        Empleado empleado3 = new Repartidor(nombreRepartidor, dniRepartidor, domicilioRepartidor, fechaIngresoRepartidor, repartosMensuales);

        // Llamar al método imprimirRecibo para cada empleado
        System.out.println("\nRecibo del Vendedor:");
        empleado1.imprimirRecibo();
        System.out.println("--------------------------");
        System.out.println("\nRecibo del Administrativo:");
        empleado2.imprimirRecibo();
        System.out.println("--------------------------");
        System.out.println("\nRecibo del Repartidor:");
        empleado3.imprimirRecibo();

        // Cerrar el scanner
        scanner.close();
    }
}
