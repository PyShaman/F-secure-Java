package glue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import page.objects.base.BasePageObjects;
import page.objects.careers.CareersPage;
import page.objects.home.HomePage;
import page.objects.jobs.JobsPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.switchTo;


public class StepDefinitions implements En {
    private BasePageObjects basePageObjects = new BasePageObjects();
    private CareersPage careersPage = new CareersPage();
    private HomePage homePage = new HomePage();
    private JobsPage jobsPage = new JobsPage();

    public StepDefinitions() {}

    @Given("User is on main page")
    public void userIsOnMainPage() {
        basePageObjects.containsTitle("F-Secure | Cyber Security Solutions for your Home and Business");
        // click to accept cookies
        basePageObjects.acceptCookies().click();
    }

    @When("User navigates to Careers page")
    public void userNavigatesToCareersPage() {
        homePage.careersButton("Careers").click();
    }

    @Then("User is on Careers page")
    public void userIsOnCareersPage() {
        basePageObjects.containsTitle("Careers | F-Secure");
    }

    @When("User clicks on See our positions button")
    public void userSelectsJobOpeningsOption() {
        careersPage.careersButton().click();
    }

    @Then("User is navigated to list of all jobs")
    public void userIsNavigatedToListOfAllJobs() {
        basePageObjects.containsTitle("Job openings | F-Secure");
    }

    @When("User selects Poznan from drop down menu")
    public void userSelectsPoznanFromDropDownMenu() {
        jobsPage.poznanSelection().click();
    }

    @Then("Job list is filtered to the one city")
    public void jobListIsFilteredToTheOneCity() {
        jobsPage.poznanCheck().has(attribute("text", "Poznań"));
    }

    @When("User search for Software Engineer in Tests")
    public void userSearchForQualityEngineer() {
        jobsPage.jobTitle("Software Engineer in Tests");
    }

    @And("Clicks on View job")
    public void clicksOnViewJob() {
        jobsPage.viewJobButton().click();
    }

    @Then("new browser tab with Quality Engineer job details opens")
    public void newBrowserTabWithQualityEngineerJobDetailsOpens() {
        // Selenide switches to newly opened tab
        switchTo().window(1);
        jobsPage.jobView(" Software Engineer in Tests ");
    }
}
