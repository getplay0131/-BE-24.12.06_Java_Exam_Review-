package Loop;

public class For2 {
  public static void main(String[] args) {
    int endNum = 15;
    int sum = 0;
    for (int i = 0; i <= endNum; i++) {
      sum += i;
      System.out.println("i = " + i + ", sum = " + sum + ", endNum = " + endNum);
    }
  }
}
