// Clase Repartidor que hereda de Empleado
public class Repartidor extends Empleado {
    int repartosMensuales;

    public Repartidor(String nombre, String dni, String domicilio, int fechaIngreso, int repartosMensuales) {
        super(nombre, dni, domicilio, fechaIngreso);
        this.repartosMensuales = repartosMensuales;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + (repartosMensuales * 500);
    }

    @Override
    public void imprimirRecibo() {
        super.imprimirRecibo();
        System.out.println("Repartos mensuales: " + repartosMensuales);
        System.out.println("Total a cobrar: $" + calcularSueldo());
    }
}
