//프로그래머스 - 모음 제거
//구글링 제거
//문자열 메서드 이용 및 포이치 메서드 활용
package pack_241106_Exams;

public class pro_Ex12 {
  public static void main(String[] args) {
      class Solution {
          public String solution(String my_string) {
              String answer = my_string;
              String[] replaces = {"a","e","i","o","u"};

              for (String del : replaces) {
                answer = answer.replaceAll(del,"");
              }
              return answer;
          }
      }
  }
}
