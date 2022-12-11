// a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;

        do {
            System.out.println("enter your marks");
            int marks =sc.nextInt();
            if (marks>=90) {
                System.out.println("this is good");
            } else if (marks>=60 && marks <=89) {
                System.out.println("this is also good");
            } else if (marks>=0 && marks<=59) {
                System.out.println("this is good as well");
            } else {
                System.out.println("invalid");
            }

            System.out.println("want to continue?");
            input= sc.nextInt();
        } while (input == 1);
    }    
}
