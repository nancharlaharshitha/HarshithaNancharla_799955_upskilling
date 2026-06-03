import java.util.*;
public class LambdaExpressionExample {
    public static void main(String args[]){
        List<String> names=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter name: ");
            String s=sc.next();
            names.add(s);
        }
        Collections.sort(names ,(a,b)-> a.compareTo(b));
        for(String num:names){
            System.out.println(num);
        }
        sc.close();
    }
    
}
