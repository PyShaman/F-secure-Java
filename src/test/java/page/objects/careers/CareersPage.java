package page.objects.careers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CareersPage {

    /**
     * Function finds "See our open positions" button
     * @return SelenideElement
     */
    public SelenideElement careersButton() {
        return $(".btn.btn-secondary");
    }

}
