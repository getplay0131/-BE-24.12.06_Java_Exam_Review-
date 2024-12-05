// 문제 1-2: 온도 변환기
// 섭씨 온도를 화씨 온도로 변환하는 프로그램을 작성하세요.
//
// 공식: (섭씨 × 9/5) + 32 = 화씨
// 실수형 변수 사용
// 출력은 소수점 첫째 자리까지

package Exam_241111;

public class Ex2 {
  public static void main(String[] args) {
    int celsius = 10; //섭씨
    double fahrenheit = 0; // 화씨

    fahrenheit = (celsius * 9/5) + 32;

    System.out.println("fahrenheit = " + fahrenheit);
  }
}
