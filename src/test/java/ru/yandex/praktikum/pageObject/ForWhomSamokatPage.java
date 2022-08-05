package ru.yandex.praktikum.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForWhomSamokatPage {
    private WebDriver driver;
    private By cookiesButton = By.id("rcc-confirm-button");
    private By upperOrderButton = By.cssSelector(".Header_Nav__AGCXC > .Button_Button__ra12g");
    private By lowerOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']");
    private By nameField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(1) > .Input_Responsible__1jDKN");
    private By surnameField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(2) > .Input_Input__1iN_Z");
    private By addressField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(3) > .Input_Input__1iN_Z");
    private By stationField = By.cssSelector(".select-search__input");
    private By phoneField = By.cssSelector(".Input_InputContainer__3NykH:nth-child(5) > .Input_Input__1iN_Z");
    private By nextButton = By.cssSelector(".Button_Middle__1CSJM");

    public ForWhomSamokatPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookiesButton() {
        driver.findElement(cookiesButton).click();
    }

    public void clickUpperOrderButton() {
        driver.findElement(upperOrderButton).click();
    }

    public void clickLowerOrderButton() {
        WebElement element = driver.findElement(lowerOrderButton);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(lowerOrderButton));
        element.click();
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setStationField(String stationNumber) {
        driver.findElement(stationField).click();
        String xpath = String.format(".//div[@class='select-search__select']/ul/li[@data-index='%s']/button", stationNumber);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(phoneField).sendKeys(phoneNumber);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void forWhomSamokatFilledUp(String name, String surname, String address, String stationNumber, String phoneNumber){
        clickCookiesButton();
        clickUpperOrderButton();
        setName(name);
        setSurname(surname);
        setAddress(address);
        setStationField(stationNumber);
        setPhoneNumber(phoneNumber);
        clickNextButton();
    }

    public void forWhomSamokatFilledLow(String name, String surname, String address, String stationNumber, String phoneNumber){
        clickCookiesButton();
        clickLowerOrderButton();
        setName(name);
        setSurname(surname);
        setAddress(address);
        setStationField(stationNumber);
        setPhoneNumber(phoneNumber);
        clickNextButton();
    }

}
