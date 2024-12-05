//완성 - 2차원 배열

package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx7_4 {
  public static void main(String[] args) {
//    1단계 : 배열 선언 및 스캐너 호출
    Scanner scan = new Scanner(System.in);
    int[][] scores =new int [4][3];
    String[] subjects = {"국어","영어","수학"};

//    2단계 : 데이터 입력 받기
    for(int i = 0; i < 4; i++) {
      System.out.println((i+1)+"번 학생의 성적을 입력하세요 : ");
      for(int j = 0; j < 3; j++) {
        System.out.print(subjects[j] + " 점수 : ");
        scores[i][j] = scan.nextInt();
      }
    }

//    3단계 : 데이터 출력
  for(int i = 0; i < 4; i++) {
    int total = 0;
    for(int j = 0; j < 3; j++) {
      total += scores[i][j];
    }
    double ave = total / subjects.length;
      System.out.println(i + "번 학생의 총점: " + total + ", 평균 : " + ave);
  }
  }
}
