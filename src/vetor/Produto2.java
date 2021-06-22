package vetor;
import java.util.Locale;
import java.util.Scanner;

import vetor.entidades.ProdutoVetor;

public class Produto2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProdutoVetor[] vect = new ProdutoVetor[n];

        for (int i = 0; i < vect.length; i++){      // trocamos a variável 'n' nas fórmulas por 'vect.length' que é a forma mais coesa do vetor nos retornar o seu próprio tamanho
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new ProdutoVetor(nome, preco);
        }

        double soma = 0.0;
        for ( int i = 0; i < vect.length; i++){
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("Preço Médio = %.2f%n", media);

        sc.close();
    }
}