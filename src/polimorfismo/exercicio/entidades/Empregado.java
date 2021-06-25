package polimorfismo.exercicio.entidades;

public class Empregado {

    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Empregado() {
    }

    public Empregado(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento(){
        return horas * valorPorHora;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getNome() + " - R$ " +String.format("%.2f", pagamento()));
        return sb.toString();
    }
}
