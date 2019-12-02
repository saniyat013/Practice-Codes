
import java.util.Scanner;

public class AverageOfNum {
    static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }
    static double avg(double a, double b, double c){
        return (a+b+c)/3;
    }
    static float avg(float a, float b, float c){
        return (a+b+c)/3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(avg(3,4,5));
        System.out.println(avg(3.5,4.5,5.0));
        System.out.println(avg(5.6,8.5,11.2));
    }
}
