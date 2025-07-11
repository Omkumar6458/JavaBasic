package Data_type;

public class Ex3 {
    public static void main(String[] args) {
        int a = 100;
        long b = a;        // int → long  (not good )
        float c = b;       // long → float  

        System.out.println("int value: " + a);
        System.out.println("long value (after widening): " + b);
        System.out.println("float value (after widening): " + c);
    }
}
