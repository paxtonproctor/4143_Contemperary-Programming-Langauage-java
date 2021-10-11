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


// creation of Syntax error that will throw a exception
class SyntaxError extends Exception {

}

// creation of runtime error what will throw a exception
class RunTimeError extends Exception {

}


public class ProgramAssignment2_problem3 {

    public static void main(String [] args){

    }
}
