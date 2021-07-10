import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
    ArithmeticOperation calculator;

    @BeforeEach
    public void preSetup() {
        calculator = new ArithmeticOperation();
        System.out.println("before each called !");
    }

    @AfterEach
    public void postSetup() {
        System.out.println("After each called !");
        calculator = null;
    }


    @Test
    public void additionTest() {

        assertEquals(30, calculator.add(10, 20), "Addition Test Failed!");
        assertEquals(-30, calculator.add(-10, -20), "Addition Test with negitve values Failed!");
        assertEquals(0, calculator.add(0, 0), "Addition Test with Zero Failed!");
    }


    @Test
    public void subtractionTest() {
        // calculator=new ArithmeticOperation();
        assertEquals(-10, calculator.subtraction(10, 20), "subtraction Test Failed!");
        assertEquals(-10, calculator.subtraction(-20, -10), "subtraction Test with negitve values Failed!");
        assertEquals(0, calculator.subtraction(1, 1), "subtractiontest with zero failed ");
    }

    @DisplayName("Parameterised Test Sample")
    @ParameterizedTest(name="{index} => data=''{0}''")
    @ValueSource(strings = {"apple","orange","mango"})
    public void paramTest(String message){
        System.out.println("test data" +message);
    }


    @DisplayName("Parameterised Test Sample1 ")
    @ParameterizedTest(name="{index} => data={0},{1},{2}")
    @CsvFileSource(resources= "/TestData.csv")
    public void addPramTest(int a,int b, int c){
        assertEquals(c, calculator.add(a, b), "Addition Test Failed!");

    }

}