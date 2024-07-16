
package Fila;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaListaTest {
    
    public FilaListaTest() {
    }
    
    @Test
    public void testVazia(){
        FilaLista<Integer> f1 = new FilaLista<>();
        assertTrue(f1.estaVazia());
    }
    
    @Test
    public void testVaziaFalse(){
        FilaLista<Integer> f1 = new FilaLista<>();
        f1.inserir(10);
        assertFalse(f1.estaVazia());
    }
    
    @Test
    public void testFila(){
        FilaLista<Integer> f1 = new FilaLista<>();
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        int i = f1.retirar();
        assertEquals( i , 10);
        i = f1.retirar();
        assertEquals( i , 20);
        i = f1.retirar();
        assertEquals( i , 30);
        assertTrue(f1.estaVazia());
    }
    
    @Test
    public void testPeek(){
        FilaLista<Integer> f1 = new FilaLista<>();
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        int i = f1.peek();
        assertEquals( i , 10);
        i = f1.retirar();
        assertEquals( i , 10);
    }
    
    @Test
    public void testLiberar(){
        FilaLista<Integer> f1 = new FilaLista<>();
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        f1.liberar();
        assertTrue(f1.estaVazia());
    }
    
}
