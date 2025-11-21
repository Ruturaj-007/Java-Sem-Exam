package sem_exm.enumerations.TwoDArray_01;

import java.util.Scanner;

public class Access2DArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take matrix size input
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the elements in matrix");

        // input
        for (row = 0; row < arr.length; row++) {            // arr.length give no of rows
            for (col = 0; col < arr[row].length; col++) {   // for each col in every row
                arr[row][col] = sc.nextInt();
            }
        }

        // print
        for (row = 0; row < arr.length; row++) {            // arr.length give no of rows
            for (col = 0; col < arr[row].length; col++) {   // for each col in every row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
