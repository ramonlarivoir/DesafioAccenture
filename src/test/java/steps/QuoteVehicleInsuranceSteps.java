package steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EnterInsurantDataPage;
import pages.EnterProductDataPage;
import pages.EnterVehicleDataPage;
import pages.SelectPriceOptionPage;
import pages.SendQuotePage;
import seleniumInfra.InfraBrowser;

public class QuoteVehicleInsuranceSteps {
	
	public InfraBrowser infraBrowser;
	public EnterVehicleDataPage enterVehicleDataPage;
	public EnterInsurantDataPage enterInsurantDataPage;
	public EnterProductDataPage enterProductDataPage;
	public SelectPriceOptionPage selectPriceOptionPage;
	public SendQuotePage sendQuotePage;
	
	@Before
	public void Initialize() {
		infraBrowser = new InfraBrowser();
		infraBrowser.openBrowser("http://sampleapp.tricentis.com/101/app.php");
		enterVehicleDataPage = new EnterVehicleDataPage();
		enterInsurantDataPage = new EnterInsurantDataPage();
		enterProductDataPage = new EnterProductDataPage();
		selectPriceOptionPage = new SelectPriceOptionPage();
		sendQuotePage = new SendQuotePage();
	}
	
	@After
	public void Quit() {
		infraBrowser.quit();
	}
	
	@Given("I fulfill the fields of the section Enter Vehicle Data")
	public void iFulfillTheFieldsOfTheSectionEnterVehicleData() {
		enterVehicleDataPage.validatePageIsSelected();
		enterVehicleDataPage.selectMake("Audi");
		enterVehicleDataPage.selectModel("Scooter");
		enterVehicleDataPage.enterCylinderCapacity("123");
		enterVehicleDataPage.enterEnginePerformance("123");
		enterVehicleDataPage.enterDateManufacture("09/12/2021");
		enterVehicleDataPage.selectNumberOfSeats("5");
		enterVehicleDataPage.selectRighHandDrive("Yes");
		enterVehicleDataPage.selectnumberOfSeatsMotorcycle("1");
		enterVehicleDataPage.selectFuelType("Petrol");
		enterVehicleDataPage.enterPayload("321");
		enterVehicleDataPage.enterTotalWeight("1000");
		enterVehicleDataPage.enterListPrice("12345");
		enterVehicleDataPage.enterLicensePlateNumber("123");
		enterVehicleDataPage.enterAnnualMileage("1235");
		enterVehicleDataPage.validateZeroFieldsPending();
		enterVehicleDataPage.clickNextButton();
	}

	@Given("fulfill the fields of the section Enter Insurant Data")
	public void fulfillTheFieldsOfTheSectionEnterInsurantData() {
		enterInsurantDataPage.validatePageIsSelected();
		enterInsurantDataPage.enterFirstName("Test");
		enterInsurantDataPage.enterLastName("Test");
		enterInsurantDataPage.enterDateOfBirth("01/01/2000");
		enterInsurantDataPage.selectGender("Male");
		enterInsurantDataPage.enterStreetAddress("Test");
		enterInsurantDataPage.selectCountry("Brazil");
		enterInsurantDataPage.enterZipCode("123123");
		enterInsurantDataPage.enterCity("Test");
		enterInsurantDataPage.selectOccupation("Employee");
		
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Bungee Jumping");
		hobbies.add("Skydiving");		
		
		enterInsurantDataPage.selectHobbies(hobbies);
		enterInsurantDataPage.enterWebsite("http://sampleapp.tricentis.com/101/app.php");
		enterInsurantDataPage.validateZeroFieldsPending();
		enterInsurantDataPage.clickNextButton();
	}
	
	@Given("fulfill the fields of the section Enter Product Data")
	public void fulfillTheFieldsOfTheSectionEnterProductData() {
		enterProductDataPage.validatePageIsSelected();
		enterProductDataPage.enterStartDate("03/01/2022");
		enterProductDataPage.selectInsuranceSum("15000000");
		enterProductDataPage.selectMeritRating("Super Bonus");
		enterProductDataPage.selectDamageInsurance("Full Coverage");
		
		List<String> optionalProducts = new ArrayList<>();
		optionalProducts.add("Legal Defense Insurance");
		
		enterProductDataPage.selectOptionalProducts(optionalProducts);
		enterProductDataPage.selectCourtesyCar("Yes");
		enterProductDataPage.validateZeroFieldsPending();
		enterProductDataPage.clickNextButton();	
	}

	@Given("select the price of the section Select Price")
	public void selectThePriceOfTheSectionSelectPrice() {
		selectPriceOptionPage.validatePageIsSelected();
		selectPriceOptionPage.selectPrice("Silver");
		selectPriceOptionPage.validateZeroFieldsPending();
		selectPriceOptionPage.clickNextButton();
	}

	@Given("fulfill the fields on the section Send Quote")
	public void fulfillTheFieldsOnTheSectionSendQuote() {
		sendQuotePage.validatePageIsSelected();
		sendQuotePage.enterEmail("test@test.com");
		sendQuotePage.enterPhone("123456789");
		sendQuotePage.enterUsername("test");
		sendQuotePage.enterPassword("Test123");
		sendQuotePage.selectConfirmPassword("Test123");
		sendQuotePage.enterComments("Test");
		sendQuotePage.validateZeroFieldsPending();
	}

	@When("I click on the button Send")
	public void iClickOnTheButtonSend() {
		sendQuotePage.clickSendButton();
		sendQuotePage.waitForLoadMessage();
	}

	@Then("an email is sent")
	public void anEmailIsSent() {
		boolean result = sendQuotePage.validateEmailSended();
		Assert.assertTrue(result);
	}
}
