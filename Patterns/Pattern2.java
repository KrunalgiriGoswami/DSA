import java.util.Scanner;

public class Pattern2 {

    static void pattern2(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern2(row);
    }
}
