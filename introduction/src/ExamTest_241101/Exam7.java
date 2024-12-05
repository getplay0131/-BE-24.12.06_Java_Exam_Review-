// 현재 코드의 문제점:
//
// 공백(" ")을 출력하지 않아서 피라미드 모양이 만들어지지 않습니다
// 홀수 행만 출력하는 것이 아니라, 각 행마다 2칸씩 증가하는 별이 필요합니다

package ExamTest_241101;

public class Exam7 {
  public static void main(String[] args) {
int rows = 5;
//내부 반복문을 외부 반복 인자의 +2만큼 하는 방법이 헷갈려서 조건문으로 차라리 홀수 때만큼 증가하도록 설정

      //      전체적인 반복
      for(int i = 1; i <= rows; ++i) {
//          내부 반복
          if (i % 2 ==1){
        for (int j = 1; j <= i; ++j) {
          System.out.print("*");
           }
          }
      System.out.println();
      }

  }
}

// 개선점
// 현재 코드의 문제점:
//
// 공백(" ")을 출력하지 않아서 피라미드 모양이 만들어지지 않습니다
// 홀수 행만 출력하는 것이 아니라, 각 행마다 2칸씩 증가하는 별이 필요합니다
// int height = 3;
// for (int i = 0; i < height; i++) {
//    // 공백 출력 반복문
//    for (int j = 0; j < height-1-i; j++) {
//        System.out.print(" ");
//    }
//    // 별표 출력
//    for (int k = 0; k < 2*i+1; k++) {
//        System.out.print("*");
//    }
//    System.out.println();
// }
// 각 행은 다음 패턴을 가집니다:
//
// 첫째 줄: 공백 2개, 별 1개
// 둘째 줄: 공백 1개, 별 3개
// 셋째 줄: 공백 0개, 별 5개
