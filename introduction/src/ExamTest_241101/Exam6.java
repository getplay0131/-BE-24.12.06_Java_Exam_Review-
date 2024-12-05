package ExamTest_241101;

public class Exam6 {
  public static void main(String[] args) {
      int score = 65;

      if (score >= 95) {
      System.out.println("점수 : " + score + "점");
      System.out.println("학점 : A+"  );
      } else if(score >= 90){
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : A"  );
      } else if(score >= 85){
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : B+"  );
      } else if(score >= 80){
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : B"  );
      } else if(score >= 75){
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : C+"  );
      } else if(score >= 70){
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : C"  );
      } else if (score >= 60) {
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : D"  );
      } else if(score < 60){
          System.out.println("점수 : " + score + "점");
          System.out.println("학점 : F"  );
      }
  }
}
//개선점
//출력문이 중복되므로 다음과 같이 구조를 개선할 수 있습니다:
//
//javaCopySystem.out.println("점수: " + score + "점");
//String grade;
//if (score >= 95) {
//    grade = "A+";
//} else if (score >= 90) {
//    grade = "A";
//} // ... 나머지 조건들
//System.out.println("학점: " + grade);
//
//마지막 else if(score < 60) 는 단순히 else로 처리할 수 있습니다
//점수가 0-100 범위를 벗어나는 경우의 예외처리를 추가하면 좋겠습니다