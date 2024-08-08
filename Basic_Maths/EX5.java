// Given an integer N, check whether it is prime or not.
// A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

public class EX5 {
    static boolean checkPrime(int n){

        int cnt = 0;

        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                cnt = cnt + 1;
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }
        if(cnt == 2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
