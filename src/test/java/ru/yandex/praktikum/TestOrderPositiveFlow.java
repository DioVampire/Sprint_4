package ru.yandex.praktikum;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.praktikum.pageObject.ArendaPage;
import ru.yandex.praktikum.pageObject.ForWhomSamokatPage;


@RunWith(Parameterized.class)
public class TestOrderPositiveFlow {
    private WebDriver driver;
    String name;
    String surname;
    String address;
    String stationNumber;
    String phoneNumber;
    String day;
    String period;
    String color;
    String commentary;

    public TestOrderPositiveFlow(String name, String surname, String address, String stationNumber, String phoneNumber, String day, String period, String color, String commentary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.stationNumber = stationNumber;
        this.phoneNumber = phoneNumber;
        this.day = day;
        this.period = period;
        this.color = color;
        this.commentary = commentary;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {"Шарип", "Алексеев", "Москва", "2", "+79289472811", "003", "двое суток", "black", "Тест"},
                {"Антипа", "Михайлович", "Курская", "5", "+79289765456", "006", "пятеро суток", "grey", "Коммент"},
        };
    }

    @Before
    public void setUp() {
        driver = new FirefoxDriver();

    }

    @Test
    public void orderPositiveFlow() {
        String expected = "Заказ оформлен";
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();
        ForWhomSamokatPage objForWhomSamokatPage = new ForWhomSamokatPage(driver);
        objForWhomSamokatPage.forWhomSamokatFilledUp(name, surname, address, stationNumber,phoneNumber);
        ArendaPage objArendaPage = new ArendaPage(driver);
        objArendaPage.arendaPagetFilled(day, period, color, commentary);
        String actual = objArendaPage.getSuccessMessage();
        Assert.assertTrue(actual.contains(expected));
    }

    @Test
    public void orderPositiveFlow2() {
        String expected = "Заказ оформлен";
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().window().maximize();
        ForWhomSamokatPage objForWhomSamokatPage = new ForWhomSamokatPage(driver);
        objForWhomSamokatPage.forWhomSamokatFilledLow(name, surname, address, stationNumber,phoneNumber);
        ArendaPage objArendaPage = new ArendaPage(driver);
        objArendaPage.arendaPagetFilled(day, period, color, commentary);
        String actual = objArendaPage.getSuccessMessage();
        Assert.assertTrue(actual.contains(expected));
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }

}
