package composicao;

import composicao.entidade.ContratoPorHora;
import composicao.entidade.Departamento;
import composicao.entidade.Trabalhador;
import composicao.entidade.enums.NivelDoTrabalhador;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String nomeDoDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeDoTrabalhador = sc.nextLine();
        System.out.print("Nível: ");
        String nivelDoTrabalhador = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        Trabalhador trab = new Trabalhador(nomeDoTrabalhador, NivelDoTrabalhador.valueOf(nivelDoTrabalhador), salarioBase, new Departamento(nomeDoDepartamento));

        System.out.print("Quantos contratos para esse trabalhador? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Entre os dados do contrato #" + i + ":");
            System.out.print("Data (DD/MM/AAAA): ");
            Date dataDoContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração do contrato (horas): ");
            int horas = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataDoContrato, valorPorHora, horas);
            trab.adicionarContrato(contrato);
        }

        System.out.print("Entre com o mês e o ano para calcular o ganho (MM/AAAA): ");
        String month_year = sc.next();
        int month = Integer.parseInt(month_year.substring(0, 2));
        int year = Integer.parseInt(month_year.substring(3));

        System.out.println("Nome: " + trab.getNome());
        System.out.println("Departamento: " + trab.getDepartamento().getNome());
        System.out.println("Ganho em " +month_year + ": " + String.format("%.2f", trab.ganho(year, month)));

        sc.close();
    }
}
