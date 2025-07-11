package Command;
import java.util.Scanner;
public class Ex7 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter limit: ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }
}
