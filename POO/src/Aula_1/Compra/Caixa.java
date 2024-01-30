package Aula_1.Compra;

public class Caixa {
    //  Pra conseguir rodar, o método da classe tem que se chamar main
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nome = "Joao da Silva";
        cliente.endereco = "Rua dos Bobos, 0";

        Produto acucar = new Produto();
        acucar.descricao = "Açúcar";
        acucar.preco = 2;

        Produto macarrao = new Produto();
        macarrao.descricao = "Macarrão";
        macarrao.preco = 2.5F;

        Produto feijao = new Produto();
        feijao.descricao = "Feijão";
        feijao.preco = 3;

        Pedido pedido = new Pedido();
        pedido.addItem(acucar, 5);
        pedido.addItem(macarrao, 2);
        pedido.addItem(feijao, 3);

        System.out.println("O total do pedido é " + pedido.getTotal());
    }
}
