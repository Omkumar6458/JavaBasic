package Operators;

public class Ex3 {
  public static void main(String[] args) {
        int a = 15;
        boolean cond1 = a > 10;
        boolean cond2 = a < 20;

        System.out.println("AND (&&): " + (cond1 && cond2)); // true
        System.out.println("OR (||): " + (cond1 || false));  // true
        System.out.println("NOT (!): " + (!cond1));          // false
    }
}
