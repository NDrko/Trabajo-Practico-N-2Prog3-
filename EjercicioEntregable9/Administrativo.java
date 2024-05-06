// Clase Administrativo que hereda de Empleado
public class Administrativo extends Empleado {
    int horasTrabajadas;
    boolean jornadaCompleta;

    public Administrativo(String nombre, String dni, String domicilio, int fechaIngreso, int horasTrabajadas, boolean jornadaCompleta) {
        super(nombre, dni, domicilio, fechaIngreso);
        this.horasTrabajadas = horasTrabajadas;
        this.jornadaCompleta = jornadaCompleta;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = super.calcularSueldo();
        if (jornadaCompleta)
            sueldo -= horasTrabajadas * 500;
        else
            sueldo -= horasTrabajadas * 250;
        return sueldo;
    }

    @Override
    public void imprimirRecibo() {
        super.imprimirRecibo();
        System.out.println("Total de horas trabajadas: " + horasTrabajadas);
        System.out.println("Tipo de jornada: " + (jornadaCompleta ? "Completa" : "Media jornada"));
        System.out.println("Total a cobrar: $" + calcularSueldo());
    }
}
