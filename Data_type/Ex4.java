package Data_type;

public class Ex4 {
    public static void main(String[] args) {
        double a = 123.456;
        int b = (int) a;   // double → int // decimal lost take place
        byte c = (byte) b; // int → byte // overflow risk take place 

        System.out.println("double value: " + a);
        System.out.println("int value (after narrowing): " + b);
        System.out.println("byte value (after narrowing): " + c);
    }
}
