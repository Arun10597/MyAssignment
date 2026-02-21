package week3.day2;

class APIClient {

    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + requestStatus);
    }

    public static void main(String[] args) {

        APIClient client = new APIClient();

        client.sendRequest("/getUsers");

        client.sendRequest("/createUser", "Arun", true);
    }
}
