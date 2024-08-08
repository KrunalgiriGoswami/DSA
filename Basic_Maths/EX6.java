// Given an integer N, return all divisors of N.

public class EX6 {
    static int noOfFactores(int n){
        int count = 0;
        for (int i = 1; i * i <= n ; i++) {
            if (i % n == 0){
                count++;
                if ((n / i) != i) count++;
            }
        }
        return count;
   }

    public static void main(String[] args) {
        System.out.println(noOfFactores(36));
    }
}

