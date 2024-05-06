// Clase Inmueble
public class Inmueble {
    protected int id;
    protected double area;
    protected String direccion;

    public Inmueble(int id, double area, String direccion) {
        this.id = id;
        this.area = area;
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println("ID: " + id);
        System.out.println("Área: " + area + " metros cuadrados");
        System.out.println("Dirección: " + direccion);
    }

    public double calcularPrecio() {
        return area * valorPorMetroCuadrado();
    }

    protected double valorPorMetroCuadrado() {
        return 0; // Valor por defecto, cada tipo de inmueble debe sobrescribir este método
    }
}
