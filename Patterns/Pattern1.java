import java.util.Scanner;

public class Pattern1 {

     static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
          pattern1(row);
    }
}
