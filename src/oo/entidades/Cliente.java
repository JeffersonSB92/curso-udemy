package oo.entidades;

public class Cliente {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Cliente(){

    }
    public Cliente(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        saldo = depositoInicial;
    }
    public Cliente(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito){
        saldo += deposito;
    }

    public void saque(double saque){
        saldo -= saque + 5.00;
    }

    public String toString(){
        return "Conta "
                +numeroConta
                +", Titular: "
                +nomeTitular
                +", Saldo: R$ "
                +String.format("%.2f", saldo);
    }
}