package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    @FindBy(xpath = "//form/.//input[@placeholder=\"Укажите страну\"]")
    private WebElement countryWidget;
    @FindBy(xpath = "//div[@class=\"ui-select__tag-field ui-select-tag\"]")
    private SelenideElement baloon;



    public void insertCountry(String country){
        countryWidget.click();
        countryWidget.sendKeys(country);
        countryWidget.sendKeys(Keys.ENTER);
    }

    public void checkBaloonAppears(){

        baloon.should(Condition.appear);
    }
}
