class Animal{
    void makesound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    @Override
    void makesound(){
        System.out.println("Bark");
    }
}
public class InheritanceExample{
    public static void main(String args[]){
        Animal a1=new Animal();
        a1.makesound();
        Dog d1=new Dog();
        d1.makesound();
    }
}