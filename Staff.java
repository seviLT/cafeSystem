import java.util.ArrayList;

//Staff
//will be able to manage the process involved in delivering food
public class Staff extends  Person {

    private ArrayList<Integer> hoursToWork;
    private ArrayList<Integer> hoursWorked;
    private String staffType;

    public Staff(String fName, String lName,  String staffType) {
        super(fName, lName);
        this.hoursToWork = new ArrayList<>();
        this.hoursWorked = new ArrayList<>();
        this.staffType = staffType;
    }
}
