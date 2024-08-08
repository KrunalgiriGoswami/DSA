// Sum of N Numbers

import java.util.Scanner;

public class R_Ex3 {

    // Method to find sum of N Numbers
    static int sumOfNumber(int n){
        if (n==0) return 0;
        return n + sumOfNumber(n-1);
    }

    // Method to find Factorial
    static int factOfNumber(int n){
        if (n < 0 || n == 0 || n == 1) return 1;
        return n * factOfNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Sum of N Number : " + sumOfNumber(n) + "\nFact of Number : " + factOfNumber(n));

    }
}
