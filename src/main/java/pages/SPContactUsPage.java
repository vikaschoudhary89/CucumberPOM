package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SPContactUsPage extends BaseClass
{
    Random random;
    @FindBy(xpath = "//input[@type='submit' and @value='Submit']")
    List<WebElement> ContactUsSubmitButton;

    @FindBy(xpath="//input[@name='first-name']")
    WebElement Firstname;

    @FindBy(xpath="//input[@name='last-name']")
    WebElement Lastname;

    @FindBy(xpath="//input[@name='email-address']")
    WebElement EmailAddress;

    @FindBy(xpath="//input[@name='phone-number']")
    WebElement PhoneNumber;

    @FindBy(xpath="//input[@name='website-url']")
    WebElement WebsiteURL;

    @FindBy(xpath="//input[@name='business-name']")
    WebElement Company;

    @FindBy(xpath="//select[@name='reason-for-enquiry']")
    WebElement EnquiryDropdown;

    public SPContactUsPage() throws FileNotFoundException
    {
        PageFactory.initElements(driver,this);
    }

    public  void ContactUsPageValidation()
    {
        // to validate if continue button is not there, Contact us page is not displayed
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if((ContactUsSubmitButton.size()>0)){
            System.out.println("Contact us page displayed successfully");
        }
    }
    public void FillContactUsPage()
    {
        random=new Random();

        Firstname.sendKeys(GenerateRandomString(8));
        Lastname.sendKeys(GenerateRandomString(8));
        String email=GenerateRandomString(10)+"@mailinator.com";
        EmailAddress.sendKeys(email);

        // setting 10 digit random value for phone numner
        PhoneNumber.sendKeys("04"+Integer.toString(random.nextInt(99999999)));

        WebsiteURL.sendKeys(driver.getCurrentUrl());
        Company.sendKeys(GenerateRandomString(9));


        // selecting the random index between 1 and 2
        Select dropdown=new Select(EnquiryDropdown);
        dropdown.selectByIndex(random.nextInt((2))+1);
    }

    public String GenerateRandomString( int targetStringLength) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        System.out.println(generatedString);
        return  generatedString;
    }

}
