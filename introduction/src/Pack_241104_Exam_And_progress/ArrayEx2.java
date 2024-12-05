//배열에 입력값 넣는걸 몰라서 선생님 답 참고해서 작성

package Pack_241104_Exam_And_progress;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("5개의 정수를 입력해주세요! : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i == num.length - 1) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }
        }


//        System.out.println("5개의 정수를 입력해주세요! : ");
//        int num = scan.nextInt();
//
//        int [] arr = {num, num, num, num, num};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("출력");
//            System.out.print(num);
//            if (i == arr.length-1) {
//                System.out.print(" ");
//            }
//            System.out.print(", ");
//        }

    }
}