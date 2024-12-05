//프로그래머스 - 편지

package pack_241106_Exams;

public class pro_Ex2 {
  public static void main(String[] args) {
    class Solution {
      public int solution(String message) {
//        문자열의 길이를 리턴해야한다.
//        문자열의 길이 내엔 알파뱃과 대소문자와 특수문자도 포함된다.
        int answer = 0;
  if(message.length() >= 1 && message.length() <= 50) {
    int MessageLength = message.length();
    answer = MessageLength * 2;
  } else {
          System.out.println("편지 내용의 길이를 확인해주세요!");
  }
        return answer;
      }
    }

  }
}
