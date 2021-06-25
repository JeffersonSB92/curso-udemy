package polimorfismo.exemplos.entidades;

public class Conta {

    private Integer numero;
    private String titular;
    protected Double saldo; //colocamos como PROTECTED para que outra classe do mesmo pacote pudesse usar a variável "saldo"

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double quantia){
        saldo -= quantia + 5.0;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }
}