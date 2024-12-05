package Scanner;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
//문제와 풀이3
//문제 - 이름과 나이 반복
//사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요. 사용 자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
//다음 실행 결과 예시를 참고해주세요.
//        결과 예시
//        이름을 입력하세요 (종료를 입력하면 종료): 자바 나이를 입력하세요: 30
//입력한 이름: 자바, 나이: 30
//이름을 입력하세요 (종료를 입력하면 종료): 하니 나이를 입력하세요: 20
//입력한 이름: 하니, 나이: 20
//이름을 입력하세요 (종료를 입력하면 종료): 종료 프로그램을 종료합니다.

//        동일 입력 입력시 오류 발생
        Scanner scan = new Scanner(System.in);

        System.out.println("입력한 이름과 숫자 반복 출력 프로그램!");
        while (true) {
            System.out.print("이름을 입력해 주세요! (종료 또는 exit 를 입력하면 종료): ");
            String inputName = scan.nextLine();
            if (inputName.equals("종료") || inputName.equals("exit")){
                System.out.print("종료");
                System.out.println("");
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.print("나이를 입력해 주세요!: ");
//                오류 발생으로 개선
//                int inputAge = scan.nextInt();
                int inputAge = Integer.parseInt(scan.nextLine());
            System.out.println("입력하신 이름 : " + inputName + ", 나이 : " + inputAge );
            }
        }
    }
}