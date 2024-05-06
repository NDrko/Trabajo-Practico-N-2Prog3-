// Clase InmuebleComercial que hereda de Inmueble
public class InmuebleComercial extends Inmueble {
    protected String localizacion;

    public InmuebleComercial(int id, double area, String direccion, String localizacion) {
        super(id, area, direccion);
        this.localizacion = localizacion;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + getClass().getSimpleName());
        System.out.println("Localización: " + localizacion);
    }
}
