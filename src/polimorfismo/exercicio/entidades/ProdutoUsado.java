package polimorfismo.exercicio.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataFabricacao;

    public ProdutoUsado(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public final String etiquetaPreco(){
        return getNome()
                +" (usado) R$ "
                +String.format("%.2f", getPreco())
                +" (Data de Fabricação: "
                +sdf.format(dataFabricacao)
                +")";
    }
}
