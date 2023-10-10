package main.java.list.respostas_carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensList;

    //    Criar um construtor para instanciar a Lista de Itens
    public CarrinhoDeCompras() {

        this.itensList = new ArrayList<>();
    }

    public int obterTotalDeItens() {
        return this.itensList.size();
    }


    public static void main(String[] args) {

        System.out.println("Testando o carrinho!");

        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();

        System.out.println(carrinho1.obterTotalDeItens());

    }


}


