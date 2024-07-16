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
public class PersonagemTest {

    public PersonagemTest() {
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
    public void testCriarPersonagemValido() {
        Personagem personagem = new Personagem("Herói", "Descrição do herói", "Corajoso", "Realizou grandes feitos");
        assertEquals("Herói", personagem.getNome());
        assertEquals("Descrição do herói", personagem.getDescricao());
        assertEquals("Corajoso", personagem.getCaracteristicas());
        assertEquals("Realizou grandes feitos", personagem.getFeitos());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarPersonagemComCaracteristicasVazias() {
        new Personagem("Herói", "Descrição do herói", "", "Realizou grandes feitos");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCriarPersonagemComFeitosVazios() {
        new Personagem("Herói", "Descrição do herói", "Corajoso", "");
    }

    @Test
    public void testIncluirRemoverAtores() {
        Personagem personagem = new Personagem("Herói");

        personagem.incluirAtores("Ator1");
        personagem.incluirAtores("Ator2");
        assertEquals(2, personagem.getAtores().size());

        personagem.removerAtores("Ator1");
        assertEquals(1, personagem.getAtores().size());
        assertTrue(personagem.getAtores().contains("Ator2"));
        assertFalse(personagem.getAtores().contains("Ator1"));
    }
}
