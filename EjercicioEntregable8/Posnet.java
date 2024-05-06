import java.math.BigDecimal;

public class Posnet {
    public String efectuarPago(TarjetaCredito tarjeta, BigDecimal monto, int cuotas) {
        BigDecimal incremento = BigDecimal.valueOf(0.03).multiply(BigDecimal.valueOf(cuotas - 1));
        BigDecimal montoTotal = monto.multiply(BigDecimal.ONE.add(incremento));
        BigDecimal montoCuota = montoTotal.divide(BigDecimal.valueOf(cuotas));

        if (tarjeta.getSaldoDisponible().compareTo(montoTotal) >= 0) {
            return "Nombre: " + tarjeta.titular.getNombre() + " " + tarjeta.titular.getApellido() +
                    "\nMonto total a pagar: " + montoTotal +
                    "\nMonto de cada cuota: " + montoCuota;
        } else {
            return null;
        }
    }
}