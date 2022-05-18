package quadraticEquation;

import java.util.Scanner;

public class Main {
    private QuadraticEquation quadraticEquation;

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        this.quadraticEquation = new QuadraticEquation();
        this.quadraticEquation.calculateQuadraticEquation(a,b,c);
    }
}
