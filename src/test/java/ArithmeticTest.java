import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
         ArithmeticOperation calculator;

          @Test
         public void additionTest(){
              calculator=new ArithmeticOperation();
              assertEquals(30,calculator.add(10,20),"Addition Test Failed!");
              assertEquals(-30,calculator.add(-10,-20),"Addition Test with negitve values Failed!");
              assertEquals(0,calculator.add(0,0),"Addition Test with Zero Failed!");
        }
}
