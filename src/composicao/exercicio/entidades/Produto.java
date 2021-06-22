package composicao.exercicio.entidades;

public class Produto {

    private String nome;
    private double preco;

    public Produto() {
    }

    public Produto(String nomeDoProduto, double precoDoProduto) {
        nome = nomeDoProduto;
        preco = precoDoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeDoProduto) {
        nome = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double precoDoProduto) {
        preco = precoDoProduto;
    }
}