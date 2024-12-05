package Scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("안녕하세요 더하기 계산기에 오신것을 환영합니다!");
        System.out.println("프로그램 종료를 원하신다면, 두 숫자 모두 0을 입력해주세요!");
        while (true) {
            System.out.print("첫 번째 숫자를 입력해 주세요! :");
            int num1 = scan.nextInt();
            System.out.print("두 번째 숫자를 입력해 주세요! :");
            int num2 = scan.nextInt();
            if (num2 == 0 && num1 == 0) {
                System.out.println("숫자 미입력으로 프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력하신 숫자의 합은 : " + (num1+num2) + " 입니다!");
        }
    }
}