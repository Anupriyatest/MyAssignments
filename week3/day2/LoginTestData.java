package assignment.week3.day2;

public class LoginTestData extends TestData {

	
	public void enterUsername() {
		System.out.println("Entering Username...");	
	}
	
	public void enterPassword() {
		System.out.println("Entering Password...");	
	}
	public static void main(String[] args) {
        LoginTestData login = new LoginTestData();
        login.enterCredentials();      // inherited
        login.navigateToHomePage();    // inherited
        login.enterUsername();         // subclass
        login.enterPassword();         // subclass
}
}

