package pages;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CreateProjectPage {
    public void createProject() {
        $("#createButton").click();
        $("#inputTitle").sendKeys("Test");
        $("#inputCode").sendKeys("TEST");
        $("#inputDescription").sendKeys("test description");
        $("#public-access-type").click();
        $("[class=\"btn btn-primary\"]").click();
    }
}
