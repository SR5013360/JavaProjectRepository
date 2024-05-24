Feature: Search and Place the order for products.
@SearchPotato
Scenario: Search experience for product search in both home and offers page
    
    Given User is on GreenCart Landing Page
    When User searched with shortname "Potato" and extracted actual name of product
    Then User searched with shortname "Potato" in offers page to check if product exist
    And Verify name of the product in home page matches name in offers page 
    

