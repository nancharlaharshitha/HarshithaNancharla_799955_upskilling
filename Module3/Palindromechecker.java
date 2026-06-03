import java.util.*;
class Palindromechecker{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.next();
        s=s.replace("[a-zA-a0-9]","").toLowerCase();
        String rev= new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println(s+" is a plaindrome");
        }
        else{
            System.out.println("Not a plaindrome");
        }
        sc.close();


    }
}