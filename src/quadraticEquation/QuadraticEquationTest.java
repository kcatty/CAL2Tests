package quadraticEquation;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    public void testSolve1() {
        int a = 1;
        double b = -3;
        double delta = 5;
        double[] expectedResult = {-1,4}; // x1 and x2
        double[] result = QuadraticEquation.solve(a, b, delta);
        assertArrayEquals(expectedResult, result, "Test1 not passed"); // make the actual test

    }

    @Test
    public void testSolve2() {
        int a = 1;
        double b = -5;
        double delta = -1;
        double[] expectedResult = null; // x1 and x2
        double[] result = QuadraticEquation.solve(a, b, delta);
        assertArrayEquals(expectedResult, result, "Test2 not passed"); // make the actual test
    }

    @Test
    public void testSolve3() {
        int a = 1;
        double b = 2;
        double delta = 0;
        double[] expectedResult = new double[2];
        expectedResult[0] = -1; // x1 and x2
        double[] result = QuadraticEquation.solve(a, b, delta);
        assertArrayEquals(expectedResult, result, "Test3 not passed"); // make the actual test
    }

    @Test
    public void testSolveException() {
        int a = 0;
        double b = 1;
        double delta = 6;
        ArithmeticException thrown = assertThrows(ArithmeticException.class,
                () -> QuadraticEquation.solve(a, b, delta), "Expected to throw, but it didn't");
        assertEquals(thrown.getMessage(),"Exception: division by zero");
    }
}
