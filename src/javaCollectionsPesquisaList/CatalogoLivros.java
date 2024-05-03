package javaCollectionsPesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return  livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("A Game of Thrones", "George R. R. Martin", 1996);
        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
        catalogoLivros.adicionarLivro("A Clash of Kings", "George R. R. Martin", 1998);
        catalogoLivros.adicionarLivro("A Storm of Swords", "George R. R. Martin", 2000);
        catalogoLivros.adicionarLivro("A Storm of Swords", "George R. R. Martin", 2001);
        catalogoLivros.adicionarLivro("A Feast for Crows", "George R. R. Martin", 2005);
        catalogoLivros.adicionarLivro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 2003);
        catalogoLivros.adicionarLivro("A Dance with Dragons", "1George R. R. Martin", 2011);

        //System.out.println(catalogoLivros.pesquisarPorAutor("J. K. Rowling"));
        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1996, 2000));
        System.out.println(catalogoLivros.pesquisarPorTitulo("A Storm of Swords"));
    }
}