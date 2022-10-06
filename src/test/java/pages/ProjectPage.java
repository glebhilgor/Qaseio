package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectPage {

    private final By CREATESUITE_BUTTON = By.cssSelector("#create-suite-button");

    public void isOpened() {

        $(CREATESUITE_BUTTON).shouldBe(Condition.visible);
    }

    public void isProjectExist(String title) {
        open("https://app.qase.io/projects");
        $(byXpath(String.format("//tbody//a[contains(text(), '%s')]", title))).shouldBe(Condition.visible);
    }

    public void projectNotExist(String title) {
        $(byXpath(String.format("//a[text()='%s']", title))).shouldNotBe(Condition.visible);
    }

}
