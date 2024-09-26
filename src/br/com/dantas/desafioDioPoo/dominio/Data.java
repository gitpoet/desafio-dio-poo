package br.com.dantas.desafioDioPoo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    public String formatarData(LocalDate data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }
}

