package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListInterface {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
        

        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        //create a list
        List<Integer> list=new ArrayList<Integer>();
        for (WebElement each : prices) {
            String text = each.getText();
            String replaceAll = text.replaceAll(",", "");
            if (!replaceAll.isEmpty()) {
                int mobiles = Integer.parseInt(replaceAll);
                list.add(mobiles);
                
            }
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
