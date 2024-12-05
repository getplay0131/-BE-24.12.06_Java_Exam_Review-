package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
    // 전위 증감
    int a = 1;
    int b = 0;
    b = ++a; //a 먼저 증가 후 b에 대입
        System.out.println("a = " + a + ", b = " + b);

    // gn위 증감
     a = 1;
     b = 0;
    b = a++; //a 대입 후 증가 b에 대입
        System.out.println("a = " + a + ", b = " + b);
    }
}

