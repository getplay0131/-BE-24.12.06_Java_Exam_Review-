package Pack_241104_Exam_And_progress;

public class ArrayDi2 {
    public static void main(String[] args) {
int arr [][] = new int[2][3];
int value = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = value++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" || " + i + " 행");
//            value = 0;
        }





        //int i = 2;
//int j = 3;
//int value = 0;
//int[][] arr = new int[i][j];
//        int row = 0;
//        for (i = 0; i < 2; i++) {
//                if (i == 1 || j == 2) {
//                    value = 0;
//                    System.out.println(" || " + row + "행");
//                    row++;
//                }
//            for (j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + value);
//                value++;
//                if ((i==1 && j == 2)) {
//                    System.out.println(" || " + row + "행");
//                }
//            }
//arr[0][0] = 1;
//arr[0][1] = 2;
//arr[0][2] = 3;
//arr[1][0] = 4;
//arr[1][1] = 5;
//arr[1][2] = 6;

//        System.out.print(arr[0][1]);
//        System.out.print(arr[0][2]);
//
//        System.out.print(arr[1][0]);
//        System.out.print(arr[1][1]);
//        System.out.print(arr[1][2]);
//        System.out.println(" || 1행");
        }
    }
//}