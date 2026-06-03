import java.util.*;
class HashMapExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> students =new HashMap<>();
        System.out.println("Enter number of students: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Student ID: ");
            int x=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name=sc.next();
            students.put(x,name);

        }
        System.out.println("Enter id to search: ");
        int s=sc.nextInt();
        if(students.containsKey(s)){
            System.out.println("Student Name: "+students.get(s));
        }
        else{
            System.out.println("Invalid ID");
        }
        sc.close();

    }
}