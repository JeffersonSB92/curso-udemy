package polimorfismo.exemplos;

import polimorfismo.exemplos.entidades.Conta;
import polimorfismo.exemplos.entidades.ContaNegocios;
import polimorfismo.exemplos.entidades.ContaPoupanca;

public class Programa {

    public static void main(String[] args){

        Conta ct = new Conta(1001, "Alex", 0.0);
        ContaNegocios ctn = new ContaNegocios(1002, "Maria", 0.0, 500.0);

        //UPCASTING - no Upcasting mostramos que é possível atribuir um objeto de uma subclasse à uma superclasse

        Conta ct1 = ctn;
        Conta ct2 = new ContaNegocios(1003, "Bob", 0.0, 200.0);
        Conta ct3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01) ;

        //DOWNCASTING - aqui mostramos o inverso, atribuindo uma Superclasse à uma subclasse

        ContaNegocios ct4 = (ContaNegocios) ct2;
        ct4.emprestimo(100.0);
        //pudemos fazer a operação de "empréstimo" pois fizemos o downcasting, pois originalmente a variável ct2 é do tipo conta,
        //que não possui a opção "emprestimo"

        // ContaNegocios ct5 = (ContaNegocios)  ct3; - essa expressão não acusa erro ao compilador, porém, ct3 foi instanciado como
        // uma ContaPoupança então ao fazermos o donwcasting dele "(ContaNegocios) ct3" para o tipo ContaNegocios
        //na hora de executar o programa não compilará, então, nem sempre o Downcasting funcionará, temos que nos atentar
        //aos tipos de objetos que estamos trabalhando
        //para testarmos se um objeto é instância de outro usamos a seguinte estrutua:

        if (ct3 instanceof ContaNegocios){
            ContaNegocios ct5 = (ContaNegocios) ct3;
            ct5.emprestimo(200.0);
            System.out.println("Empréstimo!!");
        }

        if (ct3 instanceof ContaPoupanca){
            ContaPoupanca ct5 = (ContaPoupanca) ct3;
            ct5.updateSaldo();
            System.out.println("Update!!");
        }

        //exemplo de @override

        Conta ct6 = new Conta(1010, "Alex", 1000.0);
        ct6.saque(200.0);
        System.out.println(ct6.getSaldo());

        // em ct6 e ct7 temos um exemplo de como o Override do método SAQUE funcionou diferente para cada classe por conta do Override
        Conta ct7 = new ContaPoupanca(1011, "Maria", 1000.0, 0.01);
        ct7.saque(200.0);
        System.out.println(ct7.getSaldo());

        // em ct8 utilizamos a lógica implementada já no método SAQUE da superclasse onde cada saque desconta o valor de 5.0 e
        // acrescentamos uma lógica para descontar mais 2.0 direto na subclasse ContaNegocios
        Conta ct8 = new ContaNegocios(1012, "Bob", 1000.0, 500.0);
        ct8.saque(200.0);
        System.out.println(ct8.getSaldo());

        //POLIMORFISMO - no exemplo abaixo instanciamos X e Y como sendo do tipo CONTA, porém X foi instanciado como sendo do tipo Conta
        // e Y como sendo do tipo ContaPoupanca, logo, mesmo sendo ambos do tipo CONTA cada um se comportou de acordo com os métodos
        // de suas respectivas classes na hora do saque, isso é POLIMORFISMO

        Conta x = new Conta(1013, "Alex", 1000.0);
        Conta y = new ContaPoupanca(1014, "Maria", 1000.0, 0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
    }
}