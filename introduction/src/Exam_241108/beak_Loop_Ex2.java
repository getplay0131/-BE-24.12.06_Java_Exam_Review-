//백준 - 반복문 - a+b -3

package Exam_241108;

import java.util.Scanner;

public class beak_Loop_Ex2 {
    public static void main(String[] args) {
//      테스트 케이스 입력 받기
        Scanner scan = new Scanner(System.in);
        int testCase = Integer.parseInt(scan.nextLine());
        int [] result =new int [testCase];

//숫자 입력 받기
        for(int i = 0; i < testCase; i++) {
        int A = scan.nextInt();
        int B = scan.nextInt();
        result[i] = A + B ;
    }
        for (int num : result) {
      System.out.println(num);
        }
    }
}
