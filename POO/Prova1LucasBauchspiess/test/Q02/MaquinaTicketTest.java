package Q02;

import Q01.MaquinaTicket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaquinaTicketTest {
    
    public MaquinaTicketTest() {
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

    @Test(expected = IllegalArgumentException.class)
    public void testQ2_1() {
        MaquinaTicket maq = new MaquinaTicket();
        maq.setPrecoUnitario(-1.0);
    }
    
    @Test
    public void testQ2_2() {
        MaquinaTicket maq = new MaquinaTicket();
        maq.setPrecoUnitario(1.5);
        assertEquals(5, maq.vender(10, 20.0), 0);
    }
    
    @Test
    public void testQ2_3() {
        MaquinaTicket maq = new MaquinaTicket();
        maq.setPrecoUnitario(2.0);
        maq.vender(10, 20.0);
        
        maq.setPrecoUnitario(0.0);
        maq.vender(30, 100.0);
        assertEquals(20, maq.getValorArrecadado(), 0);
    }
    
    @Test
    public void testQ2_4() {
        MaquinaTicket maq = new MaquinaTicket();
        maq.setPrecoUnitario(1.75);
        maq.vender(5, 20.0);
        maq.vender(40, 70.0);
        assertEquals(45, maq.getQuantidadeBilhetesVendidos(), 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testQ2_5() {
        MaquinaTicket maq = new MaquinaTicket();
        maq.setPrecoUnitario(3.0);
        maq.vender(10, 20.0);
    }
}
