// Main class to run the program
public class Abstract {
    public static void main(String[] args) {

        // Create an instance of Tesla using a reference of type Car
        Car myCar = new Tesla();

        // Call overridden method
        myCar.startCar();  // Should print: Tesla starts silently with an electric motor!

        // Call concrete method from the Car class
        myCar.playMusic(); // Should print: Playing music...
    }
}

// Abstract class 'Car' with an abstract method and a concrete method
abstract class Car {
    // Explicitly define a no-argument constructor
    public Car() {
        // Optional initialization code for Car
    }

    // Abstract method (no body)
    abstract void startCar(); 

    // Concrete method with a body
    void playMusic() {         
        System.out.println("Playing music...");
    }
}

// Tesla class extends Car and provides implementation for the abstract method
class Tesla extends Car {

    // Implementing the abstract startCar method
    @Override
    void startCar() {
        System.out.println("Tesla starts silently with an electric motor!");
    }
}

