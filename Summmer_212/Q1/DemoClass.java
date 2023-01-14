package Summmer_212.Q1;

public class DemoClass {
    private static double PI=3.1416;
    static void calculateArea(double radius)
    {
        double area=PI*radius*radius;
        System.out.println("Area: "+area);
    }

    public static void main(String[] args) {
        calculateArea(5.0);

    }
}
