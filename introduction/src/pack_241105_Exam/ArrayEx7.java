package pack_241105_Exam;

import java.util.Scanner;

public class ArrayEx7 {
  public static void main(String[] args) {
    //    문제 - 2차원 배열1
    // 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
    // 2차원 배열을 사용하고, 실행 결과 예시를 참고하자.

//    1단계 : 스캐너 호출 및 배열 선언
    Scanner scan = new Scanner(System.in);
    int [][] scores = new int[4][3];
    String[] subjects = {"국어", "영어", "수학"};

//    2단계 : 스크립트 생성 for 문 이용
    for(int i = 0; i < 4 ; i++) {
      System.out.println((i+1) + "번 학생의 성적을 입력해주세요! :");
      for(int j = 0; j < 3; j++) {
        System.out.print(subjects[j] + "점수 : ");
        scores[i][j] = scan.nextInt();
      }
    }
// 3단계 : 총점 및 평균 계산
for(int i = 0; i < 4; i++) {
  int total = 0;
  for(int j = 0; j < 3; j++) {
    total += scores[i][j];
  }
  double ave = (double)total / 3;
      System.out.println((i+1) + "번 학생의 총점 : " + total + ", 평균 : " + ave);
}


//    ========================================================
    ////    1.5단계 : 학생의 숫자 저장할 변수와 배열 선언
//  int studentCount = scan.nextInt();
//  int koreanScore = 0;
//  int englishScore = 0;
//  int mathScore = 0;
//
//  int total, ave = 0;
//
//
//  int column = 3;
////  학생 수 저장할 배열
//    int [] students = new int[studentCount];
////  점수 저장할 배열
//  int [][] scoreArray = new int[studentCount][column];
//
//
////  2단계 : 사용자에게 안내 메세지로 데이터 입력 받기
//  for(int i = 1; i <= studentCount; i++) {
//    System.out.println(students[i] + "번 학생의 성적을 입력하세요 : ");
//    System.out.print("국어 점수 : ");
//    koreanScore = scan.nextInt();
//    System.out.print("영어 점수 : ");
//    englishScore = scan.nextInt();
//    System.out.print("수학 점수 : ");
//    mathScore = scan.nextInt();
//    for(int j = 0; j < column; j++) {
//    scoreArray[i][j] = koreanScore;
//    scoreArray[i][j+1] = englishScore;
//    scoreArray[i][j+2] = mathScore;
//    }
//    }
//    total = koreanScore+englishScore+mathScore;
//    ave = total / column;
////      System.out.println(students[i] + "번 학생의 총점 : " + total + ", 평균 : " + ave);
  }
}
