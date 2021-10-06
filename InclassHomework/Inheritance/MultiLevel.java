package InclassHomework.Inheritance;

class one{
    public String print_one(){
        return ("I am from BASE class");
    }
}

class two extends one{
    public String print_two(){
        return ("I am from INTERMEDIATE  class");
    }
}

class three extends two{
    public String print_three(){
        return ("I am from CHILD class");
    }
}
public class MultiLevel {
    public static void main (String[] args) {
        three childObj = new three();
        System.out.println(childObj.print_one());
        System.out.println(childObj.print_two());
        System.out.println(childObj.print_three());
    }
}