interface ONE{
    public void print_one();
}

interface TWO{
    public void print_two();
}

interface THREE extends ONE, TWO{
    public void print_three();
}

public class MultipleInheritance implements THREE{
    public void print_one(){

    }

    public void print_two(){

    }

    public void print_three(){

    }
}