// Given an integer N, return the number of digits in N.

class EX1 {
    static int findNoOfDigits(int n){
        int count = 0;
        while(n > 0){
            int digit = n % 10;
            count++;
            n /= 10;
        }
        return  count;
    }

    // Optimal Approach
    static int countDigits(int n) {

        int count = (int) (Math.log10(n) + 1);

        return count;
    }

    public static void main(String[] args) {
        System.out.println("No. Of Digits is:" + findNoOfDigits(1018));
        System.out.println("No. Of Digits is:" + countDigits(1018));
    }
}
