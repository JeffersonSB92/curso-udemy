package composicao.exercicio.entidades;

import composicao.exemplos.entidades.Comentario;
import composicao.exercicio.entidades.enums.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private StatusDoPedido status;

    private Cliente cliente;
    List<ItensDoPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, StatusDoPedido status, Cliente cliente) {
        this.momento = momento;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensDoPedido> getItens() {
        return itens;
    }

    public void addItem(ItensDoPedido item) {
        itens.add(item);
    }

    public void removeItem(ItensDoPedido item) {
        itens.remove(item);
    }

    public double total() {
        double total = 0.0;
        for (ItensDoPedido x : itens) {
            total = x.getPreco() * x.getQuantidade();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Momento do pedido" + sdf1.format(momento) + "\n");
        sb.append("Status do Pedido" + status + "\n");
        sb.append("Cliente" + cliente.getNome() + " (" + cliente.getDataAniver() + ") - " + cliente.getEmail() + "\n");
        sb.append("Itens do pedido: ");
        for (ItensDoPedido x : itens) {
            sb.append(x.getProduto().getNome()
                    + ", R$ "
                    + x.getPreco()
                    + ", Quantidade: "
                    + x.getQuantidade()
                    + ", Subtotal: R$ "
                    + x.subTotal() + "\n");
        }
        sb.append("Preço Total: R$ " + total());

        return sb.toString();
    }
}