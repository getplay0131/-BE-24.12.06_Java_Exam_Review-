package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a+1;

        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a % b;

        String first = "Hello";
        String sceond = "Java";

        System.out.println("현재 a는 "+ a +"이며, b는" + b + "입니다.");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + mul);
        System.out.println("a / b = " + div);
        System.out.println("a % b = " + mod);
        System.out.println(first + " " + sceond);
    }
}
