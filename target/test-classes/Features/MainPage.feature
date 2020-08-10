@MainPage

  Feature: Main page feature

    Background:
    Given I am on Main Page

  @Lowest_Highest_Temprature
  Scenario: Verify Lowest Temprature is Displayed
   When I click on Today button on Main Page
   And I verify Lowest Tempreture is Displayed Correctly
    And I verify Highest Tempreture is Displayed Correctly



#  @HighestTemprature
#
#  Scenario: Verify Highest Temprature is Displayed
#    When I click on Today button on Main Page
#    And I verify Highest Tempreture is Displayed or not


  #@web
#
#Feature: Messenger page feature
#
#  Background:
#    Given I am on messenger page
#
#  @messenger
#  Scenario: Verify invalid login from mesenger page
#    When I enter ilhanturkmen@siliconelabs.com into username field on the messenger page
#    And I enter test1234 into password field on the messenger page
#    And I click on login button on messenger page
#    Then I verify invalid login message on sign in page
