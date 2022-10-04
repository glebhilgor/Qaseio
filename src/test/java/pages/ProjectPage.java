package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectPage {
    public void isOpened() {
        $("#createButton").shouldBe(Condition.visible);
    }

    public void createProject(String projectName, String projectCode, String description) {
        $("#createButton").click();
        $("#inputTitle").setValue(projectName);
        $("#inputCode").setValue(projectCode);
        $("#inputDescription").setValue(description);
        $(byXpath("//label[contains(text(), 'Public')]")).click();
        $(".btn.btn-primary").click();
    }
}
