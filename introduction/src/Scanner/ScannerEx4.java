package Scanner;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
//스캐너 활용
        int temp;
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 바꾸기 프로그램!!");
        System.out.print("첫 번째 숫자를 입력해 주세요! : ");
        int num1 = scan.nextInt();
        System.out.print("두 번째 숫자를 입력해 주세요! : ");
        int num2 = scan.nextInt();

        System.out.println("현재 1번에 입력하신 숫자는 " + num1 + "입니다.");
        System.out.println("현재 2번에 입력하신 숫자는 " + num2 + "입니다.");
        System.out.println("숫자를 바꾸는 중입니다!");
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("바뀐 결과로 1번의 숫자는 " + num1 + " 이며, 2번의 숫자는 " + num2 + " 입니다!");

        //        문제 풀이 완료
        // int a = 10;
// int b = 20;
// int temp;
//
//        System.out.println("숫자 바꾸기 프로그램!!");
//        System.out.println("현재 1번에 입력하신 숫자는 " + a + "입니다.");
//        System.out.println("현재 2번에 입력하신 숫자는 " + b + "입니다.");
//        System.out.println("숫자를 바꾸는 중입니다!");
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("바뀐 결과로 1번의 숫자는 " + a + " 이며, 2번의 숫자는 " + b + " 입니다!");
    }
}