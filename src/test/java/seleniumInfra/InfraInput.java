package seleniumInfra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InfraInput extends SeleniumInfraBase {
	public void typeValue(String value, By locator)
    {
        WebElement element = webDriver.findElement(locator);
        element.clear();
        element.sendKeys(value);
    }
}
