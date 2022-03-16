public class Manager extends Staff {

    private String password;

    public Manager(String fName, String lName, String staffType,String password) {
        super(fName, lName, staffType);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}


/*Reports:
• Generate most popular items
• Busiest periods in the restaurant
• Most active customer
• Highest number of hours work by staff members

 */
