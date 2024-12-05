package progress_241109;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1 : " + add(1,5));
        System.out.println("1 : " + add(1.5,5.2));
    }
//
//    public static int add(int a, int b) {
//        System.out.println("1번 호출" + "a = " + a + ", b = " + b);
//        return a +b ;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출" + "a = " + a + ", b = " + b);
        return a +b ;
    }
}