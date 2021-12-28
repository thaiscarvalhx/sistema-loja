package Loja;

public class Produto {

    private String item;
    private Double valor;
    private String descricao;
    private Integer quantidade;

    public Produto(String item, Double valor, String descricao, Integer quantidade) {
        this.item = item;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
