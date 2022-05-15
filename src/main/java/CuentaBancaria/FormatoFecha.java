package CuentaBancaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoFecha {
    private static final String DATE_FORMAT = "dd/MM/yyyy";

    public static LocalDate date(String fecha) {

        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.parse(fecha, formateador);

    }




}
