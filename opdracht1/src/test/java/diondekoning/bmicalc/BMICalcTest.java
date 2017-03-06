package diondekoning.bmicalc;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dion on 06/03/2017.
 */
public class BMICalcTest {
    private static BMICalc calc;

    @BeforeClass
    public static void initCalc(){
        calc = new BMICalc(164, 64);
    }

    @Before
    public void beforeEachTest(){
        System.out.println("Voor elke test");
    }

    @After
    public void afterEachTest(){
        System.out.println("Na elke test");
    }

    @Test
    public void testCalculate(){
        String result = calc.calculate();

        assertEquals("23.8" , result);
    }

}