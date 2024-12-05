package Scanner;

import java.util.Scanner;

public class ScannerWhile3_improveSelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0; //더하기 결과 저장

            System.out.println("더하기 계산기!! 짜란~~!!");
        while (true) {
            System.out.println("프로그램 종료를 원하시면 0을 입력해 주세요!");

            System.out.print("더하기를 할 숫자를 입력해주세요! : ");
            int num = scan.nextInt();

            if (num == 0) {
                System.out.println("지금까지 입력하신 숫자의 합 : " + sum);
                System.out.println("0을 입력하시어 프로그램이 종료됩니다!");
                break;
            }

            sum += num;
            System.out.println("입력하신 숫자는 " + num + " 입니다!");
            System.out.println("입력하신 숫자의 결과는 " + sum + "입니다!");
            System.out.println(" ====================== ");

        }
    }
}