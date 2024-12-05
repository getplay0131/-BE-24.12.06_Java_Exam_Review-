package ExamTest_241029;

public class CondEx4 {
  public static void main(String[] args) {
    double rating = 8.5;

    if (rating >= 9) {
      System.out.println("해당 평점 이상의 평점은 받은 어바웃 타임을 추천합니다.");
    }

    if (rating >= 8) {
      System.out.println("해당 평점 이상의 평점은 받은 토이 스토리를 추천합니다.");
    }

    if (rating >= 7) {
      System.out.println("해당 평점 이상의 평점은 받은 고질라를 추천합니다.");
    }
  }
}
