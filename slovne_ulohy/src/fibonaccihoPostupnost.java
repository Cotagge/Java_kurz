public class fibonaccihoPostupnost {
    public static void main(String[] args) {


        int a = 1;
        int b = 2;
        int limit = 1000;
        System.out.print(a+ " ");
        System.out.print(b+ " ");

        while ( a+b <= limit ) {
            int next = a +b;
            a = b;
            b = next ;
            System.out.print(next + " ");
        }

    }
}
