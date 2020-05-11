Feature:
  Me as a princess
  I want new shoes
  So that I will buy new ones

  Scenario: all I need to do is click few times
    Given I want new Tikoki shoes
    When I click on new category
    And I choose the most beautiful ones
    And I choose my size
    And I throw them to the basket
    And Im going to check it they are really in the basket
    Then yes, my shoes for (price) are already there

    Scenario: oh, who will pay it
      Given my husband has money
      When I ask him to pay
      Then he will buy them for me

