package Scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("귀하의 이름을 입력해주세요 : ");
        String name = scan.nextLine();
        System.out.print("귀하의 이름을 입력해주세요 : ");
        int age = scan.nextInt();
        System.out.println("귀하의 이름은 " + name + ",이고 나이는 " + age + "이(시)네요! 만나서 반갑습니다!");


    }
}