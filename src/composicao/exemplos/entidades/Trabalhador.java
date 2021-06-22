package composicao.exemplos.entidades;

import composicao.exemplos.entidades.enums.NivelDoTrabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    //ATRIBUTOS BÁSICOS
    private String nome;
    private NivelDoTrabalhador nivel;
    private Double salarioBase;

    //ASSOCIAÇÕES
    private Departamento departamento;
    private List<ContratoPorHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    //CONSTRUTOR GERADO SEM ATRIBUTOS DO TIPO LIST, PARA ISSO A LISTA FOI INSTANCIADA NO PRÓPRIO MÉTODO
    public Trabalhador(String nome, NivelDoTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDoTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelDoTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContratoPorHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPorHora contrato) {
        contratos.remove(contrato);
    }

    public double ganho(int year, int month) {
        double sum = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (ContratoPorHora c : contratos) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.valorTotal();
            }
        }
        return sum;
    }
}