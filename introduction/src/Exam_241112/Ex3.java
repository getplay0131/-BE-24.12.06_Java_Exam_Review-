// 문제 4-2: 소수 판별기
// 입력받은 숫자가 소수인지 판별하세요.
//
// 소수: 1과 자기 자신으로만 나누어지는 수
// 출력: "소수입니다" 또는 "소수가 아닙니다"

package Exam_241112;

import java.io.*;

public class Ex3 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    System.out.print("소수를 판별할 숫자를 입력해주세요 : ");
    int InputNum = Integer.parseInt(scan.readLine());
    int count = 0;
    for (int i = 1; i <= InputNum; i++) {
    if (InputNum  %  i== 0) {
       count++;
       if (i == InputNum) {
       if (count > 2) {
         writer.write("소수가 아닙니다." + "\n");
       } else {
         writer.write("소수입니다." + "\n");
       }
       }
    }
}
    writer.flush();
    writer.close();
  }
}
