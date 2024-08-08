import java.util.Scanner;

public class R_Ex2 {

    // print name n times
//    static void printName(int i,int n){
//        if (i > n) return;
//        else {
//            System.out.println("Krunal");
//            printName(i+1,n);
//        }
//    }

    static void printNumber(int i, int n){
        if (i < 1) return;
        else {
            System.out.println(i);
            printNumber(i-1, n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to print Number: ");
        int n = sc.nextInt();

        printNumber(n,n);
    }
}
