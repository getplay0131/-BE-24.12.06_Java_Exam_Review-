package progress_241031.casting.Main;

public class pro_두수의나눗셈 {
  public static void main(String[] args) {

    class Solution {
      public int solution(int num1, int num2) {
        //         나눗셈 전에 실수 형 변환
        double answer = (double) num1 / num2;
        answer = answer * 1000;
        int total = (int) answer;
        return total;
      }
    }
  }
}

// 한줄 버전
// return (int)((double)num1 / num2 * 1000);
