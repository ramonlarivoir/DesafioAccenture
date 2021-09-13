package seleniumInfra;

public class InfraBrowser extends SeleniumInfraBase{
	 public void openBrowser(String url)
     {
         getWebDriver().manage().deleteAllCookies();

         getWebDriver().navigate().to(url);
     }

     public void quit()
     {
         getWebDriver().quit();
         webDriver = null;
     }
}
