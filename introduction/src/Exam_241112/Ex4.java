// 5. 배열 연습
// 문제 5-1: 배열 역순
// 크기가 5인 정수 배열을 입력받아 역순으로 출력하세요.
//
// 추가조건: 새로운 배열 생성하지 않고 구현

package Exam_241112;

import javax.imageio.IIOException;
import java.io.*;

public class Ex4 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    int [] numArray = new int[5];
    for (int i = 0; i < numArray.length; i++) {
      int nums = Integer.parseInt(scan.readLine());
      numArray[i] = nums;
      }

    for (int i = 0; i < numArray.length; i++) {
      writer.write(String.valueOf(numArray[numArray.length -i - 1]) + " ");
    }
    writer.flush();
    writer.close();
      }
    }


//      if (i ==numArray.length-1) {
