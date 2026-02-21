package week3.day2;

public class Chrome extends Browser {
	
	public void openIncognito() {
        System.out.println("Chrome opened in Incognito mode.");
    }

    public void clearCache() {
        System.out.println("Chrome cache cleared.");
    }
    public static void main(String[] args) {
    	 Chrome c=new Chrome();
    	    c.openURL();
    	    c.openIncognito();
    	    c.clearCache();
    	    c.navigateBack();
    	    c.closeBrowser();
	}
   
}

