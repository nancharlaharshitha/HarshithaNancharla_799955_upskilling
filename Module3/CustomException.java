import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException{
    public static void checkage(int age) throws InvalidAgeException{
        if(age<=18){
            throw new InvalidAgeException("Age must me greater than 18");
        }
        else{
            System.out.println("Valid Age");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            checkage(age);

        }
        catch(InvalidAgeException e){
            System.out.println("Exception got: "+e.getMessage());

        }
        sc.close();
    }
}