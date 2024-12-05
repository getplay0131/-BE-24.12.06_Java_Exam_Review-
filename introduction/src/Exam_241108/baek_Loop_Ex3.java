//백준 - 반복문- 합

package Exam_241108;

import java.util.Scanner;

public class baek_Loop_Ex3 {
    public static void main(String[] args) {
//        숫자를 입력 받고, 1부터 해당 숫자까지 더하여 출력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1; i <= n ; i++) {
        sum += i;
        }
            System.out.println(sum);

    }
}