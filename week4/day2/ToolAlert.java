package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class ToolAlert {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Arunkumar");
        alert.accept();

        String text = driver.findElement(By.id("confirm_result")).getText();

        System.out.println(text);
    }
}