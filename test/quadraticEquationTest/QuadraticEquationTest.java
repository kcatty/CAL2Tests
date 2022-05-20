package quadraticEquationTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import quadraticEquation.QuadraticEquation;
import quadraticEquation.QuadraticValues;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class QuadraticEquationTest {
    private QuadraticEquation quadraticEquation;

    @Mock
    private QuadraticValues mockedQuadraticValues;

    @ParameterizedTest
    @CsvSource({"1, -3, 5"})
    public void testSolve1(double a, double b, double c) {
        when(mockedQuadraticValues.getA()).thenReturn(a);
        when(mockedQuadraticValues.getB()).thenReturn(b);
        when(mockedQuadraticValues.getC()).thenReturn(c);

        quadraticEquation = new QuadraticEquation(mockedQuadraticValues);

        double[] result = quadraticEquation.solve();
        assertArrayEquals(null, result, "Test1 not passed");
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 0"})
    public void testSolve2(double a, double b, double c) {
        when(mockedQuadraticValues.getA()).thenReturn(a);
        when(mockedQuadraticValues.getB()).thenReturn(b);
        when(mockedQuadraticValues.getC()).thenReturn(c);
        quadraticEquation = new QuadraticEquation(mockedQuadraticValues);

        double[] expectedResult = {-2,0};
        double[] result = quadraticEquation.solve();
        assertArrayEquals(expectedResult, result, "Test2 not passed");
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 0"})
    public void testSolve3(double a, double b, double c) {
        when(mockedQuadraticValues.getA()).thenReturn(a);
        when(mockedQuadraticValues.getB()).thenReturn(b);
        when(mockedQuadraticValues.getC()).thenReturn(c);
        quadraticEquation = new QuadraticEquation(mockedQuadraticValues);

        double[] expectedResult = {-2,0};
        double[] result = quadraticEquation.solve();
        assertArrayEquals(expectedResult, result, "Test3 not passed");
    }

    @ParameterizedTest
    @CsvSource({"1, 0, -4"})
    public void testSolve4(double a, double b, double c) {
        when(mockedQuadraticValues.getA()).thenReturn(a);
        when(mockedQuadraticValues.getB()).thenReturn(b);
        when(mockedQuadraticValues.getC()).thenReturn(c);
        quadraticEquation = new QuadraticEquation(mockedQuadraticValues);

        double[] expectedResult = {-2,2};
        double[] result = quadraticEquation.solve();
        assertArrayEquals(expectedResult, result, "Test4 not passed");
    }

    @ParameterizedTest
    @CsvSource({"1, 6, 9"})
    public void testSolve5(double a, double b, double c) {
        when(mockedQuadraticValues.getA()).thenReturn(a);
        when(mockedQuadraticValues.getB()).thenReturn(b);
        when(mockedQuadraticValues.getC()).thenReturn(c);
        quadraticEquation = new QuadraticEquation(mockedQuadraticValues);

        double[] expectedResult = new double[2];
        expectedResult[0] = -3;
        double[] result = quadraticEquation.solve();
        assertArrayEquals(expectedResult, result, "Test5 not passed");
    }

    @ParameterizedTest
    @CsvSource({"0, 1, 6"})
    public void testSolveException(double a, double b, double c) {
        when(mockedQuadraticValues.getA()).thenReturn(a);
        when(mockedQuadraticValues.getB()).thenReturn(b);
        when(mockedQuadraticValues.getC()).thenReturn(c);
        quadraticEquation = new QuadraticEquation(mockedQuadraticValues);

        ArithmeticException thrown = assertThrows(ArithmeticException.class,
                () -> quadraticEquation.solve(), "Expected to throw, but it didn't");
        assertEquals(thrown.getMessage(),"Exception: division by zero");
    }
}
