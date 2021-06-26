package classe_abstrata;


import classe_abstrata.entidades.Account;
import classe_abstrata.entidades.BusinessAccount;
import classe_abstrata.entidades.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        //Account acc1 = new Account(1001, "Alex", 1000.0);
        //a operação acima não funcionaria pois como a classe Account é abstrata não permite instanciação de objeto

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Saldo Total: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.printf("Atualizando saldo da conta %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }

        //esse é um exemplo de como usar uma classe abstrata para fazer operações em vários objetos de uma lista com apenas um comando
        //no primeiro FOR somamos os saldos de todas as contas para saber o total de todos saldos
        //no segundo FOR depositamos 10 reais a mais ao saldo de cada conta com apenas UM comando
    }
}