import java.util.Scanner;

public class Pattern16 {
    static void pattern16(int n){

        for(int i = 0; i< n; i++){

            for(int j = 0; j <= i; j++){
                System.out.print((char)((int)('A'+i)) + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Row : ");
        int row = sc.nextInt();
        pattern16(row);
    }
}
