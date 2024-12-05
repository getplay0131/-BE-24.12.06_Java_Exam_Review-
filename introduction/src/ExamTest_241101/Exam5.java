package ExamTest_241101;

public class Exam5 {
  public static void main(String[] args) {
    int month = 12;
      if(month >= 3 && month <= 5){
      System.out.println("월 : " + month);
      System.out.println("계절 : 봄입니다.");
      } else if (month >= 6 && month <= 8) {
          System.out.println("월 : " + month);
          System.out.println("계절 : 여름입니다.");
      } else if(month >= 9 && month <= 11){
          System.out.println("월 : " + month);
          System.out.println("계절 : 가을입니다.");
      } else {
          System.out.println("월 : " + month);
          System.out.println("계절 : 겨울입니다.");
      }
  }
}


//개선점
//동일한 출력문이 반복되므로 다음과 같이 구조를 개선할 수 있습니다:
//
//javaCopySystem.out.println("월: " + month);
//String season;
//if (month >= 3 && month <= 5) {
//    season = "봄";
//} else if (month >= 6 && month <= 8) {
//    season = "여름";
//} else if (month >= 9 && month <= 11) {
//    season = "가을";
//} else {
//    season = "겨울";
//}
//System.out.println("계절: " + season + "입니다.");
//월이 1~12 범위를 벗어나는 경우의 예외처리를 추가하면 좋겠습니다
