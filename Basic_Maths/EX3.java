// Given an integer N, return true if it is a palindrome else return false.

public class EX3 {
    static boolean isPalindrome(int n){
        int reverseNum = 0;
        int num = n;
        while(n != 0){
            int digit = n % 10;
            n /= 10;

            reverseNum = (reverseNum * 10) + digit;
        }
        return  reverseNum == num;
    }

    public static void main(String[] args) {
        if (isPalindrome(12321)){
            System.out.println("Number is Palindrome...");
        } else {
            System.out.println("Number is not Palindrome...");
        }
    }
}
