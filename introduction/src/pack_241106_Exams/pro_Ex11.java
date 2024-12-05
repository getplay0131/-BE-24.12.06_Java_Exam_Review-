//프로그래머스 - 아이스 아메리카노
//ai 답안 참고 [너무 어렵게 생각한 것 같다]
package pack_241106_Exams;

public class pro_Ex11 {
  public static void main(String[] args) {
      class Solution {
          public int[] solution(int money) {

              int[] answer = new int [2];
                int coffee = 5500;;
                answer[0] = money / coffee;
                answer[1] = money % coffee;
              return answer;
          }
      }
  }
}
