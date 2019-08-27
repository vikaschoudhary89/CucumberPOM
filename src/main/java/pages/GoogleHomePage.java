package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

import java.io.FileNotFoundException;

public class GoogleHomePage extends BaseClass
{
    @FindBy(xpath = "//input[@name='q']")
    WebElement SearchTextBox;

    @FindBy(xpath = "//div[@class='VlcLAe']/center/input[@value='Google Search']")
    WebElement GoogleSearchButton;


    // initializing page objects

    public GoogleHomePage() throws FileNotFoundException
    {
        PageFactory.initElements(driver,this);
    }

    public void LaunchGooglepage()
    {
        driver.get(prop.getProperty("SearchEngineUrl"));
        Assert.assertEquals(prop.getProperty("SearchEngineTitle"),driver.getTitle());
    }
    public void SearchSecurePay()
    {
        SearchTextBox.clear();
        SearchTextBox.sendKeys(prop.getProperty("WebsiteToSearch"));
        SearchTextBox.sendKeys(Keys.ENTER);

    }
}
