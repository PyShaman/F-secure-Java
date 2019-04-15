package page.objects.base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class BasePageObjects {

    private SelenideElement title = $("title");

    public SelenideElement containsTitle(String title) {
        return $("title").shouldHave(attribute("text", title));
    }
}
