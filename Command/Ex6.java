package Command;
import java.util.Scanner;
public class Ex6 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number (type -1 to stop): ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("Breaking the loop!");
                break;
            }
            System.out.println("You entered: " + num);
        }
    }
}
