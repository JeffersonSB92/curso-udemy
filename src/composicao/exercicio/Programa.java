package composicao.exercicio;

import composicao.exemplos.entidades.enums.NivelDoTrabalhador;
import composicao.exercicio.entidades.Cliente;
import composicao.exercicio.entidades.ItensDoPedido;
import composicao.exercicio.entidades.Pedido;
import composicao.exercicio.entidades.Produto;
import composicao.exercicio.entidades.enums.StatusDoPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do Cliente: ");
        System.out.print("Nome: ");
        String nomeDoCliente = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Aniversário (DD/MM/AAAA): ");
        Date dataAniver = sdf.parse(sc.next());
        Cliente cliente = new Cliente (nomeDoCliente, email, dataAniver);
        System.out.println();
        System.out.println("Entre os dados do Pedido: ");
        System.out.print("Status: ");
        sc.nextLine();
        StatusDoPedido status = StatusDoPedido.valueOf(sc.next());
        Date momento = new Date();
        Pedido pedido = new Pedido(momento, status, cliente);
        System.out.println();
        System.out.print("Quantos itens para esse pedido? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++){
            System.out.println("Entre os dados do item #" +i +":");
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String nomeDoProduto = sc.nextLine();
            System.out.print("Preço do Produto: ");
            double precoDoProduto = sc.nextDouble();
            Produto produto = new Produto(nomeDoProduto, precoDoProduto);
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            ItensDoPedido itens = new ItensDoPedido(quantidade,precoDoProduto, produto);
            pedido.addItem(itens);
            System.out.println();
        }

        sc.close();

        System.out.println("Sumário do Pedido: ");
        System.out.println(pedido.toString());

    }
}