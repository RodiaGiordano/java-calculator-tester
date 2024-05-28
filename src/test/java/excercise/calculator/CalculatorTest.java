package java.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

    @Test
    void testMultiply(){
    assertEquals(1.5, Calculator.add(1,0.5F));
    assertEquals(4, Calculator.add(1.5F,2.5F));
    assertEquals(1, Calculator.add(2.5F,1.5F));
    assertEquals(0, Calculator.add(0,0));
    assertEquals(-2, Calculator.add(-1.5F,-0.5F));
    assertEquals(0.5, Calculator.add(-1,1.5F));
    }



}
