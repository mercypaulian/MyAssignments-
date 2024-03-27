package week3.day1assignment;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint targeted "+endpoint);
	}
    public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	if (requestStatus == true) {
		System.out.println("Status is requested");
		
	}
	else if (requestStatus == false) {
		System.out.println("Status is not requested");
	}

}
    public static void main(String[] args) {
    	APIClient apic = new APIClient();
    	apic.sendRequest("Hello");
    	apic.sendRequest("Hi", "Assignment", false);
		
	
	}
}
