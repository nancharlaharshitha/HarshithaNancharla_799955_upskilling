import java.util.*;
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second number: ");
        int b=sc.nextInt();
        System.out.print("CHoose Operator(+, -, *, /): ");
        char op=sc.next().charAt(0);
        double result;
        switch(op){
            case '+':
                result=a+b;
                System.out.println("Result: "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("Result: "+result);
                break;
            case '*':
                result=a*b;
                System.out.println("Result: "+result);
                break;
            case '/':
                if(b!=0){
                    result=a+b;
                    System.out.println("Result: "+result);
                    break;
                }
                else{
                    System.out.println(" Error! Division by Zero is not allowed");
                }
            default:
                System.out.println("Invalid Operator");
                
        }
        sc.close();

    }
}