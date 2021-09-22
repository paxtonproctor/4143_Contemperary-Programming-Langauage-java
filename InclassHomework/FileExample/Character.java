package InclassHomework.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Character {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream in;
        //in = new FileInputStream("Sample.txt");
        try {
            //String fName = "Sample.txt";
            in = new FileInputStream("Sample.txt");
            int count = 0;
            while (in.read() != -1){
                count++;
            }
            System.out.println("total characters are" + count);
        }
        catch(FileNotFoundException e1){
            System.out.println("sample.txt is not found!");
            e1.printStackTrace();
        }
        catch(IOException e2){
            System.out.println("There might be some errors!!");
            e2.printStackTrace();
        }
        finally{
            //in.close();
            System.out.println("Bruh");
        }
    }
}
