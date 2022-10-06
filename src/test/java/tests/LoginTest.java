package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginQase() {
        loginPage.openPage();
        loginPage.login(user, password);
        projectPage.isOpened();
    }
}
