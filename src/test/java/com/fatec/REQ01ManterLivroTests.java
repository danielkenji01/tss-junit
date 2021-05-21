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

        biblioteca.add(livro);

        Assertions.assertEquals(1, biblioteca.size());
    }

}