package quadraticEquation;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    QuadraticValues quadraticValues;

    public QuadraticEquation(QuadraticValues quadraticValues) {
        this.quadraticValues = quadraticValues;
    }

    public void calculateQuadraticEquation() {
        try {
            System.out.println(Arrays.toString(solve()));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public double[] solve() throws ArithmeticException {
        double a = quadraticValues.getA();
        double b = quadraticValues.getB();
        double c = quadraticValues.getC();

        double delta = b * b - 4.0 * a * c;
        double x1, x2;
        double[] results = new double[2];

        if (a != 0) {
            if (delta > 0) {
                x1 = ((-b) - sqrt(delta)) / (2 * a);
                x2 = ((-b) + sqrt(delta)) / (2 * a);
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
