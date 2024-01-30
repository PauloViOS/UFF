package Aula_1.Compra;

public class Item {
    Produto produto;
    int quantidade;

    float getSubtotal() {
        return produto.preco * quantidade;
    }
}
