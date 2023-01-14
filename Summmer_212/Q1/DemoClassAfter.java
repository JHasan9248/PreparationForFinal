package Summmer_212.Q1;

public class DemoClassAfter {
    final static double PI=3.1416;

    public static void main(String[] args) {
        DemoClass dc=new DemoClass(){
            static void calculateArea(double radius)
            {
                double area=PI*radius*radius;
                System.out.println("Area: "+area);
            }
        };
        DemoClass.calculateArea(5.0);
    }
}
