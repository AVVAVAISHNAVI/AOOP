
public class Main {

	    public static void main(String[] args) throws CloneNotSupportedException {
	        TimesheetManager manager = new TimesheetManager();

	        Employee emp1 = new Employee(1, "Alice");
	        Employee emp2 = new Employee(2, "Bob");

	        Timesheet timesheet1 = new Timesheet(emp1);
	        timesheet1.addHours(8);
	        timesheet1.addHours(7);

	        Timesheet timesheet2 = new Timesheet(emp2);
	        timesheet2.addHours(5);
	        timesheet2.addHours(6);

	        manager.addTimesheet(timesheet1);
	        manager.addTimesheet(timesheet2);

	        System.out.println("All Timesheets:");
	        manager.displayAllTimesheets();

	        System.out.println("\nSorted Timesheets by Employee Name:");
	        manager.sortTimesheetsByEmployeeName();
	        manager.displayAllTimesheets();

	        // Cloning an employee
	        Employee clonedEmployee = (Employee) emp1.clone();
	        System.out.println("\nCloned Employee: " + clonedEmployee);
	    }
	}
