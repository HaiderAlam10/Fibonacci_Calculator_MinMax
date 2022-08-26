public class Demo {
    public static void main(String[] args)
    {
        int a = 4;
        int b = 6;
        int d = 7;
        int e = 8;
        sumMethod(a,b);
        sumMethod(d,e);
        sumMethod(1,5);


    }
    // returns the sum of the two numbers
    public static int sumMethod (int n, int m)
    {

        display(n + m);

        return n;
    }

    public static void display(int sum)
    {
        System.out.println("This method prints the variable");
        System.out.println("The sum is = " + sum);
    }
}
