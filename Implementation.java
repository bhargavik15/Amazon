package googleamazon.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Implementation implements ElementsInterfaceMethods{
    @Override
    public void SeeAllCheckBoxItems(WebDriver driver, String Xpath)
    {
        List<WebElement> itemsList = driver.findElements(By.xpath(Xpath));
        int Size = itemsList.size();
        for (int i = 0; i<Size; i++)
        {
            System.out.println(itemsList.get(i).getText());
        }
    }

    @Override
    public WebElement ClickOnTodaysDeals(WebDriver driver )
    {
        ////a/span[contains(.,"Coupons")]
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        char ch = '"';
        String part1 ="//a[text()="+ch;
        String box = "Today's Deals";
        String part2 = ch+"]";
        String full = part1+box+part2;
        return  driver.findElement(By.xpath(full));

    }

    @Override
    public String getTheBox( String XpathOfLoactor, WebDriver driver,String product)
    {
        String text = " present";
        if(driver.findElements(By.xpath(XpathOfLoactor)).size()>0)
        {
            text = product+" is "+text;
        }
        else {
            text = product+" is not "+text;
        }
        return text;
    }


}





