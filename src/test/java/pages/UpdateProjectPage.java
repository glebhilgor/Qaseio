package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class UpdateProjectPage {
    public void updateProject() {
        $("[href=\"/project/QS\"]").click();
        $("#create-case-button").click();
        $("#title").sendKeys("Create new case");
        $("[class=\"UdZcu9\"]").click();
        $("[class=\"DJXdnf N7aVnv\"]").click();
        $("#save-case").click();
        $$("[class=\"nbWgel\"]").get(0).click();
        $("#create-suite-button").click();
        $("#name").sendKeys("WebApplication");
        $("[class=\"ProseMirror toastui-editor-contents\"]").sendKeys("test1488");
        $("#save-suite-button").click();
    }
}
