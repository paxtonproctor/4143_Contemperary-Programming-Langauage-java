/* 
 * This is a helloworld program for java
 * @version: SE9
 * @author: Paxton Proctor
 */


package InclassHomework.PracticePrograms;

public class Puppy 
{
    int age;
    String name;

    // Constructor
    public Puppy(String puppyName){
        name = puppyName;
    }

    public Puppy(String puppyName, int Age){
        name = puppyName;
        age = Age;
    }

    public void set_name(String newName){
        name = newName;
    }

    public String get_name(){
        return name;
    }
}

class Main{
    public static void main(String []args) {
        Puppy myPuppy = new Puppy( "max" );

        System.out.println("Name: " + myPuppy.name);

        //set
        System.out.println("Setting name...");
        myPuppy.set_name("tom");

        //get
        String newName = myPuppy.get_name();
        System.out.println("after setting name: " + newName);
    }
}