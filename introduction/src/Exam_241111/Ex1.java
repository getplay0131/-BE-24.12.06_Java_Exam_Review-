// 문제 1-1: 변수 교환
// 두 정수 변수 a와 b의 값을 교환하는 프로그램을 작성하세요.
//
// 제약조건: 추가 변수는 하나만 사용 가능
// 입력예시: a = 10, b = 20
// 출력예시: a = 20, b = 10

package Exam_241111;

public class Ex1 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int temp = 0 ;
    temp = a;
    a = b ;
    b = temp ;

    System.out.println("a = " + a + ", b = " + b);
  }
}
