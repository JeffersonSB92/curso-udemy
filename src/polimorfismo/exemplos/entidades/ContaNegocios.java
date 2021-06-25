package polimorfismo.exemplos.entidades;

public class ContaNegocios extends Conta{

    private Double limiteEmprestimo;

    public ContaNegocios(){
        super();
    }

    public ContaNegocios(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double quantia){
        if (quantia <= limiteEmprestimo){
            saldo += quantia - 10.0; //para poder chamar a variável "saldo" que é de outra classe, na classe dela ao invés de PRIVATE colocamos PROTECTED
        }

    }
    @Override
    public void saque(double quantia){
        super.saque(quantia);
        saldo -= 2.0;
    }
}