package encapsulation;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        // now I shoud be able to access all its roperties and methods
        // since I made all those properties private i will need getter and setter methods to access and change them

        System.out.println(car1.getName());

        // lets set the car name to a diffrent one

        car1.setName("Marcedese");

        // Lets check again

        System.out.println(car1.getName());

        Car car2 = new Car();
        car2.setName("Toyota");

        System.out.println(car2.getName());


    }
}
