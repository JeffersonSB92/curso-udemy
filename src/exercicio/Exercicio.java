//CLASSE PRINCIPAL DE EXERCÍCIO SOBRE CONSTRUTORES, GET, SET E ENCAPSULAMENTO

// pacote exercicio/Exercicio

package exercicio;

import entidades.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente;

        System.out.print("Entre o número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Entre o nome do titular da conta: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Terá depósito inicial (s/n)? ");
        char cond = sc.next().charAt(0);
        if (cond == 's'){
            System.out.print("Entre o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            cliente = new Cliente(numeroConta,nomeTitular,depositoInicial);
        } else {
            cliente = new Cliente (numeroConta, nomeTitular);
        }

        System.out.println("");
        System.out.println("Dados da conta:");
        System.out.println(cliente);
        System.out.println("");
        System.out.print("Entre o valor do depósito: ");
        double deposito = sc.nextDouble();
        cliente.deposito(deposito);
        System.out.println("Atualização de dados da conta:");
        System.out.print(cliente);
        System.out.println();
        System.out.println("");
        System.out.print("Entre o valor do saque: ");
        double saque = sc.nextDouble();
        cliente.saque(saque);
        System.out.println("Atualização de dados da conta:");
        System.out.print(cliente);

        sc.close();
    }
}