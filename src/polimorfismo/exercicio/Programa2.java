package polimorfismo.exercicio;

import polimorfismo.exercicio.entidades.Produto;
import polimorfismo.exercicio.entidades.ProdutoImportado;
import polimorfismo.exercicio.entidades.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa2 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> prod = new ArrayList<>();

        System.out.print("Entre o número de produtos: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados do Pedido #" + (i + 1) + ":");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char cui = sc.next().charAt(0);
            sc.nextLine();
            if (cui == 'c') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                Double preco = sc.nextDouble();
                prod.add(new Produto(nome, preco));
            } else if (cui == 'u') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                Double preco = sc.nextDouble();
                System.out.print("Data de Fabricação (DD/MM/AAAA): ");
                Date dataFabricacao = sdf.parse(sc.next());
                prod.add(new ProdutoUsado(nome, preco, dataFabricacao));
            } else {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                Double preco = sc.nextDouble();
                System.out.print("Taxa: ");
                Double taxa = sc.nextDouble();
                prod.add(new ProdutoImportado(nome, preco, taxa));
            }
        }

        System.out.println("Etiquetas de Preço: ");
        for (Produto x : prod) {
            System.out.println(x.etiquetaPreco());
        }

    }
}