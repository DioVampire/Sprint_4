package ru.yandex.praktikum.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FAQPage {
    private WebDriver driver;
    private By cookiesButton = By.id("rcc-confirm-button");
    private By firstQuestion = By.id("accordion__heading-0");
    private By firstAnswer = By.cssSelector("#accordion__panel-0 > p");
    private By secondQuestion = By.id("accordion__heading-1");
    private By secondAnswer = By.cssSelector("#accordion__panel-1 > p");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By thirdAnswer = By.cssSelector("#accordion__panel-2 > p");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fourthAnswer = By.cssSelector("#accordion__panel-3 > p");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By fifthAnswer = By.cssSelector("#accordion__panel-4 > p");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By sixthAnswer = By.cssSelector("#accordion__panel-5 > p");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By seventhAnswer = By.cssSelector("#accordion__panel-6 > p");
    private By eighthQuestion = By.id("accordion__heading-7");
    private By eighthAnswer = By.cssSelector("#accordion__panel-7 > p");

    public FAQPage(WebDriver driver){

        this.driver = driver;
    }

    public void clickCookiesButton() {

        driver.findElement(cookiesButton).click();
    }

    public void scrollAndClickFirstQuestion() {

        WebElement element = driver.findElement(firstQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(firstQuestion));
    }
    public String getFirstAnswer() {
        return driver.findElement(firstAnswer).getText();
    }

    public void scrollAndClickSecondQuestion() {

        WebElement element = driver.findElement(secondQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(secondQuestion));
    }

    public String getSecondAnswer() {
        return driver.findElement(secondAnswer).getText();
    }

    public void scrollAndClickThirdQuestion() {

        WebElement element = driver.findElement(thirdQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(thirdQuestion));
    }

    public String getThirdAnswer() {
        return driver.findElement(thirdAnswer).getText();
    }

    public void scrollAndClickFourthQuestion() {

        WebElement element = driver.findElement(fourthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(fourthQuestion));
    }

    public String getFourthAnswer() {
        return driver.findElement(fourthAnswer).getText();
    }

    public void scrollAndClickFifthQuestion() {

        WebElement element = driver.findElement(fifthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(fifthQuestion));
    }

    public String getFifthAnswer() {
        return driver.findElement(fifthAnswer).getText();
    }

    public void scrollAndClickSixthQuestion() {

        WebElement element = driver.findElement(sixthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(sixthQuestion));
    }

    public String getSixthAnswer() {
        return driver.findElement(sixthAnswer).getText();
    }

    public void scrollAndClickSeventhQuestion() {

        WebElement element = driver.findElement(seventhQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(seventhQuestion));
    }

    public String getSeventhAnswer() {
        return driver.findElement(seventhAnswer).getText();
    }

    public void scrollAndClickEighthQuestion() {

        WebElement element = driver.findElement(eighthQuestion);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(eighthQuestion));
    }

    public String getEighthAnswer() {
        return driver.findElement(eighthAnswer).getText();
    }

}