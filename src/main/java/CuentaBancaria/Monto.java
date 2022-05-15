package CuentaBancaria;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Monto {


    private DecimalFormat formatoDecimal = new DecimalFormat("#.00");

    private int valor;
    private LocalDate fecha;

    public Monto(int valor) {
        this.valor = valor;
    }

    public static Monto amountOf(int valor) {
        return new Monto(valor);
    }

    public Monto agregar(Monto otherMonto) {
        return amountOf(this.valor + otherMonto.valor);
    }


    public Monto valorAbsoluto() {
        return amountOf(Math.abs(this.valor));
    }

    public String formatoMoneda() {
        return formatoDecimal.format(this.valor);
    }

    public Monto negativo() {
        return amountOf(-valor);
    }

    public boolean mayorQue(double comparador) {
        return this.valor > comparador;
    }

}
