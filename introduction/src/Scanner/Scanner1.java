package Scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 입력해주세요 : ");
        String str = scanner.nextLine(); //입력을 문자열로 가져온다
        System.out.println("입력하신 문자열은 :" + str + "입니다.");

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = scanner.nextInt();
        System.out.println("입력하신 숫자는 : " + num1 + "입니다.");

        System.out.print("숫자를 입력해주세요(실수도 가능!) : ");
        double num2 = scanner.nextDouble();
        System.out.println("입력하신 숫자는 : " + num2 + "입니다.");
    }
}