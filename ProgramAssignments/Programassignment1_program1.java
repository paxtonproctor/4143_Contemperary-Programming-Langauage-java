// Paxton Proctor
// Programassignment1
// CMPS-4143-101 Top: Cont Programming Language
// 9/15/2021
/** The first problem takes a array of 20 integers and will sort them in order from smallest to largest.
 *  Then it will print out the smallest and largest number.
 */

package ProgramAssignments;

import java.util.Arrays; 

public class Programassignment1_program1 {
    public static void main(String[] args){ //creating a array of 20 elements

        // array hold 20 elements
        int[] firstArray = {11, 33, 22, 44, 55, 77, 66, 99, 88, 84, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70};

        // sorts the array
        Arrays.sort(firstArray);

        // print the smallest and largest number
        System.out.println("This is going to be the smallest number"+ firstArray[0]);
        System.out.println("This is going to be the largest number"+ firstArray[19]);
        
        // end of program and problem 1
    }
}

