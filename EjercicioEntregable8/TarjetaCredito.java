import java.math.BigDecimal;

public class TarjetaCredito {
    private String entidadEmisora;
    private String entidadBancaria;
    private String numeroTarjeta;
    private BigDecimal saldoDisponible;
    Titulartarjeta titular;

    public TarjetaCredito(String entidadEmisora, String entidadBancaria, String numeroTarjeta, BigDecimal saldoDisponible, Titulartarjeta titular) {
        this.entidadEmisora = entidadEmisora;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }

    // Getter para saldo disponible
    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    // Setter para saldo disponible
    public void setSaldoDisponible(BigDecimal saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
