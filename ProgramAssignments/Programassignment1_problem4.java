package ProgramAssignments;

import java.util.Arrays;
import java.util.Collections;

public class Programassignment1_problem4 {
    // Function to add average in y
    public static Integer[] addAverage(int n, Integer y[], int average){
        int k;
        // increases the size by 1.
        Integer newy[] = new Integer[n + 1];

        for (k = 0; k < n; k++){
            newy[k] = y[k];
        }

        // adds the average
        newy[n] = average;

        return newy;
    }

    // searches for locations issue
    public static int searchIssue(Integer y[], int n, int temp){
        int l;
        // goes through the array to specific value
        for(l = 0; l < n; l++){
            if (y[l] == temp)
                return l;
        }// end of for loop

        return 0;
    }

    public static int DeleteIssue(Integer y[], int n, int temp){
        // calls the function to find issues
        int position = searchIssue(y, n, temp);

        // checks to see if the issue is completed
        if(position == 0){
            return n;
        }

        int m;
        // deletes the number
        for(m = position; m < n - 1; m++){
            y[m] = y[m - 1];
        }
        // returns the array without the number
        return n - 1;
    }

    public static void main(String[] args){
        int n = 8;
        Integer x[] = { 10, 100, 40, 28, 98, 37, 12, 63};

        // takes the length of x and creates the same length for y
        Integer y[] = new Integer[x.length];

        // copys contents of x into y
        System.arraycopy(x, 0, y, 0, 8);

        // prints the contents of x
        System.out.println("Contents of x[] ");
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " ");
        }
        
        // prints the contents of y
        System.out.println("\nContents of y[] ");
        for (int i = 0; i < y.length; i++){
            System.out.print(y[i] + " ");
        }
        // sorts the array in descending order.
        // uses the method reverseOrder() method of collections class.
        Arrays.sort(y, Collections.reverseOrder());

        // prints the contents of y in descending order
        System.out.println("\nArray y[] : " + Arrays.toString(y));

        // calculates the average of y
        int total = 0;
        for(int j = 0; j < y.length; j++){
            total = total + y[j];
        }
        int average = total / y.length;

        // prints average of y
        System.out.println("The average of array y: " + average);

        // calls the function
        y = addAverage(n, y, average);

        // sorts the array in descending order.
        // uses the method reverseOrder() method of collections class.
        Arrays.sort(y, Collections.reverseOrder());

        // prints the array with the average
        System.out.println("\nArray with Average" + Arrays.toString(y));

        if(x != y){
            int temp = average;
            n = DeleteIssue(y, n, temp);

            for(int b = 0; b < n; b++){
                System.out.println("deleted portion: " + y[b] + " ");
            }
        }
        else{
            System.out.println("done");
        }
    }// end of main
}// end of program
