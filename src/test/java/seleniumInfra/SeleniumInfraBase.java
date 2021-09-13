package seleniumInfra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumInfraBase {

	public static WebDriver webDriver;
    public int defaultTimeout;

    public SeleniumInfraBase()
    {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		defaultTimeout = 15;
        if (webDriver == null)
        	webDriver = new ChromeDriver();
    }

    public WebDriver getWebDriver()
    {
        if(webDriver == null)
        	webDriver = new ChromeDriver();
        return webDriver;
    }

    public void waitUntilElementVisibility(By locator)
    {
        WebDriverWait wait = new WebDriverWait(webDriver, defaultTimeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }    
    
    public void waitUntilElementInvisibility(By locator)
    {
    	WebDriverWait wait = new WebDriverWait(webDriver, defaultTimeout);
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }    
    
    public void waitUntilElementToBeClickable(By locator)
    {
    	WebDriverWait wait = new WebDriverWait(webDriver, defaultTimeout);
    	wait.until(ExpectedConditions.elementToBeClickable(locator));
    }    
}
