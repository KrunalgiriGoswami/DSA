class R_Ex4 {

    static int fibonacci(int N){

        // Base Condition.
        if(N <= 1){

            return N;
        }

        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last + slast;
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }
}