package Tamrin1;
import java.util.Scanner;

public class EvenOrOdd {
    public EvenOrOdd(){}

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%2 == 0 )
        {
            System.out.println("It is even.");
        }
        else
        {
            System.out.println("It is odd.");
        }
    }
}
