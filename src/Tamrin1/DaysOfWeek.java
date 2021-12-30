package Tamrin1;

import java.util.Scanner;

public class DaysOfWeek {
    public DaysOfWeek() {
    }

    public static void main(String[] args) {
        System.out.println("Insert a number");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        if (dayOfWeek == 1) {
            System.out.println("Saturday");
        } else if (dayOfWeek == 2) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 3) {
            System.out.println("Monday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 6) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 7) {
            System.out.println("Friday");
        } else {
            System.out.println("Insert another number");
        }

    }
}

