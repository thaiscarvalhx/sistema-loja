package Loja;

public class Cliente extends Pessoa {
    private String produtoDesejado;
    private Integer quantidadeDesejada;
    private Double capital;

    public Cliente(String nome, Integer idade, Long cpf, String produtoDesejado, Integer quantidadeDesejada, Double capital) {
        super(nome, idade, cpf);
        this.produtoDesejado = produtoDesejado;
        this.quantidadeDesejada = quantidadeDesejada;
        this.capital = capital;
    }

    public String getProdutoDesejado() {
        return produtoDesejado;
    }

    public void setProdutoDesejado(String produtoDesejado) {
        this.produtoDesejado = produtoDesejado;
    }

    public Integer getQuantidadeDesejada() {
        return quantidadeDesejada;
    }

    public void setQuantidadeDesejada(Integer quantidadeDesejada) {
        this.quantidadeDesejada = quantidadeDesejada;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }
}
