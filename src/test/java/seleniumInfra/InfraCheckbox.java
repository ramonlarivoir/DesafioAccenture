package seleniumInfra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InfraCheckbox extends SeleniumInfraBase {
	public void checkValue(String value, By locator)
    {
        WebElement element = webDriver.findElement(locator);
        element.click();
    }
}
