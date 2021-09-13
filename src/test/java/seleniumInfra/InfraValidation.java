package seleniumInfra;

import org.openqa.selenium.By;

public class InfraValidation extends SeleniumInfraBase {
	public boolean validateSuccessMessage(String value, By locator)
    {
		waitUntilElementVisibility(locator);
		String text = webDriver.findElement(locator).getText();
		if (text.equals(value))
			return true;
		else
			return false;
    }
	
	public void validateElementPresence(By locator) {
		waitUntilElementVisibility(locator);
	}
}
