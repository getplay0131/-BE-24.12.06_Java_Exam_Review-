package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx6_3 {
  public static void main(String[] args) {
    //      문제 - 가장 작은 수, 큰 수 찾기
    // 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
    // 그램을 작성하자. 실행 결과 예시를 참고하자.
    while (true) {

      //      1단계: 사용자에게 숫자 입력 받기위해 스캐너 호출 및 변수 저장
      Scanner scan = new Scanner(System.in);

      //      1.5단계 : 사용자에게 안내 메시지 및 데이터 입력 받기
      System.out.print("입력 하실 숫자의 개수를 입력해주세요! : ");
      int numCount = scan.nextInt();

      System.out.println(numCount + " 개의 정수를 입력하세요 : ");

      //    2단계 : 1차원 배열 선언
      int[] numArray = new int[numCount];

      // 3단계 : 입력 값 배열에 저장
      for (int i = 0; i < numCount; i++) {
        numArray[i] = scan.nextInt();
      }

      //    4단계 : 숫자 비교 및 최소 최대 변수 선언
      int min, max;
      min = max = numArray[0];

      for (int i = 1; i < numCount; i++) {
        if (min > numArray[i]) {
          min = numArray[i];
        }
        if (max < numArray[i]) {
          max = numArray[i];
        }
        //    5단계 : 값 출력
      }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
      }
  }
}
