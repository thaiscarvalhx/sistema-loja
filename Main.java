package Loja;

public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Lucas",21,43600953842L,"Celular",1 ,4000d);
    Funcionario funcionario1 = new Funcionario("Thaís", 21, 49895806809L,"Gerente");
    Produto produto1 = new Produto("Celular", 4000d,"Iphone 12", 5);

    double valorPagar = produto1.getValor() * cliente1.getQuantidadeDesejada();

    if (funcionario1.getFuncao() == "Gerente") {
        valorPagar = valorPagar * 0.9;
    } else {
        valorPagar = valorPagar;
    }

        System.out.println("O cliente " + cliente1.getNome() + ", cujo dados encontrados em nosso banco de dados são: ");
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Seu valor de capital é: " + cliente1.getCapital());

        System.out.println("Está a procura do produto " + produto1.getDescricao() + ", na seção " + cliente1.getProdutoDesejado() +
                        ". Temos " + produto1.getQuantidade() + " quantidades no estoque, no valor de " + produto1.getValor());

        System.out.println("O cliente foi atendido por: " + funcionario1.getNome() + ". Cujo dados são: ");
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("CPF: " + funcionario1.getCpf());
        System.out.println("Função: " + funcionario1.getFuncao());

        System.out.println( "Adicionado ao carrinho");
        System.out.println(produto1.getDescricao() +  " " + produto1.getValor());
        System.out.println("Seu valor total é: " + valorPagar);

    }
}
