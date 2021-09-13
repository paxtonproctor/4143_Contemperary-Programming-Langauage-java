package InclassHomework.Inheritance;

public class Driver {
    public static void main(String args[]){
        System.out.println("Calling from main");

        MountainBike mBike = new MountainBike(4, 25, 7);
        System.out.println(mBike.showStatus());
    }
}
