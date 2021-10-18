// Paxton Proctor
// Programassignment2: pr 3:
// CMPS-4143-101 Top: Cont Programming Language
// 10/8/2021
/** Create a calculator class which can perform certain operations:
 *  addition, subtraction, multiplication, division, and modulo.
 *  Now, add Java exception handling to yourcode by defining two exception classesSyntaxErrorand RuntimeError.
 *  A SyntaxErrorexception should be thrown whenan illegal character is found, a closing )is not found, 
 *  or a =is not used twice in anexpressionor an unwanted alphanumeric character inside the equation. 
 *  A RuntimeErrorexception should be thrown when a divide by zero occurs. 
 *  The exceptions should propagate the error to the main program which prints the diagnostics of the error. 
 *  You must handle these errors using Java exceptions and 
 *  the message should be printed by a Java exception handler in a catch clause.(30 points)
 */

package ProgramAssignments.ProgramAssignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// creation of Syntax error that will throw a exception
class SyntaxError extends Exception {
    String Error;
    // Constructor to show error to test case
    public SyntaxError(String Error) {
        this.Error = Error;
    }

    //overide to string message anytime a Syntax error pops up
    @Override public String getMessage() {
        return this.Error;
    }
}

// creation of runtime error what will throw a exception
class RunTimeError extends Exception {
    String Error;
    // Constructor to show error to test case
    public RunTimeError(String Error) {
        this.Error = Error;
    }

    //overide to string message anytime a RunTime error pops up
    @Override public String getMessage() {
        return this.Error;
    }
}

// start of main
public class ProgramAssignment2_problem3 {
    public static int Solution(String TestingCase) throws RunTimeError, SyntaxError {
        
        // initializing variables
        int Sol = 0;
        int rightBrace = 0;
        int leftBrace = 0;
        int equalSign = 0;

        // start of for loop to look through the cases and showing errors
        for (int i = 1; i < TestingCase.length(); i++) {
            
            // checking for equation signs
            if (TestingCase.charAt(i) == '=') {
                equalSign++;
            }
            // checking for left brace
            if (TestingCase.charAt(i) == '(') {
                leftBrace++;
            }
            // checking for right brace
            if (TestingCase.charAt(i) == ')') {
                rightBrace++;
            }
            // checking to see if there is more than one variable
            //checking to see if there is a divion of zero
            if (TestingCase.charAt(i) == '/') {
                if (TestingCase.charAt(i + 1) == '0') {
                    // Exception case thrown
                    throw new RunTimeError(TestingCase + "Syntax Error: Divide by 0 occurred");
                }
            }
            // checking for one or more variables
            if ("abcdefghjklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUWXYZ".contains(""
             + TestingCase.charAt(i))) {
                throw new SyntaxError(TestingCase + "Syntax Error: more than one veriable");
            }
        }
        // checking to see if the braces are equal
        if (leftBrace < rightBrace) {
            throw new SyntaxError(TestingCase + "Syntax: Error: ')' expected ");
        }
        else if (leftBrace > rightBrace) {
            throw new SyntaxError(TestingCase + "Syntax: Error: '(' expected ");
        }
        // checking for equal
        if (equalSign < 1) {
            throw new SyntaxError(TestingCase + "Syntax: Error: must need one '=' ");
        }
        else if (equalSign > 1) {
            throw new SyntaxError(TestingCase + "Syntax: Error: mor than one '=' ");
        }

        Sol = Solution(TestingCase);

        return Sol;
    }
    public static void main(String [] args) throws RunTimeError, SyntaxError, FileNotFoundException {
        // Creates a file to print to.
        File fi = new File("Problem3.txt");

        Scanner Readme = new Scanner(fi);

        while(Readme.hasNextLine()) {
            String Line = Readme.nextLine();

            try {
                Solution(Line);
            }
            finally {
                Readme.close();
            }
        }
       

    }// end of main
}// end of program
