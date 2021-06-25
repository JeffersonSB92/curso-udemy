package polimorfismo.exercicio;

import polimorfismo.exercicio.entidades.Empregado;
import polimorfismo.exercicio.entidades.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Empregado> emp = new ArrayList<>();

        System.out.print("Entre o número de empregados: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados do Empregado #" + (i + 1) + ":");
            System.out.print("Terceirizado (s/n)? ");
            char sn = sc.next().charAt(0);
            if (sn == 's') {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                Integer horas = sc.nextInt();
                System.out.print("Valor por Hora: ");
                Double valorPorHora = sc.nextDouble();
                System.out.print("Gasto Adicional: ");
                Double gastoAdicional = sc.nextDouble();
                emp.add(new Terceirizado(nome, horas, valorPorHora, gastoAdicional));
            } else {
                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Horas: ");
                Integer horas = sc.nextInt();
                System.out.print("Valor por Hora: ");
                Double valorPorHora = sc.nextDouble();
                emp.add(new Empregado(nome, horas, valorPorHora));
            }
        }

        System.out.println("Pagamentos: ");
        for(Empregado x : emp){
            System.out.println(x.toString());
        }
    }
}