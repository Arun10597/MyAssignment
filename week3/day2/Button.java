package week3.day2;

class Button extends WebElement {

    public void submit() {
        System.out.println("Button submitted");
    }
    public static void main(String[] args) {
    	Button btn = new Button();
        btn.click();
        btn.setText("Login");
        btn.submit();
	}
}

