package pages;

import org.openqa.selenium.By;

public class SelectPriceOptionPage extends PageObjectsGeneral {
	private By selectSilver = By.xpath("//input[@id='selectsilver']/following-sibling::span[@class='ideal-radio']");
	private By selectGold = By.xpath("//input[@id='selectgold']/following-sibling::span[@class='ideal-radio']");
	private By selectPlatinum = By.xpath("//input[@id='selectplatinum']/following-sibling::span[@class='ideal-radio']");
	private By selectUltimate = By.xpath("//input[@id='selectultimate']/following-sibling::span[@class='ideal-radio']");
	private By prevButton = By.id("preventerproductdata");
	private By nextButton = By.id("nextsendquote");
	private By pageIsActive = By.xpath("//li[@class='idealsteps-step-active']/a[text()='Select Price Option']");
	private By pageCounter = By.xpath("//li[@class='idealsteps-step-active']/a[@id='selectpriceoption']/span[@class='counter zero']");
	
	public void validateZeroFieldsPending() {
		validation.validateElementPresence(pageCounter);
	}

	public void validatePageIsSelected() {
		validation.validateElementPresence(pageIsActive);
	}

	public void selectPrice(String item) {
		browser.waitUntilElementToBeClickable(selectSilver);
		switch (item) {
		case "Silver":
			radio.selectValue(item, selectSilver);
			break;
		case "Gold":
			radio.selectValue(item, selectGold);
			break;
		case "Platinum":
			radio.selectValue(item, selectPlatinum);
			break;
		case "Ultimate":
			radio.selectValue(item, selectUltimate);
			break;
		default:
			break;
		}
	}

	public void clickPrevButton() {
		button.clickButton(prevButton);
	}

	public void clickNextButton() {
		button.clickButton(nextButton);
	}
}
