package com.fatec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class REQ01ManterLivroTests {

    @Test
    void ct01_quando_dados_validos_cadastra_com_sucesso() {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro();

        livro.setAutor("Daniel");
        livro.setTitulo("Aprenda inglês em 5 minutos");
        livro.setIsbn("1234");

        biblioteca.adicionar(livro);

        Assertions.assertEquals(1, biblioteca.size());
    }

    @Test
    void ct02_cadastra_livro_com_isbn_ja_cadastrado() {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro();

        livro.setAutor("Daniel");
        livro.setTitulo("Aprenda inglês em 5 minutos");
        livro.setIsbn("1234");

        biblioteca.adicionar(livro);
        Livro livro2 = new Livro();
        livro2.setAutor("Tanembaum");
        livro2.setTitulo("Redes de Computadores");
        livro2.setIsbn("1234");
        final boolean adicionado = biblioteca.adicionar(livro2);
        Assertions.assertFalse(adicionado);
    }

    @Test
    void ct03_cadastra_livro_com_isbn_em_branco() {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro();

        livro.setAutor("Daniel");
        livro.setTitulo("Aprenda inglês em 5 minutos");
        livro.setIsbn("");

        boolean adicionado = biblioteca.adicionar(livro);

        Assertions.assertFalse(adicionado);
    }

}