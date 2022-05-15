package CuentaBancaria;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Statement {


    private final String CABECERA = "data \t\t| Credito \t    | Debito \t| Balance   ";
    private List<String> balance;

    public Statement() {
        this.balance = new LinkedList<String>();
        this.balance.add(CABECERA);
    }


    //Agregar cada transaccion
    public void agregarLinea(Transaccion transaccion) {
        this.balance.add(1, transaccion.agregarLinea());

    }


    public void printTo(PrintStream salida) {
        for (String line : this.balance) {
            salida.println(line);
        }

    }

}
