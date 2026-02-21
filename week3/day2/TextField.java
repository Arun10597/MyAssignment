package week3.day2;

class TextField extends WebElement {

    public void getText() {
        System.out.println("Getting text from TextField");
    }
    public static void main(String[] args) {
    	TextField txt = new TextField();
        txt.click();
        txt.setText("Username");
        txt.getText();
	}
}
