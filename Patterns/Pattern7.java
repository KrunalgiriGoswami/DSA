import java.util.Scanner;

public class Pattern7 {

    static void pattern7(int n){
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

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern7(row);
    }
}
