/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class TermoTest {

    public TermoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //**
    @Test
    public void testCriarTermoComNomeEDescricaoValidos() {
        Termo termo = new Termo("Termo1", "Descrição do termo");
        assertEquals("Termo1", termo.getNome());
        assertEquals("Descrição do termo", termo.getDescricao());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarTermoComNomeVazio() {
        new Termo("", "Descrição do termo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarTermoComDescricaoVazia() {
        new Termo("Termo1", "");
    }

    @Test
    public void testIncluirRemoverObras() {
        Termo termo = new Termo("Termo1", "Descrição do termo");
        Obra obra1 = new Obra("Obra1", 2022, Categoria.LIVRO);
        Obra obra2 = new Obra("Obra2", 2023, Categoria.DOCUMENTARIO);

        termo.incluirObra(obra1);
        termo.incluirObra(obra2);

        assertEquals(2, termo.getObras().size());
        assertTrue(termo.getObras().contains(obra1));
        assertTrue(termo.getObras().contains(obra2));

        termo.removerObra(obra1);

        assertEquals(1, termo.getObras().size());
        assertFalse(termo.getObras().contains(obra1));
        assertTrue(termo.getObras().contains(obra2));
    }
}
