package date_e_calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class UsandoCalendar {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //instanciada a data

        System.out.println(sdf.format(d)); //impressa a data usando sdf como parâmetro de formatação

        //ADICIONANDO HORA À UM HORÁRIO JÁ DEFINIDO
        Calendar cal = Calendar.getInstance(); //instanciado calendário
        cal.setTime(d); // acrescentado a data "d" dentro do calendário "cal"
        cal.add(Calendar.HOUR_OF_DAY, 4 ); // acrescentando 4 horas ao horário
        d = cal.getTime(); //adicionamos em "d" o novo horário com 4 hora a mais

        System.out.println(sdf.format(d));

        System.out.println("---------------------------------------------------");

        // "PEGANDO" VALORES DE DATAS EXISTENTES

        int hora = cal.get(Calendar.HOUR_OF_DAY);
        int minuto = cal.get(Calendar.MINUTE);
        int segundo = cal.get(Calendar.SECOND);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = 1 + cal.get(Calendar.MONTH); // temos que botar "1+" antes da chamada pois os meses começam a contagem em ZERO, logo JANEIRO é o mês 0 e não o mês 1
        int ano = cal.get(Calendar.YEAR);

        System.out.println("HORAS: " +hora);
        System.out.println("MINUTOS: " +minuto);
        System.out.println("SEGUNDOS: " +segundo);
        System.out.println("DIA: " +dia);
        System.out.println("MÊS: " +mes);
        System.out.println("ANO: " +ano);

    }
}