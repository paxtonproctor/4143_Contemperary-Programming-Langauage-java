package InclassHomework.Inheritance;
 
public class MountainBike extends Bicycle{
    public int SeatHeight;
    public MountainBike(int gear, int speed, int seatHeight){
        // calling parent constructor
        super(gear, speed);
        SeatHeight = seatHeight;
    }

    public void setHeight(int newseatHeight){
        SeatHeight = newseatHeight;
    }
    @Override
    public String showStatus(){
        return ("I am using the gear of "+gear+"\nand my speed is "+speed+"\nmy seat height is "+ SeatHeight);
    }
}

