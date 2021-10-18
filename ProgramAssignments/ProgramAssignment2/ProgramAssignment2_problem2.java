// Paxton Proctor
// Programassignment2: pr 2:
// CMPS-4143-101 Top: Cont Programming Language
// 10/8/2021
/** 
 * Consider the following organigram(can be found in https://en.wikipedia.org/wiki/Mammal)
 * of Mammalia family.(a: 5, b: 5, c: 10, d: 20, e:10)–(50 points)
 * a.Each of members i.has 1.Legs (count)2.Tails (yes/no)3.Brain 
 * (yes/no)4.Neurons (count)5.Precision to understand (0.00 to 100.00%)
 * 6.Birth date 7.Favorite foods 
 * ii.can 1.Eat 2.Walk 3.Sleep 4.Give Birth 
 * b.Think about perissodactyla, they can mate withcarnivoramembers;
 * can breed and produce a new family called ‘Perivora’. Perivora animals supposed to 
 * give birth to a new family ‘Periveron’. But by nature law no periveron member can be crated.
 * c.Create at least 5 animals from each family; Perviveron member cannotbe produced.
 * d.Now you can do some creativity by changing the Neurons, Precision to understand,
 * food habits, but you can’t change the legs, brains, birth date.
 * Change these features for at least 20 animals and show how it was before and how it is now.
 * From level 6to 8(Considering Mammlia as level-1 and carnivora, cetartiodactyla are on level-8), 
 * animals can run and hunt for their food. Change at least 10 animals’ running speed, 
 * hunting process and hunting food type for those who are 6-8 level animals. 
 * Try changing at least 10 animals and show(reading from files; see next bullet)what they were and what they are now.
 * e.All outcomes should be stored in a file.When you have created objects, their information should be stored in files.
 * After changing their behaviorsand attributes, they should also be storedin files. 
 * The term showmentioned in the previous sub-section refers to reading the data from files and printing to the console.
 */

package ProgramAssignments.ProgramAssignment2;

import java.io.PrintWriter; // Step 1
import java.io.IOException;

class Mammilia {

    // variables
    int Legs = 4;
    boolean Tails;
    boolean Brain = true;
    int Neurons;
    double Precision;
    int Birthdate = 100;
    String foods;
    int Speed = 1;

