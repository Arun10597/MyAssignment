package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();

        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"))
                .sendKeys("TestLeaf");

        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"))
                .sendKeys("John");

        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"))
                .sendKeys("David");

        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"))
                .sendKeys("J");

        driver.findElement(By.id("createLeadForm_departmentName"))
                .sendKeys("Testing");

        driver.findElement(By.id("createLeadForm_description"))
                .sendKeys("Selenium Automation Tester");

        driver.findElement(By.id("createLeadForm_primaryEmail"))
                .sendKeys("test@test.com");

        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select st = new Select(state);
        st.selectByVisibleText("New York");

        driver.findElement(By.name("submitButton")).click();

        driver.findElement(By.linkText("Edit")).click();

        WebElement desc = driver.findElement(By.id("updateLeadForm_description"));
        desc.clear();

        driver.findElement(By.id("updateLeadForm_importantNote"))
                .sendKeys("Updated using Selenium");

        driver.findElement(By.name("submitButton")).click();

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }

}
