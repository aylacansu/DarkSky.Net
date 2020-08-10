
 @RegisterPage
Feature: Register page feature

  Background:

    Given: I am on the Darksky Register page

  @login
  Scenario: Verify invalid login from Register page

When   I enter aylacansu@gmail.com into email text fields on login page
And    I enter test1234 into password text fields on login page
And    I click on login button
Then   I verify error message “password and username does not match”
