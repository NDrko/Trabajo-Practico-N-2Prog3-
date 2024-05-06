// Clase Oficina que hereda de InmuebleComercial
public class Oficina extends InmuebleComercial {
    public Oficina(int id, double area, String direccion, String localizacion) {
        super(id, area, direccion, localizacion);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return 2400000;
    }
}
