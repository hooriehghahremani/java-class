package Tamrin1;

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public Circle() {
    }
    public static void main(String[] args) {
        System.out.println("Insert a number as radius");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextInt();
        double p = 2 * Math.PI * r;
        double s = Math.PI * r * r ;
        System.out.println("Perimeter = " + p );
        System.out.println("Area = " + s );
    }
}
