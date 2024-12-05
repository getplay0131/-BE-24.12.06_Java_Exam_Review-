package cond;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 3 ;
        boolean result = (x % 2 == 0) ? true : false ;

        if (result == true) {
            System.out.println("입력하신 값은 짝 수 입니다.");
        } else {
            System.out.println("입력하신 값은 홀 수 입니다.");
        }
    }
}
