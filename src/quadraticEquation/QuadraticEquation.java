package quadraticEquation;

import java.util.Arrays;

public class QuadraticEquation {

    public QuadraticEquation() {}

    public void calculateQuadraticEquation(double a, double b, double c) {
        double delta = b * b - 4.0 * a * c;
        try {
            System.out.println(Arrays.toString(solve(a, b, delta)));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    static double[] solve(double a, double b, double delta) throws ArithmeticException {

        double x1, x2;
        double[] results = new double[2];
        if (a != 0) {
            if (delta > 0) {
                x1 = ((-b) - delta) / (2 * a);
                x2 = ((-b) + delta) / (2 * a);
                results[0] = x1;
                results[1] = x2;
                System.out.println("x1=" + x1 + "\n" + "x2=" + x2);
            } else if (delta == 0) {
                x1 = (-b) / (2 * a);
                results[0] = x1;
                System.out.println("x1=" + x1);
            } else {
                results = null;
                System.out.println("No real roots.");
            }
        } else {
            throw new ArithmeticException("Exception: division by zero");
        }
        return results;
    }
}
