//문자열 안에 문자열
package pack_241106_Exams;

public class pro_Ex6 {
  public static void main(String[] args) {
    class Solution {
      public int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains("str2")) {
          answer = 1;
        } else {
          answer = 2;
        }
        return answer;
      }
    }
  }
}