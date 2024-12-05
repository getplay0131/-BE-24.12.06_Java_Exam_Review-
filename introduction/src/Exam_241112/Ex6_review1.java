package Exam_241112;

import javax.imageio.IIOException;
import java.io.*;

public class Ex6_review1 {
  public static void main(String[] args) throws IOException {
//      버퍼 리더 호출
      BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    // 숫자 입력 받기
    System.out.println("사칙 연산 프로그램을 시작합니다.");
      String input = scan.readLine();
      String [] numInput = input.split(" ");
    System.out.print("결과를 확인할 두 개의 수를 입력해주세요! : ");
      int a = Integer.parseInt(numInput[0]);
      int b = Integer.parseInt(numInput[1]);

//      수행 작업 선택 받기
      System.out.println("수행할 작업을 선택해주세요!");
    System.out.print("1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈");
    int choice = Integer.parseInt(scan.readLine());





  }
}
