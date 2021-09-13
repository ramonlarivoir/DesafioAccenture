package seleniumInfra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InfraRadio extends SeleniumInfraBase {
	public void selectValue(String value, By locator)
    {
        WebElement element = webDriver.findElement(locator);
        element.click();
    }
}
