//controller, makes possible the interaction between view and model
public class Main {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //The user profile data, menu data, and all other system data
        // //is persisted across running of the system

        //program start, load database  from text files

        //start GUI   Javafx stage start

        Database db =  new Database();

        //When opening the system the user should be presented with a choice of existing profiles

        //user log in  option

        //log in as admin or customer
        //different views based on which staff, customer different view
        System.out.println("Log in(admin/customer) or Register(customer only)"); //only 1 admin/manager

        db.addCust();

        db.viewAllCustomers();

        db.deleteCust("dd");

        db.viewAllCustomers();
        db.deleteCust("dd");


        //db.allCustomers();



       /* //to display after customer logs in
        System.out.println("Eat in, Delivery or take away?");

        System.out.println("If eat in, make a booking, if there are avaible seats/tables");
        System.out.println("If customer has already made a booking, show option to cancel it");
        //waiter view, booking with id has made
        System.out.println("control of the system switches to waiter, approve booking or not");

        System.out.println("notify customer ");

        System.out.println("back to log in menu or switch to admin view");


        //no staff requirements, no need to confirm availability, no events

        //a screen should be available with a list of non completed orders.
        //chef can specify the daily special



        //quit program, save database to text files first*/

    }

}
