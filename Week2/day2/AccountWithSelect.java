package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountWithSelect {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Accounts")).click();
        driver.findElement(By.linkText("Create Account")).click();

        driver.findElement(By.id("accountName")).sendKeys("TestLeafAccount");
        driver.findElement(By.name("description"))
              .sendKeys("Selenium Automation Tester");

        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select ind = new Select(industry);
        ind.selectByVisibleText("Computer Software");

        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select own = new Select(ownership);
        own.selectByVisibleText("S-Corporation");

        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select src = new Select(source);
        src.selectByValue("LEAD_EMPLOYEE");

        WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
        Select mark = new Select(marketing);
        mark.selectByIndex(6);

        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select st = new Select(state);
        st.selectByValue("TX");

        driver.findElement(By.className("smallSubmit")).click();

        String accountName = driver.findElement(By.id("viewAccount_accountName_sp")).getText();
        System.out.println("Created Account Name: " + accountName);

        driver.quit();
    }

}
