package week3.day2;

class CheckBoxButton extends Button {

    public void clickCheckButton() {
        System.out.println("Checkbox button clicked");
    }
    public static void main(String[] args) {
    	CheckBoxButton cb = new CheckBoxButton();
        cb.click();
        cb.submit();
        cb.clickCheckButton();
	}
}
