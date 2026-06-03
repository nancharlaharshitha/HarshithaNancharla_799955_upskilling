class Classandobject{
    static class Car{
        String make;
        String model;
        int year;
        void displaydetails(){
            System.out.println("Car Details: ");
            System.out.println("MAKE: "+make);
            System.out.println("MODEL: "+model);
            System.out.println("YEAR: "+year);
        }
    }
    public static void main(String args[]){
        Car car1=new Car();
        car1.make="Mahindra";
        car1.model="Thar";
        car1.year=2010;
        Car car2=new Car();
        car2.make="Hundai";
        car2.model="creta";
        car2.year=2015;
        car1.displaydetails();
        car2.displaydetails();


    }
}