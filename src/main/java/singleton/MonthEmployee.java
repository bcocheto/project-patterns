package singleton;

public class MonthEmployee {

    private MonthEmployee() {
    }

    private static final MonthEmployee instance = new MonthEmployee();
    public static MonthEmployee getInstance() {
        return instance;
    }

    private String month;
    private String employeeName;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}