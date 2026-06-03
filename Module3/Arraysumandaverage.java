import java.util.*;
class Arraysumandaverage{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=(double) sum/n;
        System.out.println("The sum of array Elements: "+sum);
        System.out.println("The average of array Elements: "+avg);
        sc.close();
    }
}