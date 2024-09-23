
	import java.util.*;

	public class TimesheetManager {
	    private List<Timesheet> timesheets;

	    public TimesheetManager() {
	        timesheets = new ArrayList<>();
	    }

	    public void addTimesheet(Timesheet timesheet) {
	        timesheets.add(timesheet);
	    }

	    public void displayAllTimesheets() {
	        for (Timesheet timesheet : timesheets) {
	            System.out.println(timesheet);
	        }
	    }

	    public void sortTimesheetsByEmployeeName() {
	        Collections.sort(timesheets, Comparator.comparing(t -> t.getEmployee().getName()));
	    }

		public static Iterator<Timesheet> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	