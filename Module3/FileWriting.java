import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileWriting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter writer=new FileWriter("Output.txt");
            System.out.println("Enter the data into the file: ");
            String data=sc.next();
            writer.write(data);
            writer.close();
            System.out.println("The data has been writeen to the the file sucessfully");
        }
        catch(IOException e){
            System.out.println("Exception got: "+e.getMessage());

        }
        sc.close();
    }

    
}
