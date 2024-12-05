package Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);

        System.out.println("안녕하세요! 입력하신 숫자를 더해드릴게요!");
        System.out.print("첫 번째 숫자를 입력해 주세요! :");
        int num1 = scan1.nextInt();
        System.out.print("두 번째 숫자를 입력해 주세요! :");
        int num2 = scan1.nextInt();

        System.out.println("입력하신 숫자의 합은 " + (num1+num2) + " 입니다!");

        System.out.println("혹시 곱하기도 필요하신가요?");
        System.out.print("필요하시다면 true를, 필요 없으시다면 false를 입력하셔서 이 프로그램을 종료하셔도 됩니다.! :");
        boolean isCheckMul = scan1.nextBoolean();
        System.out.println("입력하신 숫자의 곱은 " + (num1*num2) + " 입니다!");
    }
}