package Variables;

public class var3 {
   public static void main(String[] args) {
        int marks = 65;
        boolean isPassed;

        if (marks >= 40) {
            isPassed = true;
        } else {
            isPassed = false;
        }

        System.out.println("Marks: " + marks);
        System.out.println("Passed? " + isPassed);
    }
}
