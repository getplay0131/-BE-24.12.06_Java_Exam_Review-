package Pack_241104_Exam_And_progress;

public class ArrayDi4 {
    public static void main(String[] args) {
    int arr[][] = new int[5][3];
    int value = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((arr[i][j] = value++) + " ");
            }
            if (i != arr.length-1) {
                System.out.println(" 행 넘김 ");
            } else {
                System.out.println(" 끝 ");
            }
            }
        }
    }
