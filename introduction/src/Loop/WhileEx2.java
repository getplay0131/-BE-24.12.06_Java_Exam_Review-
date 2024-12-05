package Loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;

        for (count = 0; count < 10 ; ) {
            num++;
            if (num % 2 == 0) {
                count++;
                System.out.println("num = " + num);
            }
        }


//        while finish
        //        while (count < 10) {
//            num++;
//            if (num % 2 == 0) {
//                count++;
//                System.out.println("num = " + num);
//            }
//        }
    }
}
