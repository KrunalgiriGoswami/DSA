import java.util.Scanner;

public class Pattern5 {

    static void pattern5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern5(row);
    }
}
