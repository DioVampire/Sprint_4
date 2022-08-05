package ru.yandex.praktikum.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArendaPage {
    private WebDriver driver;
    private By calendarField = By.cssSelector(".react-datepicker__input-container");
    private By arendaPeriodField = By.cssSelector(".Dropdown-placeholder");
    private By commentaryField = By.cssSelector(".Input_InputContainer__3NykH > .Input_Responsible__1jDKN");
    private By finalOrderButton = By.cssSelector(".Button_Middle__1CSJM:nth-child(2)");
    private By confirmOrderButton = By.cssSelector(".Order_Buttons__1xGrp:nth-child(2) > .Button_Button__ra12g:nth-child(2)");
    private By successMessage = By.cssSelector(".Order_ModalHeader__3FDaJ");

    public ArendaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCalendarField(String day) {
        driver.findElement(calendarField).click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".react-datepicker-ignore-onclickoutside")));
        String cssSelector = String.format(".react-datepicker__day--%s", day);
        driver.findElement(By.cssSelector(cssSelector)).click();
    }

    public void setArendaPeriodField(String period) {
        driver.findElement(arendaPeriodField).click();
        String xpath2 = String.format(".//div[@class='Dropdown-menu']/div[contains(text(), '%s')]", period);
        driver.findElement(By.xpath(xpath2)).click();
    }

    public void setSamokatColor(String color) {
        String id = String.format("%s", color);
        driver.findElement(By.id(id)).click();
    }

    public void setCommentaryField(String commentary) {
        driver.findElement(commentaryField).sendKeys(commentary);
    }

    public void clickFinalOrderButton() {
        driver.findElement(finalOrderButton).click();
    }

    public void clickConfirmationOrderButton() {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.visibilityOfElementLocated(confirmOrderButton));
        driver.findElement(confirmOrderButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public void arendaPagetFilled(String day, String period, String color, String commentary){
        setCalendarField(day);
        setArendaPeriodField(period);
        setSamokatColor(color);
        setCommentaryField(commentary);
        clickFinalOrderButton();
        clickConfirmationOrderButton();
    }
}
