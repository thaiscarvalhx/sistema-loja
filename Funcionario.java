package Loja;

public class Funcionario extends Pessoa{
    private String funcao;

    public Funcionario(String nome, Integer idade, Long cpf, String funcao) {
        super(nome, idade, cpf);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
