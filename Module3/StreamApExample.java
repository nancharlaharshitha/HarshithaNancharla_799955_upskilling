import java.util.*;
import java.util.stream.Collectors;
class StreamApiExample{
    public static void main(String args[]){
        List<Integer> list =new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list.add(x);
        }
        List<Integer> evennumber=list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("EVEN NUMBERS: "+evennumber);
        sc.close();
    }
}