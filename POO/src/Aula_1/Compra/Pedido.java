package Aula_1.Compra;

public class Pedido {
    Cliente cliente;
    Item[] itens = new Item[100];
    int qtdeItens = 0;

    float getTotal(){
        float total = 0;
        for (int i=0;i<qtdeItens;i++){
            total += itens[i].getSubtotal();
        }
        return total;
    }

    void addItem(Produto prod, int qtde){
        Item item = new Item();
        item.produto = prod;
        item.quantidade = qtde;
        itens[qtdeItens] = item;
        qtdeItens++;
    }
}
