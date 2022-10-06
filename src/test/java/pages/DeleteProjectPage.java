package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class DeleteProjectPage {

    private final By PROJECT_BUTTON = By.cssSelector("[class=\"btn btn-dropdown\"]");
    private final By DELETE_BUTTON = By.xpath("//a[text()='Delete']");
    private final By CONFIRMATION_BUTTON = By.cssSelector("[class=\"btn btn-cancel\"]");

    public void openPage() {
        open("/projects");
    }

    public void deleteProject(String title) {
        open("https://app.qase.io/projects");
        $(byXpath(String.format("//a[text()='%s']", title))).click();
        $(byXpath("//span[text()='Settings']")).click();
        $(byXpath("//*[contains(text(), 'Delete project')]")).click();
        $(byXpath("//*[contains(text(), 'Delete project')]")).click();
    }
}
