/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ObraTest {

    public ObraTest() {
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
    public void testCriarObraValida() {
        Categoria categoria = Categoria.FILME;
        Obra obra = new Obra("Livro", 2022, categoria);
        assertEquals("Livro", obra.getTitulo());
        assertEquals(2022, obra.getAnoLancamento());
        assertEquals(categoria, obra.getCategoria());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarObraComTituloVazio() {
        new Obra("", 2022, Categoria.FILME);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarObraComTituloNulo() {
        new Obra(null, 2021, Categoria.FILME);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarObraComAnoLancamentoInvalido() {
        new Obra("Teste", 0, Categoria.JOGO);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarObraComAnoLancamentoFuturo() {
        Categoria categoria = Categoria.SERIE;
        new Obra("Teste", 2050, categoria);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarObraComCategoriaNula() {
        new Obra("Livro", 2022, null);
    }

    @Test
    public void testAtualizarTitulo() {
        Categoria categoria = Categoria.FILME;
        Obra obra = new Obra("Teste", 2022, categoria);
        obra.setTitulo("Novo titulo");
        assertEquals("Novo titulo", obra.getTitulo());
    }
}
