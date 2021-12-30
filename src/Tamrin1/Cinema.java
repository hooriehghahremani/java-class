package Tamrin1;

import java.util.Scanner;

public class Cinema {
    public Cinema() {
    }

    public static void main(String[] args) {
        System.out.println("Insert number:");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] substring = num.split(" ");
        int r = Integer.parseInt(substring[0]);
        int c = Integer.parseInt(substring[1]);
        if (10 > c ) {
            int rn = 10 - r + 1 ;
            System.out.println("right" + ' ' + rn + ' ' + c);
        }
        else if ( c > 10) {
            int rn = 10 -r + 1;
            int cn = 20 - c + 1;
            System.out.println("left" + ' ' +  rn + ' ' + cn);
        }
    }
}
