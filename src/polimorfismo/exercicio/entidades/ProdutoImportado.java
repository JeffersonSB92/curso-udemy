package polimorfismo.exercicio.entidades;

public class ProdutoImportado extends Produto{

    private Double taxa;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double precoTotal(){
        return getPreco() + taxa;
    }

    @Override
    public final String etiquetaPreco(){
        return getNome()
                +" R$ "
                +String.format("%.2f", precoTotal())
                +" (Taxa: R$ "
                +String.format("%.2f",taxa)
                +")";
    }
}