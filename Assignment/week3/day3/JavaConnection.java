package assignment.week3.day3;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Java Database...");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from Java Database...");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executing update on Java Database...");
		
	}
	
	public static void main(String[] args) {
        JavaConnection db = new JavaConnection();
        db.connect();
        db.disconnect();
        db.executeUpdate();
        
	}        

}

