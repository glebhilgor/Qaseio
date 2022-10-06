package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ProjectTest extends BaseTest {

    @Test
    public void createProject() {
        loginPage.openPage();
        loginPage.login(user, password);
        projectPage.isOpened();
        createProjectPage.createNewProject("test", "testcode", "description");
        projectPage.isProjectExist(title());

    }

    @Test
    public void deleteProject() {
        loginPage.openPage();
        loginPage.login(user, password);
        createProjectPage.createNewProject("test1", "Test", "descrr");
        deleteProjectPage.deleteProject("test1");
        projectPage.projectNotExist("test1");
    }

}