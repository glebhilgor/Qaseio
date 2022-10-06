package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static java.nio.channels.Selector.open;

public class CreateProjectPage {

    private final By TITLE = By.cssSelector("#inputTitle");
    private final By CREATE_PROJECT = By.cssSelector("#createButton");
    private final By DESCRIPTION_INPUT = By.cssSelector("#inputDescription");
    private final By CREATE_BUTTON = By.cssSelector("#createButton");
    private final By CODE_INPUT = By.cssSelector("#inputCode");
    private final By PUBLIC_BUTTON = By.cssSelector("#public-access-type");


    public void createNewProject(String title, String code, String description) {
        $(CREATE_PROJECT).click();
        $(TITLE).setValue(title);
        $(CODE_INPUT).setValue(code);
        $(DESCRIPTION_INPUT).setValue(description);
        $(PUBLIC_BUTTON).click();
        $(CREATE_BUTTON).click();
    }
}
