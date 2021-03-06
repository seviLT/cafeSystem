import java.util.ArrayList;
import java.util.Scanner;

//customers can use the system
//to make bookings and view information about the menus etc.
public class Customer extends  Person {

    static Scanner scanner = new Scanner(System.in);

    private int custId = 0;
    private String address;
    private String password;
    private ArrayList<Order> orderHistory;

    public Customer(String fName, String lName, String password, String address) {
        super(fName,lName);
        ++this.custId ;
        this.address = address;
        this.password = password;
        this.orderHistory = new ArrayList<Order> ();
    }


    public int getCustId() {
        return custId;
    }

    public String getAddress() {
        return address;
    }


    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //create customer, add/delete method in database though

    public static Customer createCustomer()
    {
        System.out.println("Enter first name:");
        String fName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lName = scanner.nextLine();

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        Customer cust = new Customer(fName,lName, password, address);

        return cust;


    }



}
