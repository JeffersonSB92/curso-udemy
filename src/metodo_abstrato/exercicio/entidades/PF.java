package metodo_abstrato.exercicio.entidades;

public class PF extends Contribuinte{

    private Double gastoSaude;

    public PF (){
        super();
    }

    public PF(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        double imposto = 0.0;
        if (getGastoSaude() != 0.0){
            if (getRendaAnual() < 20000.0){
                imposto = (getRendaAnual() * 0.15) - (getGastoSaude() * 0.5);
            } else {
                imposto = (getRendaAnual() * 0.25) - (getGastoSaude() * 0.5);
            }
        } else {
            if(getRendaAnual() < 20000.0){
                imposto = getRendaAnual() * 0.15;
            } else {
                imposto = getRendaAnual() * 0.25;
            }
        }
        return imposto;
    }
}