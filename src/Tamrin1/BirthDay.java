package Tamrin1;

import java.util.Scanner;

public class BirthDay {
    public BirthDay(){
    }
    public static void main(String[] args) {
        System.out.println("Insert your Birthday");
        Scanner scanner = new Scanner(System.in);
        String Birthday = scanner.nextLine();

        System.out.println("sal : " + Birthday.substring(0,2)+ '\n' + "mah : " + Birthday.substring(2,4));
    }
}

