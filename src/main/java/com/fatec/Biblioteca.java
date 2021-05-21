package com.fatec;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();

    public boolean adicionar(Livro livro) {

        if (!validarCampos(livro)) {
            return false;
        }

        if (livros.contains(livro)){
            return false;
        }

        return livros.add(livro);
    }

    public int size() {
        return livros.size();
    }

    private boolean validarCampos(Livro livro) {

        if (livro == null) {
            return false;
        }

        if (StringUtils.isBlank(livro.getIsbn())) {
            return false;
        }

        return true;
    }

}
