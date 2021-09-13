package seleniumInfra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InfraButton extends SeleniumInfraBase{
	public void clickButton(By locator)
    {
        WebElement element = webDriver.findElement(locator);
        element.click();
    }
}
