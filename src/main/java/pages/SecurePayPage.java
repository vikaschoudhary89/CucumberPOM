package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class SecurePayPage extends BaseClass
{
    @FindBy(xpath = "//div[@class='r']/a[@href='https://www.securepay.com.au/']")
    WebElement SecurePageLink;

    @FindBy(xpath ="//ul[@id='menu-support']/..//a[contains(text(),'Contact Us')]")
    WebElement ContactUsLink;

    public SecurePayPage() throws FileNotFoundException
    {
        PageFactory.initElements(driver,this);
    }

    public void LaunchSecurePage()
    {
        SecurePageLink.click();
        Assert.assertEquals(prop.getProperty("WebsiteTitle"),driver.getTitle());
    }

    public void LaunchContactUsPage()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ContactUsLink.click();

    }
}
