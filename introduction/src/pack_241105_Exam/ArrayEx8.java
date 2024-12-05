//완료 - 2차원 배열  -학생수 입력 받기

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx8 {
  public static void main(String[] args) {
    while (true) {
      System.out.println("=== 학생당 점수 계산 프로그램 시작 ===");
      //    1단계 : 배열 선언 및 스캐너 호출
      Scanner scan = new Scanner(System.in);

      System.out.print("학생 수를 입력하세요 : ");
      int studentCount = scan.nextInt();
      int[][] scores = new int[studentCount][3];
      String[] subjects = {"국어", "영어", "수학"};

      //    2단계 : 데이터 입력 받기
      for (int i = 0; i < scores.length; i++) {
        System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
        for (int j = 0; j < 3; j++) {
          System.out.print(subjects[j] + " 점수 : ");
          scores[i][j] = scan.nextInt();
        }
      }

      //    3단계 : 데이터 출력
      for (int i = 0; i < scores.length; i++) {
        int total = 0;
        for (int j = 0; j < 3; j++) {
          total += scores[i][j];
        }
        double ave = total / subjects.length;
        System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균 : " + ave);
      }
      System.out.println("=== 학생당 점수 계산 프로그램 종료 ===");
      System.out.println(" ");
  }
  }
}
