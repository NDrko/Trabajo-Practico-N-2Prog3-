import java.math.BigDecimal;
public static void main(String[] args) {
    Titulartarjeta titular = new Titulartarjeta ("12345678A", "Juan", "Perez", "123456789", "juan.perez@example.com");
    TarjetaCredito tarjeta = new TarjetaCredito("Visa", "Banco X", "1234-5678-9012-3456", BigDecimal.valueOf(15000), titular);
    Posnet posnet = new Posnet();

    BigDecimal monto = BigDecimal.valueOf(10000);
    int cuotas = 5;

    String resultado = posnet.efectuarPago(tarjeta, monto, cuotas);
    System.out.println(resultado);
}
