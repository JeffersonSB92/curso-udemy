package metodo_abstrato.exercicio.entidades;

public class PJ extends Contribuinte{

    private Integer funcionarios;

    public PJ(){
        super();
    }

    public PJ(String nome, Double rendaAnual, Integer funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto() {
        double imposto = 0.0;
        if (getFuncionarios() <= 10){
            imposto = getRendaAnual() * 0.16;
        } else {
            imposto = getRendaAnual() * 0.14;
        }
        return imposto;
    }
}
