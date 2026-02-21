package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lead {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        System.out.println("Title: " + driver.getTitle());

        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();

        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arunkumar");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Tester");

        driver.findElement(By.name("submitButton")).click();

        driver.quit();
    }

}
