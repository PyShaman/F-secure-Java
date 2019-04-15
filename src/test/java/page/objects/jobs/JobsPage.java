package page.objects.jobs;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JobsPage {

    /**
     * Function finds Poznań from dropdown menu
     * @return SelenideElement
     */
    public SelenideElement poznanSelection() {
        return $(By.xpath("//*[@id=\"job-city\"]/option[4]"));
    }

    /**
     * Function returns element element that is displayed at dropdown menu
     * @return SelenideElement
     */
    public SelenideElement poznanCheck() {
        return $(By.xpath("//SELECT[@id='job-city']"));
    }

    /**
     * Function checks if job has proper title
     * @param title
     * @return boolean
     */
    public boolean jobTitle(String title) {
        return $$(".h5").findBy(attribute("text", title)).exists();
    }

    /**
     * Function returns View Job button element
     * @return SelenideElement
     */
    public SelenideElement viewJobButton() {
        return $(By.xpath("(//A[@data-track-name='Jobylon - Software Engineer in Tests'])"));
    }

    /**
     * Function checks if job title is proper
     * @param title
     * @return boolean
     */
    public boolean jobView(String title) {
        return $("job-title").has(attribute("text", title));
    }
}
