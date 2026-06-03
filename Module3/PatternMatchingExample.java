public class PatternMatchingExample {
    static void checktype(Object obj){
        switch(obj){
            case Integer i-> System.out.println("Integer: "+i);
            case String s-> System.out.println("String: "+s);
            case Double d-> System.out.println("Double: "+d);
            default->System.out.println("Unknown Type");
        }
    }
    public static void main(String args[]){
        checktype("Harshitha");
        checktype(100);
        checktype("Pandu");
        checktype(23.7);
    }
    
}
