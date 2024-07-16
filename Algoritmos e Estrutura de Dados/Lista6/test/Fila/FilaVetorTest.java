package Fila;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaVetorTest {
    
    public FilaVetorTest() {
    }
    
    @Test
    public void testeVazia(){
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void testeVaziaFalse(){
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        assertFalse(fila.estaVazia());
    }
    
    @Test
    public void testeEnfileirar(){
        FilaVetor<Integer> fila = new FilaVetor<>(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        int i = fila.retirar();
        assertEquals(i, 10);
        i = fila.retirar();
        assertEquals(i, 20);
        i = fila.retirar();
        assertEquals(i, 30);
        assertTrue(fila.estaVazia());
    }
    
    @Test (expected = FilaCheiaException.class)
    public void testPilhaCheia(){
        FilaVetor<Integer> fila = new FilaVetor<>(3);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.inserir(40);
    }
    
    @Test (expected = FilaVaziaException.class)
    public void testPilhaVazia(){
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.retirar();
    }
    
    @Test
    public void testePeek(){
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        int i = fila.peek();
        assertEquals(i, 10);
        i = fila.retirar();
        assertEquals(i, 10);
    }
    
    @Test
    public void testeLiberar(){
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void testeConcatenar(){
        FilaVetor<Integer> f1 = new FilaVetor<>(5);
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        
        FilaVetor<Integer> f2 = new FilaVetor<>(3);
        f2.inserir(40);
        f2.inserir(50);
        
        FilaVetor<Integer> f3 = f1.criarFilaConcatenada(f2);
        
        assertEquals(f1.toString(), "10,20,30");
        assertEquals(f2.toString(), "40,50");
        assertEquals(f3.toString(), "10,20,30,40,50");
        assertEquals(f3.getLimite(), 8);
    }

}
