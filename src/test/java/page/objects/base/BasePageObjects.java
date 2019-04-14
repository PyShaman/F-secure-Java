package page.objects.base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BasePageObjects {

    private SelenideElement header = $("at-element-marker");

    public BasePageObjects containsTitle(String title) {
        SelenideElement checkTitle = header.$("title").shouldHave(text(title));
        return this;
    }
}
