package seleniumInfra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InfraSelect extends SeleniumInfraBase{
	public void selectOptionByValue(String text, By locator)
    {
        WebElement element = webDriver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue(text);
    }
}
