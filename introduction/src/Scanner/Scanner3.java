package Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
//사용자가 입력한 숫자 중 더 큰 숫자를 출력하기
        Scanner scans = new Scanner(System.in);
        System.out.println("안녕하세요! :) 숫자 크기를 비교해드릴게요!");
        System.out.print("첫 번째 숫자를 입력해주세요! : ");
        int num1 = scans.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요! : ");
        int num2 = scans.nextInt();
        if (num1 > num2) {
            System.out.println("입력하신 숫자 중 더 큰 숫자는 " + num1 + "입니다!");
        } else if (num1 < num2) {
            System.out.println("입력하신 숫자 중 더 큰 숫자는 " + num2 + "입니다!");
        } else if (num1 == num2) {
            System.out.println("입력하신 숫자는 크기가 같네요!");

        }


    }
}