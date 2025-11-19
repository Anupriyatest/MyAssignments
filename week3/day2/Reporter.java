package assignment.week3.day2;

public class Reporter {
	
	// Version 1 → takes msg and status
    public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        System.out.println("Snapshot: Not Required");
        System.out.println("--------------------------------");
    }

    public void reportStep(String msg, String status, boolean snap) {
    	System.out.println("Message:" +msg);
    	System.out.println("Status: " + status);
        System.out.println("Snapshot: Required");
        System.out.println("--------------------------------");
    }
	public static void main(String[] args) {
		
		//create obj for Report
		Reporter r = new Reporter();
		r.reportStep("login button clicked", "PASS");
		r.reportStep("Page loaded", "PASS",true );
		
		
		

	}

}
