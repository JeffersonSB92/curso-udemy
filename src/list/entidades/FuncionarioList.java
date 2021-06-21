package list.entidades;

public class FuncionarioList {

    private Integer id;
    private String nome;
    private Double salario;

    public FuncionarioList() {
    }

    public FuncionarioList(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentoSalario(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    public String toString() {
        return id
                +", "
                +nome
                +", "
                +String.format("%.2f", salario);
    }
}