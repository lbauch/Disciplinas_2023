package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaListaTest {
    
    public PilhaListaTest() {
    }

    @Test
    public void testeVazio(){
        PilhaLista<Integer> p = new PilhaLista<>();
        assertTrue(p.estaVazia());
    }
    
    @Test
    public void testeVazioFalse(){
        PilhaLista<Integer> p = new PilhaLista<>();
        p.push(10);
        assertFalse(p.estaVazia());
    }
    
    @Test
    public void verificaPilha(){
        PilhaLista<Integer> p = new PilhaLista<>();
        p.push(10);
        p.push(20);
        p.push(30);
        int i = p.peek();
        assertEquals(i,30);
        p.pop();
        i = p.peek();
        assertEquals(i,20);
        p.pop();
        i = p.peek();
        assertEquals(i,10);
        p.pop();
    }
    
    @Test
    public void testePeek(){
        PilhaLista<Integer> p = new PilhaLista<>();
        p.push(10);
        p.push(20);
        p.push(30);
        int i = p.peek();
        assertEquals(i, 30);
        p.pop();
        i = p.peek();
        assertEquals(i, 20);       
    }
    
    @Test
    public void testeLiberar(){
        PilhaLista<Integer> p = new PilhaLista<>();
        p.push(10);
        p.push(20);
        p.push(30);
        p.liberar();
        assertTrue(p.estaVazia());
    }
}
