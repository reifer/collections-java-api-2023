package javaCollectionsListaTarefa.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionar itens ao carrinho
        carrinhoDeCompras.adicionarItem("Macarrão", 3.60d, 1);
        carrinhoDeCompras.adicionarItem("Arroz", 25.0d, 2);
        carrinhoDeCompras.adicionarItem("Azeite", 35.40d, 1);
        carrinhoDeCompras.adicionarItem("Feijão", 16.0d, 1);

        // Exibir itens ao carrinho
        carrinhoDeCompras.exibirItens();

        // Remover itens ao carrinho
        carrinhoDeCompras.removerItem("Feijão");

        // Calcular itens ao carrinho
        carrinhoDeCompras.calcularValorTotal();
        System.out.println("O valor total da compra é R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}