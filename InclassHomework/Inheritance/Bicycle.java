/** 
 * This is a inheritance program for java
 * @version: SE9
 * @author: Paxton Proctor
 */


package InclassHomework.Inheritance;

public class Bicycle {

    // variables
    public int gear;
    public int speed;

    //constructor
    public Bicycle(int myGear, int mySpeed){
        this.gear = myGear;
        this.speed = mySpeed;
    }

    //behaviors
    public void applyBrake(int decrement){
        //speed = speed - decrement;
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }
    public String showStatus(){
        return ("I am using the gear of "+gear+"\nand my speed is "+speed);
    }
}
