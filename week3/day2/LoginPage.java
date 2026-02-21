package week3.day2;

class LoginPage extends BasePage {

    @Override
    public void performCommonTasks() {
        System.out.println("Performing login specific tasks");
    }
    public static void main(String[] args) {

        BasePage base = new BasePage();
        base.performCommonTasks();

        LoginPage login = new LoginPage();
        login.performCommonTasks();
    }
}
