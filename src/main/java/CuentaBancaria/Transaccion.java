package CuentaBancaria;

import java.time.LocalDate;

public class Transaccion {

    private Monto valor;
    private LocalDate fecha;
    private Monto balance;

    public Transaccion(Monto valor, LocalDate fecha) {

        this.valor = valor;
        this.fecha = fecha;
    }

    public Monto balanceDespuesTransaccion(Monto balanceActual) {
        this.balance = balanceActual.agregar(this.valor);
        return balanceActual.agregar(this.valor);
    }

    public String agregarLinea() {
        StringBuilder nueva = new StringBuilder();
        String fecha = cambioFecha(this.fecha);
        nueva.append(fecha);
        nueva.append("\t|");
        if (!this.valor.mayorQue(0)) {
            nueva.append("\t\t\t\t|");
            nueva.append(this.valor.formatoMoneda());
            nueva.append("\t\t|");
            nueva.append(this.balance.formatoMoneda());
            return nueva.toString().replace("-", "");
        }
        nueva.append(this.valor.formatoMoneda());
        nueva.append("\t\t|\t\t\t|");
        nueva.append(this.balance.formatoMoneda());

        return nueva.toString();
    }


    private static String cambioFecha(LocalDate fecha) {
        String date = String.valueOf(fecha);
        date = date.replace("-", "/");
        return date;

    }

}
