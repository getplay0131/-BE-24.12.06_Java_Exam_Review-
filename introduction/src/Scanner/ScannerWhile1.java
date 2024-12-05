package Scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("문자열을 입력해 주세요! (종료를 원하시면 exit를 입력해주세요!) :" );
            String str = scan.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력하신 문자는 다음과 같습니다 :" + str);

        }
    }
}