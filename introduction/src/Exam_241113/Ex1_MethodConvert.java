  // 문제 6-2: 배열 처리 메서드
  // 정수 배열을 받아 평균, 최대값, 최소값을 반환하는 메서드들을 작성하세요.
  //
  // 각 기능을 별도 메서드로 구현
  // 결과를 저장할 객체 타입 정의
  // 메인메서드 내에 구현 완료 >> 메서드내 배열 인자 삽입으로 해결
  package Exam_241113;

  import java.io.*;

  public class Ex1_MethodConvert {
    public static void main(String[] args) throws IOException {
  //    정수 배열을 입력 받기

  //    버퍼 리더 및 라이터 호출
      BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

      //    값 배열 값으로 입력 받기
      while (true){

      System.out.print("작업을 할 숫자들을 입력해주세요! : ");
      String num = scan.readLine();
      String [] inputArray = num.split(" ");
      int [] resultArray = new int [inputArray.length];

      writer.write("평균값 : " + calculateAve(inputArray) + " ");
      writer.write("max = " + findmax(inputArray) + ", min = " + findmin(inputArray));


    writer.flush();
    writer.close();
      }
    }

    public static String calculateAve(String[] arr) {
      int sum = 0;
      int ave = 0;
      for(int i = 0; i < arr.length; i++) {
        int StringToNum =  Integer.parseInt(String.valueOf(arr[i]));
        sum += StringToNum;
      }
      ave += sum / arr.length;
      return String.valueOf(ave);
    }

    public static int findmax(String [] arr) {
      int max = Integer.parseInt(String.valueOf(arr[0]));
      for (int i = 1; i < arr.length; i++) {
        max = Math.max(max, Integer.parseInt(arr[i]));
      }
        return max;
    }

    public static int findmin(String [] arr) {
      int min = Integer.parseInt(String.valueOf(arr[0]));
      for (int i = 1; i < arr.length; i++) {
        min = Math.min(min, Integer.parseInt(arr[i]));
      }
      return min;
    }
  }
