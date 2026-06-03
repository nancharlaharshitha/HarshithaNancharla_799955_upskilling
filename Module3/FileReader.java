import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class FileReader {
    public static void main(String args[]){
        try{
            File file=new File("Output.txt");
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine()){
                String data=reader.nextLine();
                System.out.println(data);

            }
            reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error occurred: "+e.getMessage());
        }
    }
}
