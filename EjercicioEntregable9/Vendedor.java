// Clase Vendedor que hereda de Empleado
public class Vendedor extends Empleado {
    double ventasMensuales;

    public Vendedor(String nombre, String dni, String domicilio, int fechaIngreso, double ventasMensuales) {
        super(nombre, dni, domicilio, fechaIngreso);
        this.ventasMensuales = ventasMensuales;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (ventasMensuales * 0.005);
    }

    @Override
    public void imprimirRecibo() {
        super.imprimirRecibo();
        System.out.println("Comisiones por ventas: $" + (ventasMensuales * 0.005));
        System.out.println("Total a cobrar: $" + calcularSueldo());
    }
}
