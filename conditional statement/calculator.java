import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("welcome to calculator!");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number");
        int a= sc.nextInt();
        System.out.println("enter your second number");
        int b= sc.nextInt();
        System.out.println("Choose from the following operations: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        int button= sc.nextInt();
        switch (button) {
            case 1: int sum= a+b;
            System.out.println(sum);
            break;
            case 2: int diff= a-b;
            System.out.println(diff);
            break;
            case 3: int mul= a*b;
            System.out.println(mul);
            break;
            case 4: int div= a/b;
            System.out.println(div);
            break;
            case 5: int re= a%b;
            System.out.println(re);
            break;
            default: System.out.println("invalid operation selected");
        }
    }
}
