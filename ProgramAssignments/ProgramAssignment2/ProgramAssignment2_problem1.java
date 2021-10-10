// Paxton Proctor
// Programassignment2: pr 1:
// CMPS-4143-101 Top: Cont Programming Language
// 10/8/2021
/** write an OOP code (A case study: Should be unique; 
 * If you are copying code from online you will be caught) 
 * that has the following OOP features: inheritance(any), 
 * polymorphism (runtime and compile time), 
 * abstraction and encapsulation (20 point)
 */

package ProgramAssignments.ProgramAssignment2;

// inheritance
// base class
class Fridge {

    // Fridge has 4 fields
    public int Bread;
    public int Cheese;
    public int Sauce;
    public int Pepperoni;

    // constructor
    public Fridge(int Bread, int Cheese, int Sauce, int Pepperoni) {
        this.Bread = Bread;
        this.Cheese = Cheese;
        this.Sauce = Sauce;
        this.Pepperoni = Pepperoni;
    }

    // has nine methods
    public void Addpepperoni(int increment) {
        Pepperoni += increment;
    }

    public void AddBread(int increment) {
        Bread += increment;
    }

    public void AddCheese(int increment) {
        Cheese += increment;
    }

    public void AddSauce(int increment) {
        Bread += increment;
    }

    public void UseSauce(int decrement) {
        Bread -= decrement;
    }

    public void UseCheese(int decrement) {
        Cheese -= decrement;
    }

    public void UseBread(int decrement) {
        Bread -= decrement;
    }

    public void Usepepperoni(int decrement) {
        Pepperoni -= decrement;
    }

    public String toPrint() {
        return ("Number of Bread in Fridge " + Bread + "\n"
        + "Number of Pepperoni in Fridge " + Pepperoni + "\n"
        + "Number of Cheese in Fridge  " + Cheese + "\n"
        + "Number of Sauce in Fridge " + Sauce + "\n");
    }
}

// derived class
class Oven extends Fridge {

    // one field
    public int Pan;

    // constructor
    public Oven(int Bread, int Cheese, int Sauce, int Pepperoni, int SheetPan) {
        // super class
        super(Bread, Pepperoni, Cheese, Sauce);
            Pan = SheetPan;
    }

    // two methods
    public void setPan (int newValue) {
        Pan = newValue;
    }
    
    // override to override toprint
    @Override public String toPrint() {
        return (super.toPrint() + "Pan is " + Pan);
    }
    // overloading
    public int add(int x, int y){
        return x + y;
    }

    public double add(double x, double y){
        return x + y;
    }
}

// Encapsulation
class PizzaTime {
    private String PizzaType;
    // set method
    public void setPizzaType(String newPizzaType){
        PizzaType = newPizzaType;
    }
    // get method
    public String getName(){
        return PizzaType;
    }
}

// Abstraction
abstract class PepperoniPizza {
    String Topping; 

    // abstract methods
    abstract int howMany(); 
    public abstract String toString();

    // constructors
    public PepperoniPizza(String Topping) {
        this.Topping = Topping;
    }
    // getter
    public String getTopping() {
        return Topping;
    }
}
// Honey extends from abstract class
class HoneyPizza extends PepperoniPizza {
    int typeTopping;

    public HoneyPizza(String Topping, int typeTopping) {
        super(Topping);
        System.out.println("I like Honey on my Pizza.");
        this.typeTopping = typeTopping;
    }

    // overriding how many they want
    @Override int howMany(){
        return typeTopping + 1;
    }

    // overriding tostring
    @Override public String toString() {
        return "Pepperoni Pizza has " + super.getTopping()
            + " and how much they want is : " + howMany();
    }
}
// Ranch extends from abstract class
class RanchPizza extends PepperoniPizza {
    int tyTopping;

    // constructor
    public RanchPizza(String Topping, int tyTopping) {
        super(Topping);
        System.out.println("I like Ranch on my Pizza.");
        this.tyTopping = tyTopping;
    }

    // overriding how many they want
    @Override int howMany(){
        return tyTopping + 1;
    }
    // overriding to string
    @Override public String toString() {
        return "Pepperoni Pizza has " + super.getTopping()
            + " and how much they want is : " + howMany();
    }
}
// main
public class ProgramAssignment2_problem1 {
    public static void main(String [] args){
        // Make use of Inheritance
        // method overriding use of polymorphism
        System.out.println("Inheritance");
        Oven ov = new Oven(1, 4, 10, 1, 1);
        // displaying the stuff in fridge
        System.out.println(ov.toPrint());

        // method overloading
        System.out.println("\nOverloading");
        System.out.println(ov.add(5,5));
        System.out.println(ov.add(5.2,5.3));

        // Make use of Encapsulation
        System.out.println("\nEncapsulation");
        PizzaTime obj = new PizzaTime();
        // setting variable
        obj.setPizzaType("Turkey Bacon Cheese Pizza");
        // display new variable
        System.out.println("New type of Pizza is " + obj.getName());

        // Make use of Abstraction
        System.out.println("\nAbstraction");
        PepperoniPizza h1 = new HoneyPizza("Honey", 0);
        PepperoniPizza r1 = new RanchPizza("ranch", 0);
        // display
        System.out.println(h1.toString());
        System.out.println(r1.toString());

    }// end of main
}// end of program
