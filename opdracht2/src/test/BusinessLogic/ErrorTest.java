package BusinessLogic;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Dion on 3/16/2017.
 */
public class ErrorTest {
    private static Calculate calc;

    @BeforeClass
    public static void initCalc(){
        calc = new Calculate(0, 164);
    }

    @Test
    public void calculate() throws Exception {
        String result = calc.calculate();

        assertEquals(".0" , result);
    }

}