/** 
 * This is a Matrix program for java
 * @version: SE9
 * @author: Paxton Proctor
 */

//input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
//Output: [1, 2, 3, 4, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 7, 11, 10]

package InclassHomework;

// Java library
import java.util.*;

class SpiralMatrix {
    // Function to print the spiral order
    public static List<Integer> spiralOrder(int[][] matrix) {

        // initialization
        List<Integer> ans = new ArrayList<>();
        int rows = matrix[0].length;
        int coloumns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = coloumns - 1;
        int down = rows - 1;

        // while loop
        while (ans.size() < rows * coloumns){
            // left to right
            for (int col = left; col <= right; col++){
                ans.add(matrix[up][col]);
            }
            // top to bottom
            for (int row = up; row <= down; row++){
                ans.add(matrix[row][right]);
            }
            // makes sure the row is different
            if (up != down) {
                for (int col = right - 1; col >= left; col --) {
                    ans.add(matrix[down][col]);
                }
            }
            // makes sure the coloumn is different
            if (left != right) {
                for (int row = down - 1; row > up; row--){
                    ans.add(matrix[row][left]);
                }
            }
            left++; right--; up++; down--;
        }
        return ans;
    }

    // initialize and print
    public static void main(String[] args)
    {
        int matrix[][] = { { 1, 2, 3, 4 },
                  { 5, 6, 7, 8 },
                  { 9, 10, 11, 12 },
                  { 13, 14, 15, 16 } };
        // print matrix
        System.out.println(spiralOrder(matrix));
    }
}