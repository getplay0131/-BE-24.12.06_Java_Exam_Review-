package progress_241031.casting.Main;

public class pro_양꼬치 {
  public static void main(String[] args) {
    class Solution {
      public int solution(int n, int k) {

        //        n = 양꼬치 = 10개 / k = 음료수 = 3개
        //         양꼬치
        int sheep = n; // 10
        int drink = sheep / 10; // 1
        int drinkService = drink * 2000; // 1 * 2000 = 2000원

        //         음료수

        int sheepPrice = 12000;
        int drinkPrice = k * 2000; // 6000

        int answer = 0;
        //        10 * 12000 + 6000-2000 = 120000+4000
        answer = (sheep * sheepPrice) + (drinkPrice - drinkService);
        return answer;
      }
    }
  }
}
