import java.util.Scanner;

public class Pattern18 {
    static void pattern18(int n){

        for(int i = 0; i < n; i++){

            for(char ch = (char)(int)('A'+n-1-i); ch <= (char)(int)('A'+n-1); ch++){

                System.out.print(ch + " ");
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern18(row);
    }
}
