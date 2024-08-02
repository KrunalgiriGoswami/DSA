import java.util.Scanner;

public class Pattern6 {

    static void pattern6(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern6(row);
    }
}
