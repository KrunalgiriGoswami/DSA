// Given an integer N return the reverse of the given number.

class EX2 {
    static int reverseDigits(int n){
        int reverseNum = 0;
        while(n != 0){
            int digit = n % 10;
            n /= 10;

            reverseNum = (reverseNum * 10) + digit;
        }
        return  reverseNum;
    }

    public static void main(String[] args) {
        System.out.println("Reversed No. is:" + reverseDigits(-1018));
    }
}
