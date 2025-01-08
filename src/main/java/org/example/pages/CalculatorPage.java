package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class CalculatorPage extends BasePage {

    @FindBy(xpath = "//div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='1']")
    private WebElement buttonOne;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='2']")
    private WebElement buttonTwo;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='3']")
    private WebElement buttonThree;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='4']")
    private WebElement buttonFour;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='5']")
    private WebElement buttonFive;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='6']")
    private WebElement buttonSix;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='7']")
    private WebElement buttonSeven;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='8']")
    private WebElement buttonEight;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='9']")
    private WebElement buttonNine;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='0']")
    private WebElement buttonZero;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='+']")
    private WebElement buttonPlus;

    @FindBy(xpath = "div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='=']")
    private WebElement buttonEquals;

    @FindBy(xpath = "//input[@id='result']")
    private WebElement result;

    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getCalculatorButton(String buttonValue) {
        String dynamicXPath = String.format("//div[@id='main']/div[@class='inner']/div[@class='row']//table//input[@value='%s']", buttonValue);
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(dynamicXPath))));
    }

    public String getResult() {
        return wait.until(ExpectedConditions.visibilityOf(result)).getAttribute("value");
    }

    public String addNumbers(String numberA, String operation, String numberB) {
        getCalculatorButton(numberA).click();
        getCalculatorButton(operation).click();
        getCalculatorButton(numberB).click();
        getCalculatorButton("=").click();

        return getResult();
    }
}
