// Clase Casa hereda de InmuebleVivienda
public class Casa extends InmuebleVivienda {
    protected boolean conjuntoCerrado;

    public Casa(int id, double area, String direccion, int numHabitaciones, int numBanos, boolean conjuntoCerrado) {
        super(id, area, direccion, numHabitaciones, numBanos);
        this.conjuntoCerrado = conjuntoCerrado;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Casa");
        System.out.println("¿Conjunto cerrado?: " + (conjuntoCerrado ? "Sí" : "No"));
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return conjuntoCerrado ? 2500000 : 2000000;
    }
}
