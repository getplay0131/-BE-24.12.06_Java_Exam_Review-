// 문제 3-2: 학점 계산기
// 점수(0~100)를 입력받아 학점을 출력하세요.
//
// A: 90~100
// B: 80~89
// C: 70~79
// D: 60~69
// F: 0~59
// 추가조건: 잘못된 점수 입력 처리

package Exam_241112;

import java.io.*;

public class Ex1 {
  public static void main(String[] args) throws IOException {
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    System.out.print("학점을 확인하기 위해 점수를 입력해주세요 : ");
    int scores = Integer.parseInt(scan.readLine());
    if (scores >= 90) {
      writer.write("A 등급 입니다." + "\n");
    } else if(scores >= 80){
      writer.write("B 등급 입니다." + "\n");
    } else if(scores >= 70){
      writer.write("C 등급 입니다." + "\n");
    } else if(scores >= 60){
      writer.write("D 등급 입니다." + "\n");
    } else {
      writer.write("F 등급 입니다." + "\n");
    }

    writer.flush();
  writer.close();
  }
}
