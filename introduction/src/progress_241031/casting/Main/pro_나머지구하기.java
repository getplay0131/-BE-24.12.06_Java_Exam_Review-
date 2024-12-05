package progress_241031.casting.Main;

public class pro_나머지구하기 {
  public static void main(String[] args) {
    class Solution {
      public int solution(int num1, int num2) {
        int answer = 0;
        //        자바는 연속된 비교 연산을 지원하지 않는다.
        //        긱 비교를 개별적으로 해야한다.
        //        결과가 이미 불리언 타입이라면 삼항연산자로 불리언 값 반환은 불필요하다.
        boolean check = (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100);
        if (check) {
          answer = num1 % num2;
        }
        return answer;
      }
    }
  }
}

// 단순하게 아래와 같이 풀수도 있네..
// 다른 사람의 풀이
// class Solution {
//  public int solution(int num1, int num2) {
//    while (num1 >= num2) {
//      num1 = num1 - num2;
//    }
//    int answer = num1;
//    return answer;
//  }
// }
