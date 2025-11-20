package assignment.week3.day3;

public class JavaMySqlConnection extends MySqlConnection {

	@Override
	public void connect() {
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
		JavaMySqlConnection db1 = new JavaMySqlConnection();
		db1.connect();
		db1.disconnect();
		db1.executeQuery();
		db1.executeUpdate();
	}
}
