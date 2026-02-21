package week3.day2;

public class Edge extends Browser{
	
    public void takeSnap() {
        System.out.println("Edge took a snapshot.");
    }

    public void clearCookies() {
        System.out.println("Edge cookies cleared.");
    }
    public static void main(String[] args) {
    	Edge e=new Edge();
        e.takeSnap();
        e.clearCookies();
	    e.navigateBack();
	    e.closeBrowser();
	}

}
