// Clase Empleado que hereda de Persona
public class Empleado extends Persona {
    double sueldoBasico = 650000;

    public Empleado(String nombre, String dni, String domicilio, int fechaIngreso) {
        super(nombre, dni, domicilio, fechaIngreso);
    }

    public double calcularSueldo() {
        return sueldoBasico;
    }

    public void imprimirRecibo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        System.out.println("Sueldo básico: $" + sueldoBasico);
    }
}

