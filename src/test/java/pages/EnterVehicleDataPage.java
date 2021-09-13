package pages;

import org.openqa.selenium.By;

public class EnterVehicleDataPage extends PageObjectsGeneral{
	private By make = By.id("make");
	private By model = By.id("model");
	private By cylinderCapacity = By.id("cylindercapacity");
	private By enginePerformance = By.id("engineperformance");
	private By dateManufacture = By.id("dateofmanufacture");
	private By numberSeats = By.id("numberofseats");
	private By rightHandDriveYes = By.xpath("//input[@id='righthanddriveyes']/following-sibling::span[@class='ideal-radio']");
	private By rightHandDriveNo = By.xpath("//input[@id='righthanddriveno']/following-sibling::span[@class='ideal-radio']");
	private By numberOfSeatsMotorcycle = By.id("numberofseatsmotorcycle");
	private By fuelType = By.id("fuel");
	private By payload = By.id("payload");
	private By totalWeight = By.id("totalweight");
	private By listPrice = By.id("listprice");
	private By licensePlateNumber = By.id("licenseplatenumber");
	private By annualMileage = By.id("annualmileage");
	private By nextButton = By.id("nextenterinsurantdata");
	private By pageIsActive = By.xpath("//li[@class='idealsteps-step-active']/a[text()='Enter Vehicle Data']");
	private By pageCounter = By.xpath("//li[@class='idealsteps-step-active']/a[@id='entervehicledata']/span[@class='counter zero']");
	
	public void validateZeroFieldsPending() {
		validation.validateElementPresence(pageCounter);
	}

	public void validatePageIsSelected() {
		validation.validateElementPresence(pageIsActive);
	}
	
	public void selectMake(String value) {
		browser.waitUntilElementToBeClickable(make);
		select.selectOptionByValue(value, make);
	}
	
	public void selectModel(String value) {
		select.selectOptionByValue(value, model);
	}
	
	public void enterCylinderCapacity(String value) {
		input.typeValue(value, cylinderCapacity);
	}
	
	public void enterEnginePerformance(String value) {
		input.typeValue(value, enginePerformance);
	}
	
	public void enterDateManufacture(String value) {
		input.typeValue(value, dateManufacture);
	}
	
	public void selectNumberOfSeats(String value) {
		select.selectOptionByValue(value, numberSeats);
	}
	
	public void selectRighHandDrive(String value) {
		if(value.equals("Yes"))
			radio.selectValue(value, rightHandDriveYes);
		else
			radio.selectValue(value, rightHandDriveNo);
	}
	
	public void selectnumberOfSeatsMotorcycle(String value) {
		select.selectOptionByValue(value, numberOfSeatsMotorcycle);
	}
	
	public void selectFuelType(String value) {
		select.selectOptionByValue(value, fuelType);
	}
	
	public void enterPayload(String value) {
		input.typeValue(value, payload);
	}
	
	public void enterTotalWeight(String value) {
		input.typeValue(value, totalWeight);
	}
	
	public void enterListPrice(String value) {
		input.typeValue(value, listPrice);
	}
	
	public void enterLicensePlateNumber(String value) {
		input.typeValue(value, licensePlateNumber);
	}
	
	public void enterAnnualMileage(String value) {
		input.typeValue(value, annualMileage);
	}
	
	public void clickNextButton() {
		button.clickButton(nextButton);
	}
}
