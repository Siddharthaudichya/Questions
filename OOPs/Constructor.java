public class Constructor {
    class Employee {
    String name;
    int id;

    // Default Constructor
     Employee() {
        name = "Not assigned";
        id = 0;
        System.out.println("Employee object Created");
    }

    void display() {
        System.out.println("Employee: " + name + ", Id: " + id);
    }
}

    public static void main(String[] args){
        Constructor constructor = new Constructor();    // Create an instance of the outer class
        Employee emp1 = constructor.new Employee();   // Constructor automatically called
        // Create an instance of the inner class using the outer class instance
        

        emp1.display();
    }
}