    // constructor
    public Mammilia(boolean Tails, int Neurons, double Precision, String foods) {
        this.Tails = Tails;
        this.Neurons = Neurons;
        this.Precision = Precision;
        this.foods = foods;
    }

    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + "\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change!" + Speed);
    }
    // to print all there attributes
    public String toPrint() {
        return ("Number of legs " + Legs + "\n"
        + "Does it have a tail? " + Tails + "\n"
        + "Does it have a brain?  " + Brain + "\n"
        + "Number of Neurons " + Neurons + "\n"
        + "The total Precision " + Precision + "%\n"
        + "When was it born? " + Birthdate + "\n"
        + "What does it eat? " + foods + "\n");
    }
}
// Theria extends from Mammilia
class Theria extends Mammilia {
    // constructor
    public Theria(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Monotremata extends Mammilia
class Monotremata extends Mammilia {
    // constructor
    public Monotremata(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // overides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Placentalia extends Theria
class Placentalia extends Theria {
    // constructor
    public Placentalia(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Marsupialia extends Theria
class Marsupialia extends Theria {
    // Constructor
    public Marsupialia(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Boreoeutheria extends Placentalia
class Boreoeutheria extends Placentalia {
    public Boreoeutheria(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Atlantogenata extends Placentalia
class Atlantogenata extends Placentalia {
    // Constructor
    public Atlantogenata(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change!" + Speed);
    }
}
// Afrotheria extends Atlantogenata
class Afrotheria extends Atlantogenata  {
    // constructor
    public Afrotheria(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Overides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change!" + Speed);
    }
}
// Xenarthra extends Atlantogenata
class Xenarthra extends Atlantogenata  {
    // Constructor
    public Xenarthra(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change!" + Speed);
    }
}
// Laurasiatheria extends Boreoeutheria
class Laurasiatheria extends Boreoeutheria {
    // Constructor
    public Laurasiatheria(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change!" + Speed);
    }
}
// Euarchontogires extends Boreoeutheria
class Euarchontogires extends Boreoeutheria {
    // Constructor
    public Euarchontogires(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Euarchonta extends Euarchontogires
class Euarchonta extends Euarchontogires {
    // Constructor
    public Euarchonta(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Glires extends Euarchontogires
class Glires extends Euarchontogires {
    // constructor
    public Glires(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Scotifera extens Laurasiatheria
class Scrotifera extends Laurasiatheria {
    // constructor
    public Scrotifera(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Eulipotyphia extends Laurasiatheria
class Eulipotyphia extends Laurasiatheria {
    // constructor
    public Eulipotyphia(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Chiroptera extend Scotifera
class Chiroptera extends Scrotifera {
    // constructor
    public Chiroptera(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Euunquiata extends Scrotifera
class Euunquiata extends Scrotifera {
    // Constructors
    public Euunquiata(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Overrides to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Ferae extends Scrotifera
class Ferae extends Scrotifera {
    // Constructor
    public Ferae(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + " legs\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + "\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Carnivora extends Ferae
class Carnivora extends Ferae {
    // constructor
    public Carnivora(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    //overrides to print
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Pholidota extends Ferae
class Pholidota extends Ferae {
    // constructor
    public Pholidota(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // Override to print function
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Cetartiodactyla extends Euunquiata
class Cetartiodactyla extends Euunquiata {
    // constructor
    public Cetartiodactyla(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // overide to print
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// Perissodactyla extends Euunquita
class Perissodactyla extends Euunquiata {
    // constructor
    public Perissodactyla(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }
    // ovverride to print
    @Override public String toPrint() {
        return (super.toPrint());
    }
    // methods
    public String Eat() {
        return("I am Eating " + foods + "\n");
    }
    public String Walk() {
        return("I am Walking on " + Legs + " legs\n");
    }
    public String Sleep() {
        return("I am Sleeping\n");
    }
    public String Give_Birth() {
        return("I gave Birth");
    }
    // to increase speed
    public void inspeed(int increment) {
        Speed += increment;
    }
    // to decrease speed
    public void despeed(int decrement) {
        Speed -= decrement;
    }
    // to print new speed
    public String toPrintSpeed() {
        return ("Speed Change! " + Speed);
    }
}
// start of main 
public class ProgramAssignment2_problem2 {
    public static void main(String [] args) throws IOException {
        PrintWriter out = new PrintWriter("ProgramAssignment2_problem2.txt");
        System.out.println("By Paxton Proctor");
        out.println("By Paxton Proctor");
        // Prints Mammilia Example for Part A
        System.out.println("*****************************************************************************************************************************\n");
        out.println("**************************************************************************\n");
        System.out.println("***This is Part A where is shows a example that each member will have the following and can do stuff***\n\n");
        out.println("***This is Part A where is shows a example that each member will have the following and can do stuff***\n\n");
        Mammilia Mammilia2 = new Mammilia(true,16,100.0, "Weed");
        System.out.println(Mammilia2.Eat()+ "\n" + Mammilia2.Give_Birth()+
        "\n" + Mammilia2.Sleep() + "\n" + Mammilia2.Walk()+ "\n"+ Mammilia2.toPrint());
        out.println(Mammilia2.Eat()+ "\n" + Mammilia2.Give_Birth()+
        "\n" + Mammilia2.Sleep() + "\n" + Mammilia2.Walk()+ "\n"+ Mammilia2.toPrint());

        // Prints Part B and C
        System.out.println("*****************************************************************************************************************************\n");
        out.println("**************************************************************************\n");
        System.out.println("***part C, Create at least 5 animals cannot create a perissodactyl***\n\n");
        out.println("***part C, Create at least 5 animals cannot create a perissodactyl***\n\n");
        Mammilia Mammilia1 = new Mammilia(true, 12, 99.3, "Grass");
        System.out.println("Mammilia\n" + Mammilia1.toPrint());
        out.println("Mammilia\n" + Mammilia1.toPrint());
        Mammilia Theria1 = new Theria(true, 11, 88.3, "Plants");
        System.out.println("Theria\n" + Theria1.toPrint());
        out.println("Theria\n" + Theria1.toPrint());
        Mammilia Placentalia1 = new Placentalia(true, 10, 77.3, "Pizza");
        System.out.println("Placentalia\n " + Placentalia1.toPrint());
        out.println("Placentalia\n " + Placentalia1.toPrint());
        Mammilia Boreoeutheria1 = new Boreoeutheria(true, 9, 66.3, "Chicken");
        System.out.println("Boreoeutheria\n" + Boreoeutheria1.toPrint());
        out.println("Boreoeutheria\n" + Boreoeutheria1.toPrint());
        Mammilia Laurasiatheria1 = new Laurasiatheria(true, 8, 55.3, "Steak");
        System.out.println("Laurasiatheria\n" + Laurasiatheria1.toPrint());
        out.println("Laurasiatheria\n" + Laurasiatheria1.toPrint());

        // Prints all of Part D
        System.out.println("*****************************************************************************************************************************\n");
        out.println("**************************************************************************\n");
        System.out.println("***part D, Change at least 20 animal attributes and change at least 10 animals hunting speed there speed and there hunting***\n\n");
        out.println("***part D, Change at least 20 animal attributes and change at least 10 animals hunting speed there speed and there hunting***\n\n");
        Mammilia Mammilia3 = new Mammilia(true, 9, 65.3, "eggs");
        Mammilia3.inspeed(3);
        System.out.println("Mammilia "+ Mammilia3.toPrintSpeed()+ "\n");
        out.println("Mammilia "+ Mammilia3.toPrintSpeed()+ "\n");
        Mammilia3.despeed(1);
        System.out.println("Mammilia "+ Mammilia3.toPrintSpeed()+ "\n");
        out.println("Mammilia "+ Mammilia3.toPrintSpeed()+ "\n");
        Mammilia Theria3 = new Theria(true, 9, 65.3, "eggs");
        Theria3.inspeed(5);
        System.out.println("Theria "+ Theria3.toPrintSpeed()+ "\n");
        out.println("Theria "+ Theria3.toPrintSpeed()+ "\n");
        Theria3.despeed(4);
        System.out.println("Theria "+ Theria3.toPrintSpeed()+ "\n");
        out.println("Theria "+ Theria3.toPrintSpeed()+ "\n");
        Mammilia Placentalia3 = new Placentalia(true, 9, 65.3, "eggs");
        Placentalia3.inspeed(8);
        System.out.println("Placentalia "+ Placentalia3.toPrintSpeed()+ "\n");
        out.println("Placentalia "+ Placentalia3.toPrintSpeed()+ "\n");
        Placentalia3.despeed(2);
        System.out.println("Placentalia "+ Placentalia3.toPrintSpeed()+ "\n");
        out.println("Placentalia "+ Placentalia3.toPrintSpeed()+ "\n");
        Mammilia Boreoeutheria3 = new Boreoeutheria(true, 9, 65.3, "eggs");
        Boreoeutheria3.inspeed(51);
        System.out.println("Boreoeutheria "+ Boreoeutheria3.toPrintSpeed()+ "\n");
        out.println("Boreoeutheria "+ Boreoeutheria3.toPrintSpeed()+ "\n");
        Boreoeutheria3.despeed(6);
        System.out.println("Boreoeutheria "+ Boreoeutheria3.toPrintSpeed()+ "\n");
        out.println("Boreoeutheria "+ Boreoeutheria3.toPrintSpeed()+ "\n");
        Mammilia Laursiatheria3 = new Laurasiatheria(true, 9, 65.3, "eggs");
        Laursiatheria3.inspeed(13);
        System.out.println("Lausiatheria "+ Laursiatheria3.toPrintSpeed()+ "\n");
        out.println("Lausiatheria "+ Laursiatheria3.toPrintSpeed()+ "\n");
        Laursiatheria3.despeed(9);
        System.out.println("Lausiatheria "+ Laursiatheria3.toPrintSpeed()+ "\n");
        out.println("Lausiatheria "+ Laursiatheria3.toPrintSpeed()+ "\n");
        Mammilia Euarchontoglires3 = new Euarchontogires(true, 9, 65.3, "eggs");
        Euarchontoglires3.inspeed(5);
        System.out.println("Euarchontoglires "+ Euarchontoglires3.toPrintSpeed()+ "\n");
        out.println("Euarchontoglires "+ Euarchontoglires3.toPrintSpeed()+ "\n");
        Euarchontoglires3.despeed(4);
        System.out.println("Euarchontoglires "+ Euarchontoglires3.toPrintSpeed()+ "\n");
        out.println("Euarchontoglires "+ Euarchontoglires3.toPrintSpeed()+ "\n");
        Mammilia Glires3 = new Glires(true, 9, 65.3, "eggs");
        Glires3.inspeed(18);
        System.out.println("Glires "+ Glires3.toPrintSpeed()+ "\n");
        out.println("Glires "+ Glires3.toPrintSpeed()+ "\n");
        Glires3.despeed(12);
        System.out.println("Glires "+ Glires3.toPrintSpeed()+ "\n");
        out.println("Glires "+ Glires3.toPrintSpeed()+ "\n");
        Mammilia Ferae3  = new Ferae(true, 9, 65.3, "eggs");
        Ferae3.inspeed(555);
        System.out.println("Ferae "+ Ferae3.toPrintSpeed()+ "\n");
        out.println("Ferae "+ Ferae3.toPrintSpeed()+ "\n");
        Ferae3.despeed(444);
        System.out.println("Ferae"+ Ferae3.toPrintSpeed()+ "\n");
        out.println("Ferae"+ Ferae3.toPrintSpeed()+ "\n");
        Mammilia Chiroptera3 = new Chiroptera(true, 9, 65.3, "eggs");
        Chiroptera3.inspeed(84);
        System.out.println("Chiroptera "+ Chiroptera3.toPrintSpeed()+ "\n");
        out.println("Chiroptera "+ Chiroptera3.toPrintSpeed()+ "\n");
        Chiroptera3.despeed(21);
        System.out.println("Chiroptera "+ Chiroptera3.toPrintSpeed()+ "\n");
        out.println("Chiroptera "+ Chiroptera3.toPrintSpeed()+ "\n");
        Mammilia Euunguiata3  = new Euunquiata(true, 9, 65.3, "eggs");
        Euunguiata3.inspeed(50);
        System.out.println("Euunguiata "+ Euunguiata3.toPrintSpeed()+ "\n");
        out.println("Euunguiata "+ Euunguiata3.toPrintSpeed()+ "\n");
        Euunguiata3.despeed(40);
        System.out.println("Euunguiata"+ Euunguiata3.toPrintSpeed()+ "\n");
        out.println("Euunguiata"+ Euunguiata3.toPrintSpeed()+ "\n");


        System.out.println("Mammilia\n" + Mammilia3.toPrint());
        out.println("Mammilia\n" + Mammilia3.toPrint());
        Mammilia Theria2 = new Theria(false, 2, 12.3, "trees");
        System.out.println("Theria\n" + Theria2.toPrint());
        out.println("Theria\n" + Theria2.toPrint());
        Mammilia Placentalia2 = new Placentalia(true, 3, 43.8, "people");
        System.out.println("Placentalia\n " + Placentalia2.toPrint());
        out.println("Placentalia\n " + Placentalia2.toPrint());
        Mammilia Boreoeutheria2 = new Boreoeutheria(true, 99, 3.3, "cs professors");
        System.out.println("Boreoeutheria\n" + Boreoeutheria2.toPrint());
        out.println("Boreoeutheria\n" + Boreoeutheria2.toPrint());
        Mammilia Laurasiatheria2 = new Laurasiatheria(false, 82, 54.3, "cs students not including Paxton");
        System.out.println("Laurasiatheria\n" + Laurasiatheria2.toPrint());
        out.println("Laurasiatheria\n" + Laurasiatheria2.toPrint());
        Mammilia Monotremata1 = new Monotremata(false, 1, 23.9, "computers");
        System.out.println("Monotremata\n" + Monotremata1.toPrint());
        out.println("Monotremata\n" + Monotremata1.toPrint());
        Mammilia Marsupialia1 = new Marsupialia(true, 90, 12.333, "shrimp");
        System.out.println("Marsupialia\n" + Marsupialia1.toPrint());
        out.println("Marsupialia\n" + Marsupialia1.toPrint());
        Mammilia Atlantogenata1 = new Atlantogenata(true, 34, 43.8888, "Tobey Maguire");
        System.out.println("Atlantogenata\n " + Atlantogenata1.toPrint());
        out.println("Atlantogenata\n " + Atlantogenata1.toPrint());
        Mammilia Xenarthra1 = new Xenarthra(true, 999, 3.23, "fish");
        System.out.println("Xenarthra\n" + Xenarthra1.toPrint());
        out.println("Xenarthra\n" + Xenarthra1.toPrint());
        Mammilia Afrotheria1 = new Afrotheria(false, 823, 54.3333, "sharks");
        System.out.println("Afrotheria\n" + Afrotheria1.toPrint());
        out.println("Afrotheria\n" + Afrotheria1.toPrint());
        Mammilia Euarchontoglires1 = new Euarchontogires(true, 6, 12.3, "poop");
        System.out.println("Euarchontoglires\n" + Euarchontoglires1.toPrint());
        out.println("Euarchontoglires\n" + Euarchontoglires1.toPrint());
        Mammilia Glires1 = new Glires(false, 28, 23.66, "Soup");
        System.out.println("Glires\n" + Glires1.toPrint());
        out.println("Glires\n" + Glires1.toPrint());
        Mammilia Euarchonta1 = new Euarchonta(true, 39, 41.8, "people");
        System.out.println("Euarchonta\n " + Euarchonta1.toPrint());
        out.println("Euarchonta\n " + Euarchonta1.toPrint());
        Mammilia Scrotifera1 = new Scrotifera(false, 22, 3.333, "cs professors");
        System.out.println("Scrotifera\n" + Scrotifera1.toPrint());
        out.println("Scrotifera\n" + Scrotifera1.toPrint());
        Mammilia Eulipotyphia1 = new Eulipotyphia(false, 82, 54.3, "cs students not including Paxton");
        System.out.println("Eulipotphia\n" + Eulipotyphia1.toPrint());
        out.println("Eulipotphia\n" + Eulipotyphia1.toPrint());
        Mammilia Chiroptera1 = new Chiroptera(false, 1, 23.9, "computers");
        System.out.println("Chiroptera\n" + Chiroptera1.toPrint());
        out.println("Chiroptera\n" + Chiroptera1.toPrint());
        Mammilia Euungulata1 = new Euunquiata(true, 90, 12.333, "shrimp");
        System.out.println("Euunquiata\n" + Euungulata1.toPrint());
        out.println("Euunquiata\n" + Euungulata1.toPrint());
        Mammilia Ferae1 = new Ferae(true, 34, 43.8888, "Tobey Maguire");
        System.out.println("Ferae\n " + Ferae1.toPrint());
        out.println("Ferae\n " + Ferae1.toPrint());
        Mammilia Cetartiodactyla1 = new Cetartiodactyla(true, 999, 3.23, "fish");
        System.out.println("Cetartiodactyla\n" + Cetartiodactyla1.toPrint());
        out.println("Cetartiodactyla\n" + Cetartiodactyla1.toPrint());
        Mammilia Perissodactyla1 = new Perissodactyla(false, 823, 54.3333, "sharks");
        System.out.println("Perissodactyla\n" + Perissodactyla1.toPrint());
        out.println("Perissodactyla\n" + Perissodactyla1.toPrint());
        out.close();
    }// end of main
}// end of program