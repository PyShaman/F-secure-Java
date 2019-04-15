package glue;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import page.objects.base.BasePageObjects;
import page.objects.careers.CareersPage;
import page.objects.home.HomePage;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;


public class StepDefinitions implements En {
    private BasePageObjects basePageObjects;
    private CareersPage careersPage;
    private HomePage homePage;
    private String mainPageTitle;

//    public StepDefinitions(BasePageObjects basePageObjects, CareersPage careersPage, HomePage homePage) {
//        this.basePageObjects = basePageObjects;
//        this.careersPage = careersPage;
//        this.homePage = homePage;
//    }

    public StepDefinitions() {}

    @Given("User is on main page")
    public void userIsOnMainPage() {
        mainPageTitle = basePageObjects.title();
        Assert.assertTrue(mainPageTitle.equals("F-Secure | Cyber Security Solutions for your Home and Business"));
//                "text",
//                "F-Secure | Cyber Security Solutions for your Home and Business"));
//        "F-Secure | Cyber Security Solutions for your Home and Business");
//        $("title").shouldHave(attribute(
//                "text",
//                "F-Secure | Cyber Security Solutions for your Home and Business"));
        //click to accept cookies
        $(By.xpath("//A[@href='#'][text()='Got it']")).click();
    }

    @When("User navigates to Careers page")
    public void userNavigatesToCareersPage() throws InterruptedException {
        ElementsCollection careersButton =
                $$(By.xpath("//A[@href='/en/web/about_global/careers'][text()='Careers']")).shouldHave(exactTexts("Careers"));
        careersButton.findBy(attribute("text","Careers")).click();
    }

    @Then("User is on Careers page")
    public void userIsOnCareersPage() {
        $("title").shouldHave(attribute(
                "text",
                "Careers | F-Secure"));
//        basePageObjects.containsTitle("Careers | F-Secure");
    }

    @When("User clicks on See our positions button")
    public void userSelectsJobOpeningsOption() {
        $(".btn.btn-secondary").click();
    }

    @Then("User is navigated to list of all jobs")
    public void userIsNavigatedToListOfAllJobs() {
        $("title").shouldHave(attribute(
                "text",
                "Job openings | F-Secure"));
//        basePageObjects.containsTitle("Job openings | F-Secure");
    }

    @When("User selects Poznan from drop down menu")
    public void userSelectsPoznanFromDropDownMenu() {
        $(By.xpath("//*[@id=\"job-city\"]/option[4]")).click();
        
    }

    @Then("Job list is filtered to the one city")
    public void jobListIsFilteredToTheOneCity() {
        $(By.xpath("//SELECT[@id='job-city']")).has(attribute("text", "Poznań"));
    }

    @When("User search for Software Engineer in Tests")
    public void userSearchForQualityEngineer() {
        $(".h5").has(attribute("text", "Software Engineer in Tests"));
    }

    @And("Clicks on View job")
    public void clicksOnViewJob() {
        $(".btn.btn-red").click();
    }

    @Then("new browser tab with Quality Engineer job details opens")
    public void newBrowserTabWithQualityEngineerJobDetailsOpens() {
        switchTo().window(1);
        $("job-title").has(attribute("text", " Software Engineer in Tests "));
    }
}
