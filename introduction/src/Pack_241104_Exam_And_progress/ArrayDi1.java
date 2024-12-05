package Pack_241104_Exam_And_progress;

public class ArrayDi1 {
    public static void main(String[] args) {

        int [][] arr = new int[2][3];
    int value = 0;

        for (int i = 0; i < 2; i++) {

            System.out.print((arr[i][0] = value++) + " ");
            System.out.print((arr[i][1] = value++) + " ");
            System.out.print((arr[i][2] = value++) + " ");
        System.out.println(" ||" + i + "행");
        }

//        System.out.print(arr[0][0]);
//        System.out.print(arr[0][1]);
//        System.out.print(arr[0][2]);
//        System.out.println(" || 0행");
//
//        System.out.print(arr[1][0]);
//        System.out.print(arr[1][1]);
//        System.out.print(arr[1][2]);
//        System.out.println(" || 1행");

    }
}