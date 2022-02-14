package googleamazon.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Run {
   static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
      Implementation imp = new Implementation();

        String content = "Amazon Devices";

        //returning the element and clicking on it to get check boxs
        imp.ClickOnTodaysDeals(driver).click();

        // to see all items present in web page
//        imp.SeeAllCheckBoxItems(driver,"//div[@class='CheckboxFilter-module__gridFilterOption_hdG5xZdR2ZvDkQKkl_d49']");

        // return true if item is present else false
        String msg = imp.getTheBox("//input[@type='checkbox']//following-sibling::span[text()='" + content + "']",
                driver, content);

        System.out.println(msg);
    }
}
