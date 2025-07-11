package Operators;

public class precedence3 {
  public static void main(String[] args) {
   int x = 4, y = 5, z = 6;
        boolean result = x + y * z > 30 || x == 4;
        System.out.println("Result: " + result);
}
}
