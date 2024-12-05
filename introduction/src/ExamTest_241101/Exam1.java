package ExamTest_241101;

public class Exam1 {
  public static void main(String[] args) {
      String name = "name";
      int age = 15;
      double height = 180.0;
      boolean studentCheck = true;
//  개선점:    studentCheck 보다는 isStudent가 불리언 변수명으로 더 관례적입니다

    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("키 : " + height);
    System.out.println("학생여부 : " + studentCheck);
  }
}
