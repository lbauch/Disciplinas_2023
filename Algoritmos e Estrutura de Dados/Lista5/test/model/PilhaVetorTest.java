package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PilhaVetorTest {
    
    public PilhaVetorTest() {
    }
    
    @Test
    public void verificaVazio(){
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
        assertTrue(p.estaVazia());
    }
    
    @Test
    public void verificaVazioFalse(){
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
        p.push(10);
        assertFalse(p.estaVazia());
    }
    
    @Test
    public void verificaPilha(){
        PilhaVetor<Integer> p = new PilhaVetor<>(10);
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
    
    @Test (expected = PilhaCheiaException.class)
    public void testePilhaCheia(){
        PilhaVetor<Integer> p = new PilhaVetor<>(3);
        p.push(10);
        p.push(20);
        p.push(30);
        p.push(40);
    }
    
    @Test (expected = PilhaVaziaException.class)
    public void testePilhaVazia(){
        PilhaVetor<Integer> p = new PilhaVetor<>(3);
        p.pop();
    }
    
    @Test
    public void testePeek(){
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
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
        PilhaVetor<Integer> p = new PilhaVetor<>(5);
        p.push(10);
        p.push(20);
        p.push(30);
        p.liberar();
        assertTrue(p.estaVazia());
    }
    
    @Test
    public void testeConcatenar(){
        PilhaVetor<Integer> p1 = new PilhaVetor<>(5);
        p1.push(10);
        p1.push(20);
        p1.push(30);
        PilhaVetor<Integer> p2 = new PilhaVetor<>(2);
        p2.push(40);
        p2.push(50);
        p1.concatenar(p2);
        assertEquals(p1.toString(), "50,40,30,20,10");
        assertEquals(p2.toString(), "50,40");
    }
    
}
