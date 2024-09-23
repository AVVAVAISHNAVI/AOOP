import java.util.ArrayList;
import java.util.List;

	public class Timesheet {
	    private Employee employee;
	    private List<Integer> hoursWorked; // List of hours for each day

	    public Timesheet(Employee employee) {
	        this.employee = employee;
	        this.hoursWorked = new ArrayList<>();
	    }

	    public void addHours(int hours) {
	        hoursWorked.add(hours);
	    }

	    public List<Integer> getHoursWorked() {
	        return hoursWorked;
	    }

	    public Employee getEmployee() {
	        return employee;
	    }

	    @Override
	    public String toString() {
	        return "Timesheet{" +
	                "employee=" + employee +
	                ", hoursWorked=" + hoursWorked +
	                '}';
	    }
	}


