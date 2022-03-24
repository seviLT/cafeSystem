//import java.time;

import java.util.Scanner;
public class Booking
{
    private String bookingDay;
    private int bookingTime;
    private int customerID;
    private int numberOfGuest;

    public Booking(String bookingDay, int bookingTime, int customerID, int numberOfGuest) {
        this.bookingDay = bookingDay;
        this.bookingTime = bookingTime;
        this.customerID = customerID;
        this.numberOfGuest = numberOfGuest;
    }

    //setters
    public void setDay (String day)
    {
        bookingDay = day;
    }
    public void setTime(int time)
    {
        bookingTime = time;
    }
    public void setCustomerID(int custID)
    {
        customerID = custID;
    }
    //need to change else statements for now sets to 0
    public void setNumberOfGuests(int numberGuests)
    {
        numberOfGuest = numberGuests;

    }

    //getters
    public String getDay ()
    {
        return bookingDay;
    }
    public int getBookingTime()
    {
        return bookingTime;
    }
    public int getCustomerID()
    {
        return customerID;
    }
    public int getNumberOfGuest()
    {
        return numberOfGuest;
    }


    public String toString()
    {
        return "customerID: " + customerID + "; day: " +
                bookingDay + "; time:" + bookingTime + "; NO. of guests: " + numberOfGuest;
    }
    public Booking createBooking()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("whats your customer ID");
        int customerIDS = in.nextInt();
        //in.next();
        System.out.println("whats the number of guests");
        int noGuests = in.nextInt();
        //in.next();
        System.out.println("what day do you wish to book");
        String bDay = in.nextLine();
       // in.next();
        System.out.println("what time do you wish to book");
        int dTime = in.nextInt();
        Booking newBooking = new Booking(bDay,dTime,customerIDS,noGuests);




        return newBooking;
    }
}
