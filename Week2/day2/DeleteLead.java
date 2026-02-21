package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();

        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("99");

        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);

        String leadId = driver.findElement(
                By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))
                .getText();

        driver.findElement(
                By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"))
                .click();

        driver.findElement(By.linkText("Delete")).click();

        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys(leadId);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);

        String text = driver.findElement(By.className("x-paging-info")).getText();
        System.out.println(text);

        driver.quit();
    }
}
