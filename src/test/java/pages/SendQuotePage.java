package pages;

import org.openqa.selenium.By;

public class SendQuotePage extends PageObjectsGeneral{
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By confirmPassword = By.id("confirmpassword");
	private By comments = By.id("Comments");
	private By prevButton = By.id("prevselectpriceoption");
	private By sendButton = By.id("sendemail");
	private By loadingPDF = By.id("LoadingPDF");
	private By successMessage = By.xpath("//div[@class='sweet-alert showSweetAlert visible']/div[@class='sa-icon sa-success animate']/following-sibling::h2");
	private By pageIsActive = By.xpath("//li[@class='idealsteps-step-active']/a[text()='Send Quote']");
	private By pageCounter = By.xpath("//li[@class='idealsteps-step-active']/a[@id='sendquote']/span[@class='counter zero']");
	
	public void validateZeroFieldsPending() {
		validation.validateElementPresence(pageCounter);
	}

	public void validatePageIsSelected() {
		validation.validateElementPresence(pageIsActive);
	}
	
	public void enterEmail(String value) {
		browser.waitUntilElementToBeClickable(email);
		input.typeValue(value, email);
	}
	
	public void enterPhone(String value) {
		input.typeValue(value, phone);
	}
	
	public void enterUsername(String value) {
		input.typeValue(value, username);
	}
	
	public void enterPassword(String value) {
		input.typeValue(value, password);
	}
	
	public void selectConfirmPassword(String value) {
		input.typeValue(value, confirmPassword);
	}
	
	public void enterComments(String value) {
		textArea.typeValue(value, comments);
	}

	public void clickPrevButton() {
		button.clickButton(prevButton);
	}

	public void clickSendButton() {
		button.clickButton(sendButton);
	}
	
	public void waitForLoadMessage() {
		browser.waitUntilElementVisibility(loadingPDF);		
	}
	
	public boolean validateEmailSended() {
		browser.waitUntilElementInvisibility(loadingPDF);
		browser.waitUntilElementVisibility(successMessage);
		return validation.validateSuccessMessage("Sending e-mail success!", successMessage);
	}
}
