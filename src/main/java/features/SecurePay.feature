Feature: Secure pay contact us page validation

  Scenario: Auto generating data to fill on contact us form
    Given Customer launches browser
    When  Search for Secure pay on Google home page
    And   Navigate to Secure pay
    And   Navigate to Contact us page
    Then  Contact us page is displayed
    Then  Fill the details in Contact us form