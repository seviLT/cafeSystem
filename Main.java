import java.util.Scanner;

//controller, makes possible the interaction between view and model
public class Main {
    static Scanner scanner =  new Scanner(System.in);




    public static void main(String[] args) {

        //The user profile data, menu data, and all other system data
        // //is persisted across running of the system

        //program start, load database  from text files

        //start GUI   Javafx stage start

        Manager manager = new Manager("ben","cole", "manager","1234");

        Database db =  new Database();

        logIn(db,manager);



        //When opening the system the user should be presented with a choice of existing profiles

        //user log in  option

        //log in as admin or customer
        //different views based on which staff, customer different view

        //System.out.println("Log in(admin/customer) or Register(customer only)"); //only 1 admin/manager

        //db.viewAllCustomers();
        //db.deleteCust("dd");

        //db.viewAllCustomers();
        //db.deleteCust("dd");


    }

    public static void logIn(Database db,Manager manager)
    {


        int choice = -1;

        while (choice != 0)
        {
            System.out.println("1. Log in(admin/customer) or 2.Register(customer only)   0 exit");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    // ask whether you are admin or customer
                    customerOrAdmin(db,manager);
                    break;
                case 2:
                    db.addCust();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }

        }




    }

    public static void customerOrAdmin(Database db,Manager manager)
    {

        int choice = -1;

        while (choice != 0)
        {
            System.out.println("1. admin 2.customer");

            choice = scanner.nextInt();

            switch (choice)
            {
                case 1 :
                    System.out.printf("Enter name ");
                    String nameManager = scanner.next();
                    //scanner.nextLine();
                    System.out.printf("Enter password ");
                    String password = scanner.next();

                    if(manager.getfName().equals(nameManager) && manager.getPassword().equals(password))
                    {
                        System.out.println("Logged in as admin ");
                        //Call admin view
                    }

                    break;
                case 2:
                    System.out.printf("%nEnter name ");
                    String nameCust = scanner.next();
                    //scanner.nextLine();
                    System.out.printf("%nEnter password ");
                    String passwordCust = scanner.next();

                    if(db.validPassword(nameCust,passwordCust))
                    {
                        System.out.println("Logged in as customer " + nameCust);
                        // Customer view
                        Customer cust = db.getCustomer(nameCust,passwordCust);

                        // order to make




                    }
                    else
                    {
                        System.out.println("Enter again");
                    }


                    break;

                default:
                    System.out.println("Error");
                    break;


            }

        }


    }

    public static void OrderType()
    {

    }

}


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
