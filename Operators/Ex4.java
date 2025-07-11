package Operators;

public class Ex4 {
   public static void main(String[] args) {
        int a = 5;

        System.out.println("Original a: " + a);     // 5
        System.out.println("++a (pre): " + ++a);     // 6
        System.out.println("a++ (post): " + a++);    // 6
        System.out.println("After post-increment: " + a); // 7
        System.out.println("--a (pre): " + --a);     // 6
        System.out.println("a-- (post): " + a--);    // 6
        System.out.println("After post-decrement: " + a); // 5
    }
}
