public class DemoOverloading {
    public static void main(String[] args)
    {
     int a = 10;
     int b = 5;
     double c = 7.5;
     double d = 3.4;
     double e = 10;

     //Uses maxMethod (int n1, int n2)
        int result1 = maxMethod (a, b);

     //Uses maxMethod (double n1, double n2)
     double result2 = maxMethod (c, d);

     double result3 = maxMethod(c, d, e);

        System.out.println("Maximum value = " + result1);
        System.out.println("Maximum value = " + result2);
        System.out.println("Maximum value = " + result3);

    }

    // method with integer parameters
    public static int maxMethod (int n1, int n2)
    {
        int max;
        if (n1 > n2)
            max = n1;
        else max = n2;
        return max;
    }
    // method with double parameters
    public static double maxMethod (double n1, double n2)
    {
        double max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;
        return max;
    }
    public static double maxMethod (double n1, double n2, double n3)
    {
        double max;
        if (n1 > n2 && n1 > n3)
            max = n1;
        else if (n2 > n3)
            max = n2;
        else
            max = n3;
        return max;
    }
}
