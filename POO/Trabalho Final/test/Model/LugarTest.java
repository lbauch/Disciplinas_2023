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
public class LugarTest {

    public LugarTest() {
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
    public void testCriarLugarComHistoria() {
        Lugar lugar = new Lugar("Cidade", "Descrição da cidade", "História da cidade");
        assertEquals("Cidade", lugar.getNome());
        assertEquals("Descrição da cidade", lugar.getDescricao());
        assertEquals("História da cidade", lugar.getHistoria());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarLugarSemHistoria() {
        new Lugar("Cidade", "Descrição da cidade", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarLugarComHistoriaVazia() {
        new Lugar("Cidade", "Descrição da cidade", "");
    }

    @Test
    public void testAtualizarHistoria() {
        Lugar lugar = new Lugar("Cidade", "Descrição da cidade", "História antiga");
        lugar.setHistoria("Nova história");
        assertEquals("Nova história", lugar.getHistoria());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAtualizarHistoriaComHistoriaVazia() {
        Lugar lugar = new Lugar("Cidade", "Descrição da cidade", "História antiga");
        lugar.setHistoria("");
    }

}
