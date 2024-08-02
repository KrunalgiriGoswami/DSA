import java.util.Scanner;

public class Pattern9 {

    static void pattern9(int n){
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i -1 ; j++){
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2*i + 1  ; j++){
                System.out.print("*");
            }

            // space
            for (int j = 1; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i ; j++){
                System.out.print(" ");
            }

            // star
            for (int j = 0; j < 2*n - (2*i + 1)  ; j++){
                System.out.print("*");
            }

            // space
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern9(row);

    }
}
