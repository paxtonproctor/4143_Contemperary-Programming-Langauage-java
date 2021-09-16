// Paxton Proctor
// Programassignment1
// CMPS-4143-101 Top: Cont Programming Language
// 9/15/2021
/** problem 4 takes a sentence and reverse it by splitting
 *  each word and storing it into a array we cna take the array
 *  and switch it by taking the elements and switching them over
 */

package ProgramAssignments;

import java.util.Arrays;

public class Programassignment1_problem2 {

   public static void main(String[] args){
    // String
    String S = "This is my first programming assignment";

    // stores each word into a array
    String wordsS [] = S.split("\s");
    // for loop creates a temporary variable and swiches the front to back
        for(int a = 0; a < wordsS.length / 2; a++) {
            String strTemp = wordsS[a];
            wordsS[a] = wordsS[wordsS.length - a - 1];
            wordsS[wordsS.length - a - 1] = strTemp;
        }// end of for loop
        System.out.println("Reversed string array: ");
        for(int a = 0; a < wordsS.length; a++) {
            System.out.println(Arrays.toString(wordsS));
        }// end of for loop
    }// end of program
}
