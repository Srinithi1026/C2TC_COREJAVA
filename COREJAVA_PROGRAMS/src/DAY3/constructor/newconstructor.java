package DAY3.constructor;
import java.util.Scanner;
class Customer {
    private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public Customer() {
        System.out.println("Default constructor invoked");
    }

    // Parameterized constructor
    public Customer(String customerName, int customerId, String customerCity) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
        System.out.println("Parameterized constructor invoked");
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    // To print customer details
    @Override
    public String toString() {
        return "Customer [Id=" + customerId + ", Name=" + customerName + ", City=" + customerCity + "]";
    }
}

public class newconstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;

        // First customer (using default constructor)
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        System.out.println();

        Customer c1 = new Customer(); // default constructor invoked
        c1.setCustomerName(name);
        c1.setCustomerId(id);
        c1.setCustomerCity(city);
        System.out.println(c1);

        // Second customer (using parameterized constructor)
        System.out.print("Enter Customer Id : ");
        id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Customer Name : ");
        name = sc.nextLine();

        System.out.print("Enter Customer City : ");
        city = sc.nextLine();

        Customer c2 = new Customer(name, id, city); // parameterized constructor invoked
        System.out.println(c2);

        sc.close();
	}

}
