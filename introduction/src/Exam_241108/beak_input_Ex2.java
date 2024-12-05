//백준 - 곱셈 - 사칙연산
//구글링 사이트 정보 참고

package Exam_241108;

import java.util.Scanner;

public class beak_input_Ex2 {
  public static void main(String[] args) {

    //세자리수 입력 두개 받기
    Scanner scan = new Scanner(System.in);

    int num1 = scan.nextInt();
    String num2 = scan.next(); // 문자열에서 하나씩 인출해서 사칙연산을 수행하기 위해 문자열로 받는다.

    scan.close(); // 스캐너를 닫는다.

    //    마지막 숫자 곱셈 구하기

//    문자열에 가장 마지막에 값을 인출해 숫자 그대로의 값으로 변환 후 곱셈 작업 수행
    System.out.println(num1 * (num2.charAt(2) - '0'));
//    문자열에 두번째에 값을 인출해 숫자 그대로의 값으로 변환 후 곱셈 작업 수행
    System.out.println(num1 * (num2.charAt(1) - '0'));
//    문자열에 가장 첫번째에 값을 인출해 숫자 그대로의 값으로 변환 후 곱셈 작업 수행
    System.out.println(num1 * (num2.charAt(0) - '0'));
//전체 곱한 결과를 출력하기 위해 우리가 입력받은 문자열을 숫자로 바꿔주어 출력하면 된다.
    System.out.println(num1 * Integer.parseInt(num2));
  }
}
