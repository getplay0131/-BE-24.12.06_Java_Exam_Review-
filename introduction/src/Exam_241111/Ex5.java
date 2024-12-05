// 3. 조건문 연습
// 문제 3-1: 계절 판별기
// 월(1~12)을 입력받아 해당 계절을 출력하세요.
//
// 봄: 3~5월
// 여름: 6~8월
// 가을: 9~11월
// 겨울: 12~2월

package Exam_241111;

import java.io.*;
import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) throws IOException {

//      Scanner scan = new Scanner(System.in);
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    System.out.print("계절을 확인할 월을 입력해 주세요 : ");
      int season = Integer.parseInt(scan.readLine());

      if (season >= 3 && season <= 5) {
      writer.write("봄입니다." + "\n");
      } else if(season >= 6 && season <= 8){
        writer.write("여름입니다." + "\n");
      } else if(season >= 9 && season <= 11) {
        writer.write("가을입니다." + "\n");
      } else {
        writer.write("겨울입니다." + "\n");
        }

    writer.flush();
      writer.close();
  }
}
