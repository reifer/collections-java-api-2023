package javaColleciotnOrdenacaoList.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numeroList);
        if (!numeroList.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        System.out.println("Os números da lista são:");
        //ordenacaoNumeros.exibirNumeros();

        ordenacaoNumeros.adicionarNumero(26);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(04);
        ordenacaoNumeros.adicionarNumero(28);
        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}