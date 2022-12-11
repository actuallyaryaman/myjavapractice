import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("Area of circle is: "+area);
    }
}