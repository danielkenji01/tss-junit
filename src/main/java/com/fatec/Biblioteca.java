package com.fatec;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public boolean adicionar(Livro livro) {
        if(livros.contains(livro)){
            return false;
        }
        return livros.add(livro);
    }

    public int size() {
        return livros.size();
    }

}
