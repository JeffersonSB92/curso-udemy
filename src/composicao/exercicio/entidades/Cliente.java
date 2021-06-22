package composicao.exercicio.entidades;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date dataAniver;

    public Cliente() {
    }

    public Cliente(String nomeDoCliente, String email, Date dataAniver) {
        nome = nomeDoCliente;
        this.email = email;
        this.dataAniver = dataAniver;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeDoCliente) {
        nome = nomeDoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAniver() {
        return dataAniver;
    }

    public void setDataAniver(Date dataAniver) {
        this.dataAniver = dataAniver;
    }
}