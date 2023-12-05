Feature: Login

@smoke
  Scenario: Successful Login with Valid Credentials
    Given User Launch chrome browser
    When User opens url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser
    
    @Sanity
    Scenario Outline: Login Data Driver
     Given User Launch chrome browser
    When User opens url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<Email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser
    
    Examples:
    | Email | password |
    | admin@yourstore.com | admin |
    | admin@yourstore.com | admin1223 |