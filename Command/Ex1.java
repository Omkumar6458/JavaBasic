package Command;
import java.util.Scanner;  // for sc

public class Ex1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks > 50) {
            System.out.println("You passed!");
        }else{
          System.out.println("fails");
        }
    }
}
