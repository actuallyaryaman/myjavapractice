package loops;
//print sum of first n natural numbers using for loop

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
