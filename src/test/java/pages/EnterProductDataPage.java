package pages;

import java.util.List;

import org.openqa.selenium.By;

public class EnterProductDataPage extends PageObjectsGeneral{
	private By startDate = By.id("startdate");
	private By insuranceSum = By.id("insurancesum");
	private By meritRating = By.id("meritrating");
	private By damageInsurance = By.id("damageinsurance");
	private By euroProtection = By.xpath("//input[@id='EuroProtection']/following-sibling::span[@class='ideal-check']");
	private By legalDefenseInsurance = By.xpath("//input[@id='LegalDefenseInsurance']/following-sibling::span[@class='ideal-check']");
	private By courtesyCar = By.id("courtesycar");
	private By prevButton = By.id("preventerinsurancedata");
	private By nextButton = By.id("nextselectpriceoption");
	private By pageIsActive = By.xpath("//li[@class='idealsteps-step-active']/a[text()='Enter Product Data']");
	private By pageCounter = By.xpath("//li[@class='idealsteps-step-active']/a[@id='enterproductdata']/span[@class='counter zero']");
	
	public void validateZeroFieldsPending() {
		validation.validateElementPresence(pageCounter);
	}

	public void validatePageIsSelected() {
		validation.validateElementPresence(pageIsActive);
	}
	
	public void enterStartDate(String value) {
		browser.waitUntilElementToBeClickable(startDate);
		input.typeValue(value, startDate);
	}
	
	public void selectInsuranceSum(String value) {
		select.selectOptionByValue(value, insuranceSum);
	}
	
	public void selectMeritRating(String value) {
		select.selectOptionByValue(value, meritRating);
	}
	
	
	public void selectDamageInsurance(String value) {
		select.selectOptionByValue(value, damageInsurance);
	}
	
	public void selectOptionalProducts(List<String> items) {
		for (String item : items) {
			if(item.equals("Euro Protection"))
				checkbox.checkValue(item, euroProtection);
			else
				checkbox.checkValue(item, legalDefenseInsurance);
		}
	}
	
	public void selectCourtesyCar(String value) {
		select.selectOptionByValue(value, courtesyCar);
	}
	
	
	public void clickPrevButton() {
		button.clickButton(prevButton);
	}
	
	public void clickNextButton() {
		button.clickButton(nextButton);
	}
}
