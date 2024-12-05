// 문제 5-2: 2차원 배열 대각선 합
// 3x3 2차원 배열에서 대각선 원소들의 합을 구하세요.
//
// 양방향 대각선 모두 계산
// 중복되는 중앙 원소는 한 번만 계산

package Exam_241112;

public class Ex5 {
  public static void main(String[] args) {
//    배열 생성
    int [][] nums = {
            {9,2,10},
            {4,25,6},
            {15,8,19}
    };
//
//0,0 / 0,1 / 0,2
//1,0 / 1,1 / 1,2
//2,0 / 2,1 / 2,2


//    합계 변수 선언
    int sum = 0;
    //    행 순회
//    i = 0, 1, 2
    for (int i = 0; i < nums.length; i++) {
      //      열 순회
      //      j = 0~2
      if (nums[i][i] == nums[1][1]) {
        sum += (int)nums[i][i];
        continue;
      } else {
      }
      int sumLeft = nums[i][i];
      int sumRight = nums[i][nums[i].length-1-i];
      sum  += sumLeft + sumRight;
    }
      System.out.println(sum);
  }
}
