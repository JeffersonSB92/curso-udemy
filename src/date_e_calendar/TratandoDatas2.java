package date_e_calendar;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class TratandoDatas2 {

    public static void main(String[] args) throws ParseException { //throws ParseException foi adicionado para podermos usar o ".parse" logo abaixo

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // esse comando faz com que os horários sejam convertidos para o fuso horário de greenwich

        Date x1 = new Date(); // cria uma data ATUAL
        Date x2 = new Date(System.currentTimeMillis()); // cria uma data em MILISSEGUNDOS atual



        Date y1 = sdf1.parse("25/06/2018"); //o ".parse" transforma meu dado "25/06/2018" em uma String aceitável para a variável Date
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // na hora de imprimir a data ele irá imprimir 12:42:07 pois por padrão é no horário UTC e o nosso horário é 3h atrasado

        System.out.println(y1);
        System.out.println(y2);

        System.out.println("----------SEM FORMATAÇÃO--------------");

        System.out.println("x1: " +x1);
        System.out.println("x2: " +x2);
        System.out.println("y1: " +y1);
        System.out.println("y2: " +y2);
        System.out.println("y3: " +y3);

        System.out.println("----------TIME ZONE UTC (Brasil)--------------");

        System.out.println("x1: " +sdf2.format(x1));
        System.out.println("x2: " +sdf2.format(x2));
        System.out.println("y1: " +sdf2.format(y1));
        System.out.println("y2: " +sdf2.format(y2));
        System.out.println("y3: " +sdf2.format(y3));

        System.out.println("-------------TIME ZONE GMT (Greenwich)----------------");

        System.out.println("x1: " +sdf3.format(x1));
        System.out.println("x2: " +sdf3.format(x2));
        System.out.println("y1: " +sdf3.format(y1));
        System.out.println("y2: " +sdf3.format(y2));
        System.out.println("y3: " +sdf3.format(y3));
    }
}