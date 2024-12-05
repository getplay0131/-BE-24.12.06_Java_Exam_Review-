package Loop;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int max = 2;

        for (int j = i; j <= max ; j++) {
            sum += j;
        }
        System.out.println("sum =" + sum);


        //        while (i <= max) {
//            sum += i;
//            i++;
//        }
//            System.out.println("sum = " + sum);
    }
}
