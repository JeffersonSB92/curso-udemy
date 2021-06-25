package polimorfismo.exercicio.entidades;

public class Terceirizado extends Empregado{

    private Double gastoAdicional;

    public Terceirizado() {
        super();
    }

    public Terceirizado(String nome, Integer horas, Double valorPorHora, Double gastoAdicional) {
        super(nome, horas, valorPorHora);
        this.gastoAdicional = gastoAdicional;
    }

    public Double getGastoAdicional() {
        return gastoAdicional;
    }

    public void setGastoAdicional(Double gastoAdicional) {
        this.gastoAdicional = gastoAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + gastoAdicional * 1.1;
    }
}
