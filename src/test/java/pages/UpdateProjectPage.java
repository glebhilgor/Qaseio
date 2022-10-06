package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UpdateProjectPage {

    private final By ADDFILTER_BUTTON = By.cssSelector("[class=\"add-filter-button\"]");
    private final By TITLE_BUTTON = By.cssSelector("#title");
    private final By CREATESUITE_BUTTON = By.cssSelector("#create-suite-button");
    private final By SUITE_NAME = By.cssSelector("#name");
    private final By CONTEST_ENTRY = By.cssSelector("[class=\"ProseMirror toastui-editor-contents\"]");
    private final By SAVE_BUTTON = By.cssSelector("#save-suite-button");

    public void editProject(String name, String entry) {
        $(ADDFILTER_BUTTON).click();
        $(CREATESUITE_BUTTON).click();
        $(SUITE_NAME).sendKeys(name);
        $(CONTEST_ENTRY).sendKeys(entry);
        $(SAVE_BUTTON).click();

    }
}
