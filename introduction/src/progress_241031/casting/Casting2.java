package progress_241031.casting;

public class Casting2 {
  public static void main(String[] args) {
    double doubleValue = 1.545;
    int intValue = 0;

    // int = double => 컴파일 오류 발생
    intValue = (int) doubleValue; // progress_241031.casting (형변환)
    System.out.println(intValue);
  }
}
