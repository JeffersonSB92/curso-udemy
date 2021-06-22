package composicao.exercicio.entidades;

import composicao.exemplos.entidades.Comentario;
import composicao.exercicio.entidades.enums.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private StatusDoPedido status;

    private Cliente cliente;
    List<ItensDoPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, StatusDoPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
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
            total += x.getPreco() * x.getQuantidade();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Momento do pedido: " + sdf1.format(momento) + "\n");
        sb.append("Status do Pedido: " + status + "\n");
        sb.append("Cliente: " + cliente.getNome() + " (" + sdf.format(cliente.getDataAniver()) + ") - " + cliente.getEmail() + "\n");
        sb.append("Itens do pedido: \n");
        for (ItensDoPedido x : itens) {
            sb.append(x.getProduto().getNome()
                    + ", R$ "
                    + String.format("%.2f", x.getPreco())
                    + ", Quantidade: "
                    + x.getQuantidade()
                    + ", Subtotal: R$ "
                    + String.format("%.2f", x.subTotal()) + "\n");
        }
        sb.append("Preço Total: R$ " + total());

        return sb.toString();
    }
}