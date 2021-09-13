Feature: Quote vehicle insurance
  
  As an user
	I want to fulfill the quotation vehicle insurance datas
	So I can receive an email with the details

	Scenario:
		Given I fulfill the fields of the section Enter Vehicle Data
    And fulfill the fields of the section Enter Insurant Data
    And fulfill the fields of the section Enter Product Data
    And select the price of the section Select Price
    And fulfill the fields on the section Send Quote
    When I click on the button Send
    Then an email is sent