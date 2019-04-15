package page.objects.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class BasePageObjects {

    /**
     * Function checks if browser tab has proper title
     * @param = title
     */
    public boolean containsTitle(final String title) {
        return $("title").has(attribute("text", title));
    }

    /**
     * Function returns accept cookie button
     * @return SelenideElement
     */
    public SelenideElement acceptCookies() {
        return $(By.xpath("//A[@href='#'][text()='Got it']"));
    }
}
