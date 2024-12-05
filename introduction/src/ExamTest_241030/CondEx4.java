package ExamTest_241030;

public class CondEx4 {
  public static void main(String[] args) {
    double rating = 7;

    String aboutTime = "어바웃 타임";
    String toyStory = "토이 스토리";
    String godzila = "고질라";

    if (rating <= 9) {
      System.out.println("입력하신 평점 이상의 영화로 다음 영화를 추천합니다. " + aboutTime);
    }
    if (rating <= 8) {
      System.out.println("입력하신 평점 이상의 영화로 다음 영화를 추천합니다. " + toyStory);
    }
    if (rating <= 7) {
      System.out.println("입력하신 평점 이상의 영화로 다음 영화를 추천합니다. " + godzila);
    }
  }
}
