// 문제 6-2: 배열 처리 메서드
// 정수 배열을 받아 평균, 최대값, 최소값을 반환하는 메서드들을 작성하세요.
//
// 각 기능을 별도 메서드로 구현
// 결과를 저장할 객체 타입 정의
// 메인메서드 내에 구현 완료
package Exam_241113;

import java.io.*;
import java.util.Arrays;

public class Ex1 {
  public static void main(String[] args) throws IOException {
//    정수 배열을 입력 받기

//    버퍼 리더 및 라이터 호출
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    //    값 배열 값으로 입력 받기

    System.out.print("작업을 할 숫자들을 입력해주세요! : ");
    String num = scan.readLine();
    String [] inputArray = num.split(" ");
    int result [] = {};
    int sum = 0;
    int ave = 0;

    // 최댓값,최솟값 구하기
      int max,min;
      max = min = Integer.parseInt(inputArray[0]);
    for (int i = 1; i < inputArray.length; i++) {
      max = Math.max(max, Integer.parseInt(inputArray[i]));
      result[0] = max;
      min = Math.min(min, Integer.parseInt(inputArray[i]));
      result[1] = min;
    }

    // 평균값 구하기
    for(int i = 0; i < inputArray.length; i++) {
      int StringToNum =  Integer.parseInt(inputArray[i]);
      sum += StringToNum;
    }
      ave += sum / inputArray.length;

    writer.write("평균값 : " + ave + " ");
      writer.write("max = " + result[0] + ", min = " + result[1]);


  writer.flush();
  writer.close();
  }

//  public static String writer(String a){
//  a.flush();
//  }
}
