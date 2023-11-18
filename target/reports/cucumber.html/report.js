$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Techfios Other billing login page functionality validation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account\t",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the password field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on bank cash",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on new account",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the account title field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the description field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the initial balance field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the account number field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the contact person field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" in the phone field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password",
        "",
        "accountTitle",
        "",
        "description",
        "",
        "initialBalance",
        "",
        "accountNumber",
        "",
        "contactPerson",
        "",
        "Phone"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "",
        "abc123",
        "",
        "Bamboo Title",
        "",
        "Bamboo Deposit",
        "",
        "10000",
        "",
        "963696369",
        "",
        "Anup",
        "",
        "0123456789"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to login with valid credentials",
  "description": "\tand open a new account\t",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enters the \"demo@techfios.com\" in the username field",
  "keyword": "When "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_the_in_the_username_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the password field",
  "keyword": "When "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_the_in_the_password_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_clicks_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on bank cash",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_clicks_on_bank_cash()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on new account",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_clicks_on_new_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Bamboo Title\" in the account title field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_in_the_account_title_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Bamboo Deposit\" in the description field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_in_the_description_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"10000\" in the initial balance field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_in_the_initial_balance_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"963696369\" in the account number field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_in_the_account_number_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Anup\" in the contact person field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_in_the_contact_person_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"0123456789\" in the phone field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_enters_in_the_phone_field_in_accounts_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "step.LoginStepDefinition.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
});