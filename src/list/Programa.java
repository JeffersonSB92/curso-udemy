package list;

import list.entidades.FuncionarioList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<FuncionarioList> list = new ArrayList<>();

        System.out.print("Quantos funcionários irá cadastrar? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionário #"+(i+1)+":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            list.add(new FuncionarioList(id, nome, salario));
            System.out.println();
        }

        System.out.print("Entre o id do funcionário que irá receber aumento: ");
        int find = sc.nextInt();
        FuncionarioList result = list.stream().filter(x -> x.getId() == find).findFirst().orElse(null);
        if (result != null) {
            System.out.print("Entre a porcentagem: ");
            double porc = sc.nextDouble();
            result.aumentoSalario(porc);
        } else {
            System.out.println("Esse ID não existe!");
        }
        System.out.println();

        System.out.println("Lista de Funcionários: ");

        for(FuncionarioList x : list){
            System.out.println(x.toString());
        }
        sc.close();
    }
}