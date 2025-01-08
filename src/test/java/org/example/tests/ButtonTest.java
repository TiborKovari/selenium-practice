package org.example.tests;

import org.example.pages.ButtonsPage;
import org.example.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ButtonTest extends BaseTest {

    private ButtonsPage buttonsPage;
    private HomePage homePage;

    @Test
    public void testButtonOne() {
        buttonsPage = new ButtonsPage(driver);
        homePage = new HomePage(driver);

        homePage.clickElement(homePage.getButtonsButton());
        buttonsPage.clickButtonOne();
        String textAlert = buttonsPage.getAlertText();
        String expectedText = "You clicked the first button!";
        Assertions.assertEquals(expectedText, textAlert, "Alert message is diferrent to expected");
        buttonsPage.acceptAlert();
    }

}
