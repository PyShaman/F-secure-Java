package page.objects.home;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

        /**
         * Function searches for Careers button on the Home Page from Information section at the bottom of website
         * @param buttonName
         * @return SelenideElement
         */
        public SelenideElement careersButton(final String buttonName) {
                ElementsCollection buttonsSection = $$(By
                        .xpath("//A[@href='/en/web/about_global/careers'][text()='Careers']"))
                        .shouldHave(exactTexts("Careers"));
                return buttonsSection.findBy(attribute("text", buttonName));
        }
}
