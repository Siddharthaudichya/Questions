class Car{
    String brand;
    String model;
    int year;

    // constructors
    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

        // method to display car details
        void displayCarDetails() {
            System.out.println("car: "+ brand +" " + model + "(" + year + ")");
        }
    

    
        public static void main(String[] args) {

            // creating objects of the car class
            Car car1 = new Car("Tesla :", "Model s :", 2024);
            Car car2 = new Car("BMW :", "X5 :", 2023);

            // calling methods using objects
            car1.displayCarDetails();
            car2.displayCarDetails();
        }
    
}