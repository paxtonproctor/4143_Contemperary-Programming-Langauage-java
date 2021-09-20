// Paxton Proctor
// Programassignment1
// CMPS-4143-101 Top: Cont Programming Language
// 9/15/2021
/** The 3th problem takes a string that is a paragraph and will find the most frequent words by splitting each word
 *  and putting it into a array. then it will take that and check to see if the words are being repeated. If they are
 *  then the count for that word will be stored in a separate array. As the program runs it'll until the paragraph is
 *  completed and will then output the numbers with the highest repeated value.
 */

package ProgramAssignments.ProgramAssignment1;

public class Programassignment1_problem3 {
    public static void main(String[] args){
        
        // make a string with the paragraph
        String Paragraph = "Before trying to do any of the steps below, you should read the article" +
        "through at least once for basic understanding. Then go back and review, following these steps." +
        "He ran his machine up to the stone porch and ascending the steps rang the door bell. They" +
        "directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of" +
        "relief, and her light steps fell gradually into the measure of his. This was fully four feet under" +
        "water and the lower story of the place was two steps lower down.";

        // converts string to lower case, will make it easier in the long run.
        Paragraph = Paragraph.toLowerCase();

        // Only way I found to do this problem is by using the split method.
        // From what I can tell it splits the string during every space and then returns it into a array.
        // Then it will lastly make the array length size the number of words given in the string.
        String words [] = Paragraph.split("\s");

        // Two dynamic Arrays one for storing words and the other for counting the repeated words that pop up.
        String Storage [] = new String[words.length];
        // will need a counter variable to acknowledge the amount of times it repeats.
        int Count[] = new int[words.length];
        int repeated = 0;

        // will need a for loop to run through the string quicky
        for (int i = 0; i < words.length; i++){

            // checks to see if the word exist and stored.
            boolean wordStored = true;

            // for loop to see
            for(int j = 0; j < repeated; j++){
                // This will make sure you don't count the grammaticle inputs
                if (words[i].replaceAll("[.,;]", "").equals(Storage[j])){
                    // increase the count when word is listed
                    Count[j]++;
                    wordStored = false;
                }
            }// end of inner for loop
            // if word has been set to false then store word and increase count by 1
            if (wordStored){
                // This will make sure you don't count the grammaticle inputs
                Storage[repeated] = words[i].replaceAll("[.,;]", "");

                // set the repeated word count to 1
                Count[repeated] = 1;

                // add 1 to repeated
                repeated++;
            }
        }// end of outer for loop

        // this for loop is to determine the most frequent words
        for (int k = 0; k < repeated; k++){
            for (int l = 0; l < (repeated - k - 1); l++){
                // checks to see which words have the highest count
                if (Count[l] < Count[l + 1]){
                    int placeHolder = Count[l];
                    Count[l] = Count[l + 1];
                    Count[l + 1] = placeHolder;
                    String PlaceHolder = Storage[l];
                    Storage[l] = Storage[l + 1];
                    Storage[l + 1] = PlaceHolder;
                }
            }// end of inner for loop
        }// end of outer for loop

        for(int m = 0; m < 5; m++){
            System.out.println(Storage[m]);
        }
    }
}// end of program and problem 3
