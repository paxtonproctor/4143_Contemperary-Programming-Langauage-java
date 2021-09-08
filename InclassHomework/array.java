/** 
 * This is a Array program for java
 * @version: SE9
 * @author: Paxton Proctor
 */


package InclassHomework;

public class array {
    public static void main(String[] args){
        int [] age = {10, 20, 100, 40, 90, 67};
        //age[0]
        //length of the array
        System.out.println(age.length);

        //regular array
        for(int i=0; i<age.length; i++){
            System.out.println(age[i]); // age[0]. age[1],...
        }
        // for each
        for(int element: age){
            System.out.println(element);
        }

        // calculate sum and avg
        int [] numbers = { 1, 2, 3, 4, 5};
        double avg;

        int sum = 0;

        for (int number: numbers){
            sum = sum + number;
        }
        System.out.println(sum);

        avg = (double)sum / (double) numbers.length;

        System.out.println(avg);
    }
}
