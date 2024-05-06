// Clase LocalComercial que hereda de InmuebleComercial
public class LocalComercial extends InmuebleComercial {
    protected String centroComercial;

    public LocalComercial(int id, double area, String direccion, String localizacion, String centroComercial) {
        super(id, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Centro Comercial: " + centroComercial);
    }

    @Override
    protected double valorPorMetroCuadrado() {
        return 3000000;
    }
}
