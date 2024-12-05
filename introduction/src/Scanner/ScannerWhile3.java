package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
//        김영한 선생님의 답
//        package scanner;
//import java.util.Scanner;
//public class ScannerWhile3 {
//public static void main(String[] args) {
//Scanner input = new Scanner(System.in);
//int sum = 0;
//while (true) {
//System.out.print("정수를 입력하세요 (0을 입력하면 종료): "); int number = input.nextInt();
//if (number == 0) {
//break;
//            }
//            sum += number;
//        }
//System.out.println("입력한 모든 정수의 합: " + sum);     }
//}


        Scanner scan = new Scanner(System.in);
        System.out.println("안녕하세요 더하기 계산기에 오신것을 환영합니다!");
        System.out.println("프로그램 종료를 원하신다면, 0을 입력해주세요!");
    int sum = 0;
    int result = 0;
        while(true){
            System.out.print("더하기를 할 숫자를 입력해주세요! :");
        int i = scan.nextInt();
            if (i !=0) {
                System.out.println("입력하신 숫자는 " + i + "입니다.");
                sum = result+i;
                if (result == 0) {
                    System.out.print("더하기를 할 숫자를 입력해주세요! :");
                int i2 = scan.nextInt();
                sum = sum + i2;
                }
        if (sum != 0) {
                System.out.println("입력하신 숫자를 더한 숫자는  " + sum + "입니다.");
                result = sum;
            }
        } else {
            System.out.println("프로그램을 종료합니다!");
            break;
        }

        }
    }
}

//강사님의 코드와 내 코드의 장점 결합한 코드
//package Scanner;
//
//import java.util.Scanner;
//
//public class ScannerWhile3 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("안녕하세요 더하기 계산기에 오신것을 환영합니다!");
//        System.out.println("프로그램 종료를 원하신다면, 0을 입력해주세요!");
//
//        int sum = 0;
//
//        while(true) {
//            System.out.print("더하기를 할 숫자를 입력해주세요! :");
//            int number = scan.nextInt();
//
//            if (number == 0) {
//                System.out.println("프로그램을 종료합니다!");
//                System.out.println("최종 총합: " + sum);
//                break;
//            }
//
//            // 사용자 피드백 추가
//            System.out.println("입력하신 숫자: " + number);
//            sum += number;
//            System.out.println("현재까지의 총합: " + sum);
//            System.out.println("------------------------");
//        }
//    }
//}

//강사님 코드의 장점
//
//단순한 로직
//명확한 변수 사용
//효율적인 반복 구조
//
//
//내 코드의 장점
//
//친절한 안내 메시지
//각 단계별 결과 확인 가능
//더 나은 사용자 경험