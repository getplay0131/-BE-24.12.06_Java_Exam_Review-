package Scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("홀수, 짝수 판독기!");
        System.out.print("판독할 숫자를 입력해 주세요! :");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자인 " + num +" 은 짝 수 입니다!");
        } else {
            System.out.println("입력하신 숫자인 " + num +" 은 홀 수 입니다!");
        }
    }
}