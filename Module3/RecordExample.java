import java.util.*;
import java.util.stream.Collectors;
record person(String name,int age){}
class RecordExample{
    public static void main(String args[]){
        person p1=new person("Harshitha",19);
        person p2=new person("Kavya",16);
        person p3=new person("Siri",20);
        System.out.println("All persons");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<person> people=Arrays.asList(p1,p2,p3);
        List<person> list=people.stream().filter(person->person.age()>=18).collect(Collectors.toList());
        System.out.println("Filtered List: "+list);
    }
}