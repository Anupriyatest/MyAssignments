package assignment.week3.day2;

public class APIClient {

	// Version 1 → takes only endpoint
	public void sendRequest(String endpoint) {
		
		System.out.println("Sending Request to endpoint:" +endpoint);
}    // Version 2 → takes endpoint, requestBody, and requestStatus
    public void sendRequest(String endpoint, String requestBody,boolean requestStatus) {
		
		System.out.println("Sending Request to endpoint:" +endpoint);
		System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + requestStatus);
        System.out.println("--------------------------------");
    }
    
	public static void main(String[] args) {
		// Create an object of APIClient
        APIClient client = new APIClient();

        // Call version 1 
        client.sendRequest("/displayUsers");

        // Call version 2 
        client.sendRequest("/createUser", "{name: 'anu'}", true);

	}

}
