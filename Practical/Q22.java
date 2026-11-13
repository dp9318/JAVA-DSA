import java.io.*;

class EmployeeRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    double salary;

    EmployeeRecord(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary);
    }
}

class Q22 {
    public static void main(String[] args) {
        String filename = "employee.ser";
        EmployeeRecord emp = new EmployeeRecord(101, "Dipankar", 65000);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(emp);
            oos.close();
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            EmployeeRecord deserializedEmp = (EmployeeRecord) ois.readObject();
            ois.close();
            System.out.println("Object deserialized successfully:");
            deserializedEmp.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

