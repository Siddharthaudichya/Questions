public class Copy_Constructor {
    class Employee {
        String name;
        int id;
    
        // Parameterized Constructor
        Employee(String empName, int empId) {
            name = empName;
            id = empId;
        }
    
        // Copy Constructor
        Employee(Employee emp) {
            this.name = emp.name;
            this.id = emp.id;
        }
    
        void display() {
            System.out.println("Employee: " + name + ", ID: " + id);
        }
    }
    
    
        public static void main(String[] args) {
            Copy_Constructor cp = new Copy_Constructor();
            Employee emp1 = cp.new Employee("Alice", 103);
            Employee emp2 = cp.new Employee(emp1); // Copying emp1
    
            emp1.display();
            emp2.display();
        }
    
}
