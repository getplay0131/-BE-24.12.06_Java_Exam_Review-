package ExamTest_241101;

public class ReviewExamLast {
  public static void main(String[] args) {
//      1. 5명의 학생 성적을 입력 받음 (0-100점)
    int student1 = 90;
    int student2 = 80;
    int student3 = 35;
    int student4 = 85;
    int student5 = 100;
//  성적점수 변수 생성
    int score = 90;
    String student1grade = null;
    String student2grade = null;
    String student3grade = null;
    String student4grade = null;
    String student5grade = null;
    //   - 전체 평균 점수
    double ave = (student1 + student2 + student3 + student4 + student5) / 5;


    //    2. 다음 정보를 출력
    //   - 성적 분포 (A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: 0-59)
//    student 1
      if (student1 >= 90 && student1 <=100) {
          student1grade  = "A";
    } else if(student1 >= 80){
          student1grade  = "B";
    } else if(student1 >= 70){
          student1grade =  "C";
    }else if(student1 >= 60){
          student1grade = "D";
    } else {
          student1grade = "F";
    }

      //    student 2
      if (student2 >= 90 && student2 <=100) {
          student2grade  = "A";
      } else if(student2 >= 80){
          student2grade  = "B";
      } else if(student2 >= 70){
          student2grade =  "C";
      }else if(student2 >= 60){
          student2grade = "D";
      } else {
          student2grade = "F";
      }

      //    student 3
      if (student3 >= 90 && student3 <=100) {
          student3grade  = "A";
      } else if(student3 >= 80){
          student3grade  = "B";
      } else if(student3 >= 70){
          student3grade =  "C";
      }else if(student3 >= 60){
          student3grade = "D";
      } else {
          student3grade = "F";
      }

      //    student 4
      if (student4 >= 90 && student4 <=100) {
          student4grade  = "A";
      } else if(student4 >= 80){
          student4grade  = "B";
      } else if(student4 >= 70){
          student4grade =  "C";
      }else if(student4 >= 60){
          student4grade = "D";
      } else {
          student4grade = "F";
      }

      //    student 5
      if (student5 >= 90 && student5 <=100) {
          student5grade  = "A";
      } else if(student5 >= 80){
          student5grade  = "B";
      } else if(student5 >= 70){
          student5grade =  "C";
      }else if(student5 >= 60){
          student5grade = "D";
      } else {
          student5grade = "F";
      }

    //   - 최고점과 최저점
    int maxScoreFindStep1 = Math.max(student1,student2);
    int maxScoreFindStep2 = Math.max(maxScoreFindStep1,student3);
    int maxScoreFindStep3 = Math.max(maxScoreFindStep2,student4);
    int maxScoreFindStep4 = Math.max(maxScoreFindStep3,student5);
    int minScoreFindStep1 = Math.min(maxScoreFindStep1,student5);

    int maxScore = maxScoreFindStep4;
    int minScore = minScoreFindStep1;

    //   - 평균 이상인 학생 수
          int count = 0;
      if (ave <= student1){
          count++;
      }else if(ave <= student2){
          count++;
    } else if (ave <= student3) {
      count++;
    } else if (ave <= student4) {
      count++;
    } else if (ave <= student5) {
      count++;
          }

//      성적 분포
int gradeA = 0;
      if (student1grade.equals("A")){
          gradeA++;
      }
      if(student2grade.equals("A")){
          gradeA++;
      }
      if (student3grade.equals("A")) {
          gradeA++;
      }
      if (student4grade.equals("A")) {
          gradeA++;
      }
      if (student5grade.equals("A")) {
          gradeA++;
      }

      int gradeB = 0;
      if (student1grade.equals("B")){
          gradeB++;
      }
      if(student2grade.equals("B")){
          gradeB++;
      }
      if (student3grade.equals("B")) {
          gradeB++;
      }
      if (student4grade.equals("B")) {
          gradeB++;
      }
      if (student5grade.equals("B")) {
          gradeB++;
      }

      int gradeC = 0;
      if (student1grade.equals("C")){
          gradeC++;
      }
      if(student2grade.equals("C")){
          gradeC++;
      }
      if (student3grade.equals("C")) {
          gradeC++;
      }
      if (student4grade.equals("C")) {
          gradeC++;
      }
      if (student5grade.equals("C")) {
          gradeC++;
      }

      int gradeD = 0;
      if (student1grade.equals("D")){
          gradeD++;
      }
      if(student2grade.equals("D")){
          gradeD++;
      }
      if (student3grade.equals("D")) {
          gradeD++;
      }
      if (student4grade.equals("D")) {
          gradeD++;
      }
      if (student5grade.equals("D")) {
          gradeD++;
      }

      int gradeF = 0;
      if (student1grade.equals("F")){
          gradeF++;
      }
      if(student2grade.equals("F")){
          gradeF++;
      }
      if (student3grade.equals("F")) {
          gradeF++;
      }
      if (student4grade.equals("F")) {
          gradeF++;
      }
      if (student5grade.equals("F")) {
          gradeF++;
      }


    System.out.println("전체 평균 : " + ave);
    System.out.println("최고점 : " + maxScore);
    System.out.println("최저점 : " + minScore);
    System.out.println("성적분포: ");
    System.out.println("A : " + gradeA + "명");
    System.out.println("B : " + gradeB + "명");
    System.out.println("C : " + gradeC + "명");
    System.out.println("D : " + gradeD + "명");
    System.out.println("F : " + gradeF + "명");
    System.out.println("평균 이상 학생: " + count + "명");
  }
}


//개선점
//평균 이상 학생 수 계산 시 else if 대신 독립된 if문을 사용하면 더 정확할 것 같습니다:
//평균 계산 시 형변환을 활용하면 더 정확한 결과를 얻을 수 있습니다: