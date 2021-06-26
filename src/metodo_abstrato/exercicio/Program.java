package metodo_abstrato.exercicio;

import metodo_abstrato.exercicio.entidades.Contribuinte;
import metodo_abstrato.exercicio.entidades.PF;
import metodo_abstrato.exercicio.entidades.PJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Entre o número de contribuintes: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Dados do Contribuinte #" +(i + 1) +":");
            System.out.print("Pessoa Física ou Jurídica (f/j)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if(ch == 'f'){
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                Double rendaAnual = sc.nextDouble();
                System.out.print("Gasto com Saúde: ");
                Double gastoSaude = sc.nextDouble();
                list.add(new PF(nome, rendaAnual, gastoSaude));
            } else {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda Anual: ");
                Double rendaAnual = sc.nextDouble();
                System.out.print("Número de Funcionários: ");
                int funcionarios = sc.nextInt();
                list.add(new PJ(nome, rendaAnual, funcionarios));
            }
        }

        System.out.println("Impostos Pagos: ");
        for(Contribuinte x : list){
            System.out.printf("%s: R$ %.2f%n", x.getNome(), x.imposto());
        }

        double sum = 0.0;
        for (Contribuinte x : list){
            sum += x.imposto();
        }

        System.out.printf("TOTAL DE IMPOSTOS: R$ %.2f%n", sum);
    }
}











