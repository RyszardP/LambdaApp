package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LambdaPageIE {

    private WebDriver driver;

    public LambdaPageIE(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='sampletodotext']")
    private WebElement fieldAddMore;

    @FindBy(xpath = "//*[@id='addButton']")
    private WebElement addButton;

    public LambdaPageIE typeToFieldAddMore(String string) {
        fieldAddMore.sendKeys(string);
        return this;
    }

    public void clickAddButton() {
        addButton.click();
    }
}
