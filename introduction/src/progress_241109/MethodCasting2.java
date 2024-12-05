package progress_241109;

public class MethodCasting2 {
    public static void main(String[] args) {
    int number = 100;
    printNumber(number);
//    printNumber((int)number);
    }

    public static void printNumber(double n)
    {
        System.out.println("숫자: " + n);

    }
}