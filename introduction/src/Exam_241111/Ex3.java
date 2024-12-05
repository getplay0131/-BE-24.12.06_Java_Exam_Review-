// 2. 연산자 연습
// 문제 2-1: 자리수 분리
// 세 자리 정수를 입력받아 각 자리수를 분리하여 출력하세요.
//
// 입력예시: 123
// 출력예시:
// 백의 자리: 1
// 십의 자리: 2
// 일의 자리: 3

package Exam_241111;

import java.io.*;

public class Ex3 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    String num = scan.readLine();

    int [] nums = new int[3];
    String [] count = {"백", "십","일"};
    for(int i = 0; i < nums.length; i++) {
    nums[i] = num.charAt(i) -'0';
    writer.write(count[i] + "의 자리 : \n" + nums[i] + " ");
    }
    writer.flush();
    writer.close();
      
    }

  }

