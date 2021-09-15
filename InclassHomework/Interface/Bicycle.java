package InclassHomework.Interface;

interface Vehicle{
    public void changeGear(int a);
    public void speedUp(int a);
    public void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    public int gear;
    public int speed;

    public void changeGear(int myGear){
        gear = myGear;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
   }
}

class Bike implements Vehicle{
    public int gear;
    public int speed;

    public void changeGear(int myGear){
        gear = myGear;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
   }
}

class Car implements Vehicle{
    public int gear;
    public int speed;

    public void changeGear(int myGear){
        gear = myGear;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
   }
}

class main{
    public static void main(String [] args){
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(1);
        bicycle.speedUp(2);
        bicycle.applyBrakes(3);
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(4);
        bike.speedUp(5);
        bike.applyBrakes(6);
        bike.printStates();

        Car car = new Car();
        car.changeGear(7);
        car.speedUp(8);
        car.applyBrakes(9);
        car.printStates();

    }
}