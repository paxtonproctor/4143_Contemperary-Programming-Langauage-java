// Paxton Proctor
// Programassignment1
// CMPS-4143-101 Top: Cont Programming Language
// 9/15/2021
// 

package ProgramAssignments;

import java.util.Arrays; 

public class Programassignment1 {
    public static void main(String[] args){ //creating a array of 20 elements

        // array hold 20 elements
        int[] firstArray = {11, 33, 22, 44, 55, 77, 66, 99, 88, 84, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70};

        // sorts the array
        Arrays.sort(firstArray);
        System.out.println(firstArray[0]);
        System.out.println(firstArray[19]);
        // length of array
        //System.out.println(firstArray.length);

        // regular loop
        /**
        for(int i=0; i<firstArray.length; i++){
            System.out.println(firstArray[i]);
        }
        */

        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /**
        int[] Xarray = {};
        System.arraycopy (Yarray, 0, Xarray, 0, Yarray.length);
        int [] copyXarray = Arrays.copyOf (Xarray, Xarray.length);
        */

        /**
         int matrix[][] = new int [4][4];
         for (int col = left; col <= right; col++){
             results.add(matrix[up][col]);
         }
         for (int row = up; row <= down; row++){
             results.add(matrix[row][right]);
         }
         if (up != down) {
             for (in col = right - 1; col >= left; col --) {
                 results.add(matrix[down][col]);
             }
         }
         if (left != right) {
             for (int row = down - 1; row > up; row--){
                 result.add(matrix[row][left]);
             }
         }
         int rows = matrix.length;
         int columns = matrix[0].length;
         int up = 0;
         int left = 0;
         int right = columns -1;
         int down = rows -1;
        */
    }
}
