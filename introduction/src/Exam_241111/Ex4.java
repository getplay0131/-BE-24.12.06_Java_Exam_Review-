// 문제 2-2: 논리 연산
// 나이와 키를 입력받아 놀이기구 탑승 가능 여부를 출력하세요.
//
// 조건: 나이 8세 이상 AND 키 120cm 이상
// 입력: 나이(정수), 키(실수)
// 출력: true/false

package Exam_241111;

import java.io.*;
import java.util.Scanner;

public class Ex4 {
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);

  int age = scan.nextInt();
  double height = scan.nextDouble();

  if (age >= 8 && height >= 120){
      System.out.println("true");
  } else {
      System.out.println("false");
  }
}
  //  public static void main(String[] args) throws IOException {
//    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    int age = Integer.parseInt(scan.readLine());
//    double height = (double)Integer.parseInt(scan.readLine());
//
//    if (age >= 8 && height >= 120) {
//      writer.write("true");
//    } else {
//      writer.write(("false"));
//    }
//  }
}
