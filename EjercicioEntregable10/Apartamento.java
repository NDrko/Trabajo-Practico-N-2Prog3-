// Clase Apartamento que hereda de InmuebleVivienda
public class Apartamento extends InmuebleVivienda {
    protected boolean monoambiente;

    public Apartamento(int id, double area, String direccion, int numBanos, boolean monoambiente) {
        super(id, area, direccion, monoambiente ? 0 : 1, numBanos);
        this.monoambiente = monoambiente;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: Apartamento");
        System.out.println("¿Monoambiente?: " + (monoambiente ? "Sí" : "No"));
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return monoambiente ? 1000000 : 1800000;
    }
}
