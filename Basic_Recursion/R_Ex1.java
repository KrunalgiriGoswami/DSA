// Understand Recursion by printing something N times

public class R_Ex1 {

    static int cnt = 0;
    static void print(){

        // Base Condition.
        if(cnt == 3 ) return;
        System.out.println(cnt);

        cnt = cnt+1;
        print();

    }
    public static void main(String[] args) {
        print();
    }
}
