// 4. 반복문 연습
// 문제 4-1: 구구단 출력기
// 원하는 단을 입력받아 구구단을 출력하세요.
//
// 추가조건: 결과가 50을 초과하는 경우 출력하지 않음

package Exam_241112;

import java.io.*;

public class Ex2 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    System.out.print("확인하고 싶으신 구구단을 입력해주세요 : ");
    int InputNum = Integer.parseInt(scan.readLine());

    for (int i = 1; i <= 9; i++) {
      if (InputNum > 50) {
        writer.write("출력 가능한 값을 초과하여 프로그램을 종료합니다." + "\n");
        break;
      } else {
        writer.write(InputNum + " X " + i + " = " + (InputNum * i) + "\n");
        if (i == 9) {
      writer.write("출력이 완료되었습니다. 프로그램을 종료합니다." + "\n");
        }
      }
  }
      writer.flush();
      writer.close();
    }
}
