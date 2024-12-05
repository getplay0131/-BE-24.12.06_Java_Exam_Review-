package progress_241109;

public class MethodEx1 {
    public static void main(String[] args) {
    sumAndDiv( 1,2,3);
    sumAndDiv( 15,25,35);
    }

    public static int sumAndDiv(int a, int b, int c) {
        int sum = a + b + c ;
        int ave = sum / 3 ;
        System.out.println("평균값 : " + (double)ave);
        return ave;
    }
}