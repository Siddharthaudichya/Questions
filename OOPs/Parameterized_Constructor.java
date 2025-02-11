public class Parameterized_Constructor {
    class Employee {
        String name;
        int id;
    
        // Parameterized Constructor
        Employee(String empName, int empId) {
            name = empName;
            id = empId;
        }
    
        void display() {
            System.out.println("Employee: " + name + ", ID: " + id);
        }
    }
    
   
        public static void main(String[] args) {
            Parameterized_Constructor cp = new Parameterized_Constructor();
            Employee emp1 = cp.new Employee("John Doe", 101);
            Employee emp2 = cp.new Employee("Jane Smith", 102);
    
            emp1.display();
            emp2.display();
        }
    
}
