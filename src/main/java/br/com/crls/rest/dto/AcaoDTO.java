package br.com.crls.rest.dto;

public class AcaoDTO {

    private String nome;
    private String codigo;
    private double preco;
    private int investimento;
    private int quantidade;
    private double valor_a_gastar;
    private double resto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getInvestimento() {
        return investimento;
    }

    public void setInvestimento(int investimento) {
        this.investimento = investimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_a_gastar() {
        return valor_a_gastar;
    }

    public void setValor_a_gastar(double valor_a_gastar) {
        this.valor_a_gastar = valor_a_gastar;
    }

    public double getResto() {
        return resto;
    }

    public void setResto(double resto) {
        this.resto = resto;
    }
}
