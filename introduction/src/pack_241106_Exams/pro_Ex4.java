//프로그래머스 - 최댓값 만들기(1)

//추후 재풀이 필요


package pack_241106_Exams;

public class pro_Ex4 {
  public static void main(String[] args) {
//   원소 중 두개를 곱해 만들 수 있는 최대값..
    class Solution {
      public int solution(int[] numbers) {
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
          for (int j = i+1; j < numbers.length; j++) {
            if (numbers[i] * numbers[j] > max) {
            max = numbers[i] * numbers[j];
            }
          }
        }
        return max;
      }
    }

  }
}

//class Solution {
//  public int solution(int[] numbers) {
//    int answer = 0;
//    int max1 = 0;
//    int max2 =0;
//    int num = 0;
//    for(int i=0; i<numbers.length; i++){
//      if(numbers[i]>max1){
//        max1 = numbers[i];
//        num = i;
//      }
//    }
//    for(int i=0; i<numbers.length; i++){
//      if(i==num)continue;
//      if(numbers[i]>max2&&numbers[i]<=max1){
//        max2 = numbers[i];
//      }
//    }
//    answer = max1 * max2;
//    return answer;
//  }
//}
