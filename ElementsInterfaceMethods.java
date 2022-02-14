package googleamazon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ElementsInterfaceMethods {
    public void SeeAllCheckBoxItems(WebDriver driver, String Xpath);
    public WebElement ClickOnTodaysDeals(WebDriver driver);
    public String getTheBox(String XpathOfLoactor, WebDriver driver,String product);
}
