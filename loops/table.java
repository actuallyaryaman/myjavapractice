//print the table of a number input by the user using while loop

package loops;
import java.util.Scanner;

public class table {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    int number= sc.nextInt();
    int i=1;
    while (i<11) {
        System.out.println(number*i);
        i++;
    }
}    
}
