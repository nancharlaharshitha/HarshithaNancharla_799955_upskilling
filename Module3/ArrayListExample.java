import java.util.*;
public class ArrayListExample {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> Students=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter Name: ");
            String name=sc.next();
            Students.add(name);
        }
        System.out.println("Students List: ");
        for(String name:Students){
            System.out.println(name);

        }
        sc.close();
    }
    
}
