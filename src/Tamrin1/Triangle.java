package Tamrin1;

import java.util.Scanner;

public class Triangle {
    public Triangle() {
    }

    public static void main(String[] args) {
        System.out.println("Insert sides:");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] substring = num.split(" ");
        int a = Integer.parseInt(substring[0]);
        int b = Integer.parseInt(substring[1]);
        int c = Integer.parseInt(substring[2]);

        if (a + b > c & a + c > b & b + c > a) {
            int p =  (a + b + c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

            String str = String.format("%.2f",s);
            System.out.println("S =" + str );

        } else
            System.out.println("NO");
    }
}
