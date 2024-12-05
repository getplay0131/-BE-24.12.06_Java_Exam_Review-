package Exam_241108;

import java.util.Scanner;

public class baek_Loop_Ex2_review1 {
  public static void main(String[] args) {
//    숫자 입력 받기
    Scanner scan = new Scanner(System.in);
    int testCase = scan.nextInt();
//    결과 저장할 배열 선언
    int [] result = new int[testCase];

//    입력 받은 수 배열에 저장하기
    for(int i = 0; i < testCase; i++) {
      int A = scan.nextInt();
      int B = scan.nextInt();

      result[i] = A + B;
    }

    for (int sum : result) {
      System.out.println(sum);
    }
  }
}
