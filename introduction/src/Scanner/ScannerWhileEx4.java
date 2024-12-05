//사용자 선택별 기능 돌리기 ai 도움 받음
package Scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("구구단 출력 프로그램!");
        while (true) {
            System.out.println("1. 구구단 출력하기 ");
            System.out.println("2. 프로그램 종료하기");
            System.out.println("3. 제작자 확인하기");
            System.out.print("기능을 선택해 주세요 : ");
            int choice = scan.nextInt();

            if (choice == 1) {
                System.out.print("몇 단을 확인해 보시겠어요? ");
                int num = scan.nextInt();
                System.out.println("구구단 출력을 시작합니다!");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(num + " * " + j + " = " + num * j);
                    if (j == 9) {
                        System.out.println("구구단 출력이 완료되었습니다.");
                    }
                }
            } else if (choice == 2) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choice == 3){
                System.out.println("제작자 : 윤승현");
            } else  {
                System.out.println(" ================ ");
                System.out.println("올바른 기능을 선택해 주세요!");
                System.out.println(" ================ ");
                continue;
            }
        }
    }
}