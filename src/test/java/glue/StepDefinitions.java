package glue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import page.objects.base.BasePageObjects;
import page.objects.careers.CareersPage;
import page.objects.home.HomePage;

import static com.codeborne.selenide.Selenide.*;


public class StepDefinitions implements En {
    private BasePageObjects basePageObjects;
    private CareersPage careersPage;
    private HomePage homePage;

    public StepDefinitions(BasePageObjects basePageObjects, CareersPage careersPage, HomePage homePage) {
        this.basePageObjects = basePageObjects;
        this.careersPage = careersPage;
        this.homePage = homePage;
    }

    public StepDefinitions() {

    }

    @Given("User is on main page")
    public void userIsOnMainPage() {
        open("https://www.f-secure.com/en/welcome");
        basePageObjects.containsTitle("F-Secure | Cyber Security Solutions for your Home and Business");
    }

    @When("User navigates to Careers page")
    public void userNavigatesToCareersPage() {
        homePage.careersButton.click();
    }

    @Then("User is on Careers page")
    public void userIsOnCareersPage() {
        basePageObjects.containsTitle("Careers | F-Secure");
    }

    @When("User clicks on See our positions button")
    public void userSelectsJobOpeningsOption() {
        careersPage.checkPositions.click();
    }

    @Then("User is navigated to list of all jobs")
    public void userIsNavigatedToListOfAllJobs() {
        basePageObjects.containsTitle("Job openings | F-Secure");
    }

    @When("User selects Poznan from drop down menu")
    public void userSelectsPoznanFromDropDownMenu() {
        
    }

    @Then("Job list is filtered to the one city")
    public void jobListIsFilteredToTheOneCity() {
        
    }

    @When("User search for Quality Engineer")
    public void userSearchForQualityEngineer() {
        
    }

    @And("Clicks on View job")
    public void clicksOnViewJob() {
        
    }

    @Then("new browser tab with Quality Engineer job details opens")
    public void newBrowserTabWithQualityEngineerJobDetailsOpens() {
    }
}
