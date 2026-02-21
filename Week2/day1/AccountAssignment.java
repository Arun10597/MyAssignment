package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountAssignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        System.out.println("Title: " + driver.getTitle());

        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();

        driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
        driver.findElement(By.name("description"))
              .sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("numberEmployees")).sendKeys("50");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

        driver.findElement(By.className("smallSubmit")).click();

        driver.quit();
    }

}
