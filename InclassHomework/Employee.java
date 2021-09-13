package InclassHomework;

public class Employee {

    // class variables
    String name;
    int age;
    String designation;
    double salary;

    // Constructor
    public Employee(String FirstName, int AGE, String Designation, double Salary){
        name = FirstName;
        age = AGE;
        designation = Designation;
        salary = Salary;
    }
    //mutator
    public void set_name(String newName){
        name = newName;
    }
    //accessor
    public String get_name(){
        return name;
    }
    //mutator
    public void set_AGE(int newAGE){
        age = newAGE;
    }
    //accessor
    public int get_AGE(){
        return age;
    }
    //mutator
    public void set_Designation(String newDesignation){
        designation = newDesignation;
    }
    //accessor
    public String get_Designation(){
        return designation;
    }
    //mutator
    public void set_Salary(double newSalary){
        salary = newSalary;
    }
    //accessor
    public double get_Salary(){
        return salary;
    }
}

class EmployeeTest{
    public static void main(String []args) {
        //object1
        Employee Employee1 = new Employee( "max", 23, "Manager", 17000.69 );
        //print object
        System.out.println("Name: " + Employee1.name + "\nAge: " + Employee1.age + "\nPosition: " + Employee1.designation + "\nSalary: " + Employee1.salary );
        //object2
        Employee Employee2 = new Employee( "Bob", 19, "Co-Manager", 16000.49 );
        //print object
        System.out.println("Name: " + Employee2.name + "\nAge: " + Employee2.age + "\nPosition: " + Employee2.designation + "\nSalary: " + Employee2.salary );

        //set
        System.out.println("Setting name...");
        Employee1.set_name("tom");
        Employee1.set_AGE(25);
        Employee1.set_Designation("Owner");
        Employee1.set_Salary(20000);

        //get
        String newName = Employee1.get_name();
        System.out.println("after setting name: " + newName);

        int newAGE = Employee1.get_AGE();
        System.out.println("after setting age: " + newAGE);

        String newDesignation = Employee1.get_Designation();
        System.out.println("after setting Position: " + newDesignation);

        double newSalary = Employee1.get_Salary();
        System.out.println("after setting Salary: " + newSalary);
    }
}
