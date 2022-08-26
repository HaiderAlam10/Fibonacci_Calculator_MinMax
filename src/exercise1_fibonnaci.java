public class exercise1_fibonnaci {
    // the sequence goes 0, 1, 1, 2, 3, 5, 8, 13...
    public static void main(String[] args) {
        int n = 15, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Squence till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            //compute next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;


        }
    }
}
