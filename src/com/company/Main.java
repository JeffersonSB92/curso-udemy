package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        // ADICIONANDO HORAS AO TEMPO JÁ DEFINIDO //

        Calendar cal = Calendar.getInstance(); // instanciado um calendário
        cal.setTime(d); // SETAMOS uma data, no caso usamos a variável "d" já instanciada
        cal.add(Calendar.HOUR_OF_DAY, 4); // assim adicionamos quantas HORAS quisermos à nossa data já existente, podemos adicionar tbm dias, minutos, segundos
        d = cal.getTime(); // assim guardamos a alteração na variável D

        System.out.println(sdf.format(d));

        // OBTENDO UMA UNIDADE DE TEMPO // no exemplo queriamos descobrir quantos MINUTOS tinham na data pré definida no sdf1

        System.out.println("-----------------------------------------");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf1.format(d1));

        Calendar cal1 = Calendar.getInstance();
        cal.setTime(d1);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println("Minutes: " +minutes);
        System.out.println("Month: " +month);

    }
}