package pavel.project1.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class SimpleFunctionsTest {

    @Autowired
    SimpleFunctions simpleFunctions = new SimpleFunctions();

    @Test
    public void testMultiplications() {
        Assertions.assertEquals(30, simpleFunctions.calcMultiplication(15, 2));
        Assertions.assertEquals(80, simpleFunctions.calcMultiplication(4, 20));
    }

    @Test
    public void testSum() {
        Assertions.assertEquals(17, simpleFunctions.calcSum(15, 2));
        Assertions.assertEquals(24, simpleFunctions.calcSum(4, 20));
    }

    @Test
    public void testSub() {
        Assertions.assertEquals(13, simpleFunctions.calcSub(15, 2));
        Assertions.assertEquals(-16, simpleFunctions.calcSub(4, 20));
    }

}
