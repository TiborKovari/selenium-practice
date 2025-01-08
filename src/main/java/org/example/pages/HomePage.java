package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    @FindBy(xpath = "//nav[@id='menu']//h2[contains(text(), 'Menu')]")
    private WebElement menu;

    @FindBy(xpath = "//div[@id='sidebar']/a[@href='#sidebar']")
    private WebElement hamburgerButton;

    @FindBy(xpath = "//nav[@id='menu']/ul//a[@href='buttons.html']")
    private WebElement buttonsButton;

    @FindBy(xpath = "//nav[@id='menu']/ul//a[@href='calculator.html']")
    private WebElement calculatorButton;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

//    public void clickButtonMenu() {
//        wait.until(ExpectedConditions.elementToBeClickable(buttonsButton)).click();
//    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public WebElement getButtonsButton(){
        return buttonsButton;
    }

    public WebElement getCalculatorButton(){
        return calculatorButton;
    }

}
