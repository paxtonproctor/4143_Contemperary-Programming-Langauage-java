package InclassHomework.Inheritance;

class A{
    public String print_A(){
        return ("I am from A");
    }
}

class B extends A{
    public String print_B(){
        return ("I am from B");
    }
}

class C extends A{
    public String print_C(){
        return ("I am from C");
    }
}

class D extends A{
    public String print_D(){
        return ("I am from D");
    }
}
public class Hierarchical {
    public static void main(String[] args){
        A objA = new A();
        B objB = new B();
        C objC = new C();
        D objD = new D();
        System.out.println(objA.print_A());
        System.out.println(objB.print_B());
        System.out.println(objC.print_C());
        System.out.println(objD.print_D());
    }
}
