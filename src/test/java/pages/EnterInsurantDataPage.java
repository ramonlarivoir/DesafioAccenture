package pages;

import java.util.List;

import org.openqa.selenium.By;

public class EnterInsurantDataPage extends PageObjectsGeneral{
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By birthDate = By.id("birthdate");
	private By genderMale = By.xpath("//input[@id='gendermale']/following-sibling::span[@class='ideal-radio']");
	private By genderFemale = By.xpath("//input[@id='genderfemale']/following-sibling::span[@class='ideal-radio']");
	private By streetAddress = By.id("streetaddress");
	private By country = By.id("country");
	private By zipCode = By.id("zipcode");
	private By city = By.id("city");
	private By occupation = By.id("occupation");
	private By speeding = By.xpath("//input[@id='speeding']/following-sibling::span[@class='ideal-check']");
	private By bungeeJumping = By.xpath("//input[@id='bungeejumping']/following-sibling::span[@class='ideal-check']");
	private By cliffDiving = By.xpath("//input[@id='cliffdiving']/following-sibling::span[@class='ideal-check']");
	private By skydiving = By.xpath("//input[@id='skydiving']/following-sibling::span[@class='ideal-check']");
	private By other = By.xpath("//input[@id='other']/following-sibling::span[@class='ideal-check']");
	private By website = By.id("website");
	private By picture = By.className("ideal-file-filename");
	private By prevButton = By.id("preventervehicledata");
	private By nextButton = By.id("nextenterproductdata");
	private By pageIsActive = By.xpath("//li[@class='idealsteps-step-active']/a[text()='Enter Insurant Data']");
	private By pageCounter = By.xpath("//li[@class='idealsteps-step-active']/a[@id='enterinsurantdata']/span[@class='counter zero']");
	
	public void validateZeroFieldsPending() {
		validation.validateElementPresence(pageCounter);
	}
	
	public void validatePageIsSelected() {
		validation.validateElementPresence(pageIsActive);
	}
	
	public void enterFirstName(String value) {
		browser.waitUntilElementToBeClickable(firstName);
		input.typeValue(value, firstName);
	}
	
	public void enterLastName(String value) {
		input.typeValue(value, lastName);
	}
	
	public void enterDateOfBirth(String value) {
		input.typeValue(value, birthDate);
	}
	
	public void selectGender(String value) {
		if(value.equals("Male"))
			radio.selectValue(value, genderMale);
		else
			radio.selectValue(value, genderFemale);
	}
	
	public void enterStreetAddress(String value) {
		input.typeValue(value, streetAddress);
	}
	
	public void selectCountry(String value) {
		select.selectOptionByValue(value, country);
	}
	
	public void enterZipCode(String value) {
		input.typeValue(value, zipCode);
	}
	
	public void enterCity(String value) {
		input.typeValue(value, city);
	}
	
	public void selectOccupation(String value) {
		select.selectOptionByValue(value, occupation);
	}
	
	public void selectHobbies(List<String> items) {
		for (String item : items) {
			switch (item) {
			case "Speeding":
				checkbox.checkValue(item, speeding);
				break;
			case "Bungee Jumping":
				checkbox.checkValue(item, bungeeJumping);
			break;
			case "Cliff Diving":
				checkbox.checkValue(item, cliffDiving);
			break;
			case "Skydiving":
				checkbox.checkValue(item, skydiving);
			break;
			case "Other":
				checkbox.checkValue(item, other);
			break;
			default:
				break;
			}			
		}
	}
	
	public void enterWebsite(String value) {
		input.typeValue(value, website);
	}
	
	public void enterPicture(String value) {
		input.typeValue(value, picture);
	}
	
	public void clickPrevButton() {
		button.clickButton(prevButton);
	}
	
	public void clickNextButton() {
		button.clickButton(nextButton);
	}
}
