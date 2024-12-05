//배열 뒤집기 - 프로그래머스
//구글링하여 해결


package pack_241106_Exams;

import java.lang.reflect.Array;

public class pro_Ex7 {
  public static void main(String[] args) {
      class Solution {
          public int[] solution(int[] num_list) {
              int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-i-1];
        }

              return answer;
          }
      }
      }

  }

