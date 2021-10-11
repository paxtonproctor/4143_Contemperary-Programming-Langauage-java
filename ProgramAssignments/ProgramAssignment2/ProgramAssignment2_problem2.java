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
 * d.Now you can do some creativity by changing the neurons, precision to understand,
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

abstract class Mammilia {

    // variables
    int Legs;
    boolean Tails;
    boolean Brain;
    int Neurons;
    double Precision;
    int Birthdate;
    String foods;

    // constructor
    public Mammilia(int Legs, boolean Tails, Boolean Brain, int Neurons, double Precision, int Birthdate, String foods) {
        this.Legs = Legs;
        this.Tails = Tails;
        this.Brain = Brain;
        this.Neurons = Neurons;
        this.Precision = Precision;
        this.Birthdate = Birthdate;
        this.foods = foods;
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
    public abstract String toPrint() {
        System.out.println("Mammilia\n");
        return ("Number of legs " + Legs + "\n"
        + "Does it have a tail? " + Tails + "\n"
        + "Does it have a brain?  " + Brain + "\n"
        + "Number of Neurons " + Neurons + "\n"
        + "The total Precision " + Precision + "%\n"
        + "When was it born? " + Birthdate + "\n"
        + "What does it eat? " + foods + "\n");
    }
}

class Theria extends Mammilia {
    public Theria(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Theria\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Monotremata extends Mammilia {
    public Monotremata(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Monotremata\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Placentalia extends Theria {
    public Placentalia(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Placetalia\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Marsupialia extends Theria {
    public Marsupialia(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Marsupialia\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Boreoeutheria extends Placentalia {
    public Boreoeutheria(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Boreoeutheria\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Atlantogenata extends Placentalia {
    public Atlantogenata(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Atlantogenata\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Afrotheria extends Atlantogenata  {
    public Afrotheria(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Afrotheria\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Xenarthra extends Atlantogenata  {
    public Xenarthra(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Xenarthra\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Laurasiatheria extends Boreoeutheria {
    public Laurasiatheria(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Laurasiatheria\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Euarchontogires extends Boreoeutheria {
    public Euarchontogires(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Euarchontogires\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Euarchonta extends Euarchontogires {
    public Euarchonta(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Euarchonta\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Glires extends Euarchontogires {
    public Glires(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Glires\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Scrotifera extends Laurasiatheria {
    public Scrotifera(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Scrotifera\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Eulipotyphia extends Laurasiatheria {
    public Eulipotyphia(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Eulipotyphia\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Chiroptera extends Scrotifera {
    public Chiroptera(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Chiroptera\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Euunquiata extends Scrotifera {
    public Euunquiata(boolean tails, int neurons, double precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Euunquiata\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Ferae extends Scrotifera {
    public Ferae(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Ferae\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Carnivora extends Ferae {
    public Carnivora(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Carnivora\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Pholidota extends Ferae {
    public Pholidota(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Pholidota\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Cetartiodactyla extends Euunquiata {
    public Cetartiodactyla(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Cetartiodactylia\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

class Perissodactyla extends Euunquiata {
    public Perissodactyla(boolean Tails, int Neurons, double Precision, String foods){
        super(Tails, Neurons, Precision, foods);
    }

    @Override public String toPrint() {
        return ("Perissodactyla\n" + super.toPrint() + "\n");
    }

    public void Eat() {
        System.out.println("I am Eating" + foods + "\n");
    }
    public void Walk() {
        System.out.println("I am Walking on " + Legs + "Legs\n");
    }
    public void Sleep() {
        System.out.println("I am Sleeping\n");
    }
    public void Give_Birth() {
        System.out.println("I gave Birth\n");
    }
}

public class ProgramAssignment2_problem2 {
    public static void main(String [] args) {
        Mammilia Mammilia1 = new Mammilia(4, true, true, 12, 99.3, 1200, "Grass");
        System.out.println(Mammilia1.toPrint());
        Mammilia Theria1 = new Theria(true, 11, 88.3, "Plants");
        System.out.println(Theria1.toPrint());
        Mammilia Placentalia1 = new Placentalia(true, 10, 77.3, "Pizza");
        System.out.println(Placentalia1.toPrint());
        Mammilia Boreoeutheria1 = new Boreoeutheria(true, 9, 66.3, "Chicken");
        System.out.println(Boreoeutheria1.toPrint());
        Mammilia Laurasiatheria1 = new Laurasiatheria(true, 8, 55.3, "Steak");
        System.out.println(Laurasiatheria1.toPrint());
    }
}