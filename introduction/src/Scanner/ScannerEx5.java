package Scanner;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp;

        System.out.println("입력한 숫자 사이의 숫자 구하기 프로그램!");
        while (true) {
            System.out.print("첫 번째 숫자를 입력해 주세요! : ");
            int num1 = scan.nextInt();
            System.out.print("두 번째 숫자를 입력해 주세요! : ");
            int num2 = scan.nextInt();

            System.out.println("현재 첫 번째에 입력하신 숫자는 " + num1 + "입니다.");
            System.out.println("현재 두 번째에 입력하신 숫자는 " + num2 + "입니다.");
            if (num1 > num2) {
                System.out.println("첫 번째 숫자가 크기에 숫자의 순서를 바꾸는 중입니다!");
                temp = num1;
                num1 = num2;
                num2 = temp;
                System.out.println("숫자 순서 변경 완료!");
            }

            System.out.print("두 숫자 사이의 모든 정수 : ");
            for (int i = num1 + 1; i < num2; i++) {
                System.out.print(i);
                if (i == num2 - 1) {
                    System.out.print("");
                    System.out.println("");
                    System.out.println("=======출력 완료=====");
                }
                if (i < num2 - 1) {
                    System.out.print(", ");
                }
            }

        }
    }
}