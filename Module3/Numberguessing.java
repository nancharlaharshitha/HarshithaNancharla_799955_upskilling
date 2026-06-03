import java.util.*;
class Numberguessing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int n=r.nextInt(100)+1;
        int guess;
        do{
            System.out.print("Enter Your Guess(1 to 100): ");
            guess=sc.nextInt();
            if(guess>n){
                System.out.println("Two High!");
            }
            else if(guess<n){
                System.out.println("Two Low!");
            }
            else{
                System.out.println("You Gussed Correct");
            }

        }
        while(guess!=n);

        sc.close();

    }
}