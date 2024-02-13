Feature: Zadanie Testowe

  Scenario: Add to basket one item
    Given Open home page
    And Open devices tab
    And Select first product
    When Add product to basket
    Then Verify prices
    When Return to home page
    Then Verify amount of items in basket equals to "1"