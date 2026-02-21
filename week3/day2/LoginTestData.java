package week3.day2;

class LoginTestData extends TestData {

    public void enterUsername() {
        System.out.println("Entering Username");
    }

    public void enterPassword() {
        System.out.println("Entering Password");
    }
    public static void main(String[] args) {
        TestData td = new TestData();
        td.enterCredentials();
        td.navigateToHomePage();

        LoginTestData login = new LoginTestData();
        login.enterCredentials();       
        login.navigateToHomePage();     
        login.enterUsername();          
        login.enterPassword();          
    }
}
