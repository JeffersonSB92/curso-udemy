package exercicio.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploList {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        // ADICIONANDO ELEMENTOS NA LISTA// .add //

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add(2, "Marco");

        for (String x : lista) {   //Lê-se "Para cada String de apelido 'x' pertencente à list"//

            System.out.println(x);
        }

        System.out.println("Tamanho da lista: " + lista.size());

        System.out.println("----------------------------------");

        //REMOVENDO ELEMENTOS DA LISTA// .remove //

        lista.removeIf(x -> x.charAt(0) == 'M');    // Lê-se "X tal que X na posição 0 seja igual a M"

        //podemos usar também "list.remove("Anna");" para remover valores específicos
        //ou usar "list.remove(1);" para remover o valor na posição 1 da lista, lembrando com sempre começa por 0

        for (String x : lista) {
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        //PROCURANDO DADOS ESPECÍFICOS NA LISTA// .indexOf //

        System.out.println("Posição do Bob: " + lista.indexOf("Bob"));
        System.out.println("Posição do Marco: " + lista.indexOf("Marco")); //Quando o index não acha uma procura ele retorna o valor -1

        System.out.println("----------------------------------");

        //FILTRANDO ELEMENTOS NA LISTA// NomeDaListaASerFiltrada.stream().filter(x -> x.charAt(0) == 'condição à ser filtrada').collect(Collectors.toList());

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()) ;
        //o comando acima é utilizado para filtrar na lista, o parâmetro usado foram nomes iniciando com "A"
        //criamos outra lista com nome "resultado", usamos a lista original (de nome "lista") e transformamos ela em STREAM para podermos usar o filtro
        //em seguida usamos o filtro passando como parâmetro componentes que tenha na posição 0 a letra A
        //depois de filtrado convertemos esse resultado STREAM em List novamente usando o Collect
        //então a nova lista chamada "resultado" recebe os valores filtrados com essa operação

        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println("----------------------------------");

        //ACHANDO O PRIMEIRO ELEMENTO QUE ATENDA A UM PARÂMETRO// .findFirst().orElse(null)//

        String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        String nome2 = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        // para encontrarmos o primeiro elemento com o filtro que usarmos usamos essa expressão
        // usamos o filter com os mesmos parâmetros, para retornar os iniciados em 'A'
        // depois usamos findFirst() para retornar o primeiro dessa seleção
        // e depois o orElse(null) para retornar nulo se não achar resultados no filtro

        System.out.println("Primeira seleção: " +nome);
        System.out.println("Segunda seleção: " +nome2);
    }
}