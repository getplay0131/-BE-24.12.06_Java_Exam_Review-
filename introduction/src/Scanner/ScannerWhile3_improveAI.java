package Scanner;

import java.util.Scanner;

public class ScannerWhile3_improveAI {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner((System.in));
        System.out.println("안녕하세요 더하기 계산기에 오신것을 환영합니다!");
        System.out.println("프로그램 종료를 원하신다면, 0을 입력해주세요!");

        int sum = 0;

        while(true) {
            System.out.print("더하기를 할 숫자를 입력해주세요! :");
            int number = scan.nextInt();

            if (number == 0) {
                System.out.println("프로그램을 종료합니다!");
                System.out.println("최종 총합: " + sum);
                break;
            }

            // 사용자 피드백 추가
            System.out.println("입력하신 숫자: " + number);
            sum += number;
            System.out.println("현재까지의 총합: " + sum);
            System.out.println("------------------------");
        }
    }
}