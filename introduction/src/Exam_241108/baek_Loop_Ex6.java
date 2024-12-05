//백준 - 반복문 - 빠른 A+B

package Exam_241108;

import java.io.*;

public class baek_Loop_Ex6 {
  public static void main(String[] args) throws IOException {
    //      스캐너 => BufferedReader 사용
    //      첫 줄 = 테스트 케이스
    //      다음 줄부터 테스트 케이스만큼의 줄에 입력 받는다.
    //      그 후 테스트 케이스만큼 다 받으면 각 줄을 더해서 출력한다.

    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    int testCase = Integer.parseInt(scan.readLine());

    int []result = new int[testCase];

    for(int i = 0; i < testCase; i++) {
        String num = scan.readLine();
        String [] numArray = num.split(" ");
        int A = Integer.parseInt(numArray[0]);
        int B = Integer.parseInt(numArray[1]);
        result[i] = A+B;
    }

    for (int nums : result){
        writer.write(nums + "\n");
    }
    writer.flush();
    writer.close();
  }
}
