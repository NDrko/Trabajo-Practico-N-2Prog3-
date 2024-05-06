// Clase InmuebleVivienda que hereda de la clase Inmueble
public class InmuebleVivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBanos;

    public InmuebleVivienda(int id, double area, String direccion, int numHabitaciones, int numBanos) {
        super(id, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Número de baños: " + numBanos);
    }
}
