//프로그래머스 - 제곱수 판별하기
//ai 피드백 받음
//무한루프 필요 없음
//제곱근 확인 메소드 => Math.sqrt(n)
//재풀이 필요
package pack_241106_Exams;

public class pro_Ex3 {
  public static void main(String[] args) {
    class Solution {
      public int solution(int n) {
//        n이 제곱이어야 한다.
//        제곱은 math.pow(밑, 지수)
//        밑을 담담할 변수도 만들고 지수를 담당할 변수도 만들어 같은지를 조건으로 판단
        double under = Math.sqrt(n);
        int up = 2 ;
        if (under == (int)under) {
          return 1;
        } else {
          return 2;
        }

//        double testNum = Math.sqrt(n);
//         return (testNum == (int) testNum) ? 1 : 2 ;
    }
  }
}
}