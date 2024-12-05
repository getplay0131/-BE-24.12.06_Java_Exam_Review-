package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx7_3 {
  public static void main(String[] args) {
//    1단계 : 스캐너 호출 및 배열 선언
    Scanner scan = new Scanner(System.in);

    int [][] scores =new int[4][3];
    String []subjects = {"국어", "영어", "수학"};

//    2단계 : 점수 입력 받기
    for(int i = 0; i < 4; i++) {
      System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
      for(int j = 0; j < 3; j++) {
        System.out.print(subjects[j] + "점수 : ");
        scores[i][j] = scan.nextInt();
      }
    }
//    3단계 : 점수 계산 및 출력
    for(int i = 0; i <4 ; i++) {
      int total = 0;
      for(int j = 0; j < 3 ; j++) {
        total += scores[i][j];
      }
      double ave = total / subjects.length;

      System.out.println(i + "번 학생의 총점 : " + total + " , 평균 : " + ave);
    }
  }
}
