package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleHomePage;
import pages.SPContactUsPage;
import pages.SecurePayPage;
import utils.BaseClass;

import java.io.IOException;

public class NavigateContactUS extends BaseClass
{
    GoogleHomePage googleHomePage;
    SecurePayPage  securePayPage;
    SPContactUsPage spContactUsPage;

    @Given("^Customer launches browser$")
    public  void Customer_launch_Browser() throws IOException {

        BaseClass.initialize();
    }

    @When("^Search for Secure pay on Google home page$")
    public void Google_Home_page()
    {
        googleHomePage= PageFactory.initElements(driver,GoogleHomePage.class);
        googleHomePage.LaunchGooglepage();
        googleHomePage.SearchSecurePay();
    }
    @And("^Navigate to Secure pay$")
    public void LaunchSecurePay()
    {

        securePayPage=PageFactory.initElements(driver,SecurePayPage.class);
        securePayPage.LaunchSecurePage();

    }
    @And("^Navigate to Contact us page$")
    public void ContactUsPage()
    {
        securePayPage.LaunchContactUsPage();
    }
    @Then("^Contact us page is displayed$")
    public void ContactUsValidation()
    {
        spContactUsPage=PageFactory.initElements(driver,SPContactUsPage.class);
        spContactUsPage.ContactUsPageValidation();
    }
    @Then("^Fill the details in Contact us form$")
    public void FillContactUsForms()
    {
        spContactUsPage.FillContactUsPage();
    }

}
