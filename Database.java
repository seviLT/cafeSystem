import java.util.ArrayList;

//store items in its own list
//same for employers, list of customers,

public class Database {

    private ArrayList<Item> items;
    private ArrayList<Staff> staff;
    private ArrayList<Customer> customers;
    private ArrayList<Booking> bookings;
    private ArrayList<Order> orders;

    public Database() {
        this.items = new ArrayList<Item>();
        this.staff = new ArrayList<Staff>();
        this.customers = new ArrayList<Customer>();
        this.bookings = new ArrayList<Booking>();
        this.orders = new ArrayList<Order>();
    }

    public void addCust() {
        customers.add(Customer.createCustomer());
    }

    public void viewAllCustomers() {
        for (Customer cust : customers) {
            System.out.println(cust.getfName() + " " + cust.getlName());
        }
    }

    public void deleteCust(String fName) {

        if (customers.size() == 0) {
            System.out.println("empty");
            return;
        }

        for (Customer cust : customers) {
            if (cust.getfName().equals(fName)) {
                customers.remove(cust);
                break;
            }


        }


    }

    public boolean validPassword(String name, String password) {

        for (Customer cust : customers) {
            if (cust.getfName().equals(name) && cust.getPassword().equals(password)) {
                return true;
            }

        }
        return false;
    }

    public Customer getCustomer(String name, String password) {

        Customer customer = null;

        for (Customer cust : customers) {
            if (cust.getfName().equals(name) && cust.getPassword().equals(password)) {
                 customer = cust;
            }

        }
    return customer;
    }

}
