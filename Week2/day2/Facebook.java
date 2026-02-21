package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Facebook {
	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://en-gb.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();

        driver.findElement(By.name("firstname")).sendKeys("Arunkumar");
        driver.findElement(By.name("lastname")).sendKeys("P");
        driver.findElement(By.name("reg_email__")).sendKeys("7092649633");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");

        WebElement day = driver.findElement(By.id("day"));
        Select d = new Select(day);
        d.selectByVisibleText("05");

        WebElement month = driver.findElement(By.id("month"));
        Select m = new Select(month);
        m.selectByIndex(5);

        WebElement year = driver.findElement(By.id("year"));
        Select y = new Select(year);
        y.selectByValue("1997");

        driver.findElement(By.xpath("//input[@value='2']")).click();

        driver.quit();
    }

}
