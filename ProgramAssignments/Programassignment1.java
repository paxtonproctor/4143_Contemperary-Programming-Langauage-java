// Paxton Proctor
// Programassignment1
// CMPS-4143-101 Top: Cont Programming Language
// 9/15/2021
/** The first problem takes a array of 20 integers and will sort them in order from smallest to largest.
 *  Then it will print out the smallest and largest number.
 */

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
        // System.out.println(firstArray.length);

        // regular loop to print first array
        /**for(int i=0; i<firstArray.length; i++){
            System.out.println(firstArray[i]);
        }*/
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        int[] Xarray = {10, 100, 40, 28, 98, 37, 12, 63};
        System.arraycopy (Xarray, 0, Xarray, 0, Xarray.length);
        int [] copyXarray = Arrays.copyOf (Xarray, Xarray.length);
        Arrays.sort(copyXarray);

        //////////////////////////////////////////////////////////////////////////////////////////////////////
        String num4 = "Before trying to do any of the steps below, you should read the article" +
        "through at least once for basic understanding. Then go back and review, following these steps." +
        "He ran his machine up to the stone porch and ascending the steps rang the door bell. They" +
        "directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of" +
        "relief, and her light steps fell gradually into the measure of his. This was fully four feet under" +
        "water and the lower story of the place was two steps lower down.";

        String Storage [];
        int Count[];

        

        
        //String storage[][] = new int[][];

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        String num5 = "this is my first programming assignment.";

        char[] ch = new char[num5.length()];

        for(int i = 0; i < num5.length(); i++){
            ch[i] = num5.charAt(i);
        }


    }
}

