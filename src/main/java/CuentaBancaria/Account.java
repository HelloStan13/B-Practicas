package CuentaBancaria;

import java.io.PrintStream;
import java.time.LocalDate;

public class Account {

    private Statement statement;

    private Monto balance = Monto.amountOf(0);

    public Account(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Monto valor, LocalDate fecha) {
        guardarTransaccion(valor, fecha);
    }

    public void withdrawal(Monto valor, LocalDate fecha) {
        guardarTransaccion(valor.negativo(), fecha);
    }

    public void printStatement(PrintStream printer) {
        statement.printTo(printer);
    }

    private void guardarTransaccion(Monto valor, LocalDate fecha) {
        Transaccion transaccion = new Transaccion(valor, fecha);
        Monto balanceDespuesTransaccion = transaccion.balanceDespuesTransaccion(balance);
        balance = balanceDespuesTransaccion;
        statement.agregarLinea(transaccion);
    }

}
