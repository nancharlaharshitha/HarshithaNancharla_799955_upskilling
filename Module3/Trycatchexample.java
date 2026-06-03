import java.util.*;
public class Trycatchexample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        try{
            int result=a/b;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("ERROR! This causes error");
        }
        System.out.println("Program Ended Sucessfully");
        sc.close();

    }
    
}
