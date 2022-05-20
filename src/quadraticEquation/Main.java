package quadraticEquation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        QuadraticValues quadraticValues = new QuadraticValues();
        quadraticValues.setA(a);
        quadraticValues.setB(b);
        quadraticValues.setC(c);

        QuadraticEquation quadraticEquation = new QuadraticEquation(quadraticValues);
        quadraticEquation.calculateQuadraticEquation();
    }
}
