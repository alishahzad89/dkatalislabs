# Dkatalis Lab Automation Tests

This repository contains Test Automation written in Java + Rest Assured + Maven + Testng

## Assumptions

- file has only get api details, with doesn’t required any authentication
- response status code of both api are same then only both are eligible for comparison 
- both files has same number of lines without any blank line.
- In case we are getting any exception while hitting api, always show both response are not equal. Eg abc from file 1 is not equal to abc from file 2.
- Using trim to remove the unwanted spaces, before hitting the get api.

## Automation Approach

- created class APIHelper to store the definite location of all resources. 
- Store data file name from json file and pass the to test cases at runtime
- DataReader class to read the json file into map to pass that to test methods
- FileReader class to read file, and store each line into string array
- ResponseComparator class – this has all logic to do comparison of json, it has one recursive method to compare expected vs actual.
- Response validator class to have the assertion and print the logs
- RestUtil class to get rest assured response using url.

## Setting up

* Import as maven project to ide from cloned repository
* wait for Maven to download all external dependency

### Running tests

       Open project folder path in CMD (windows) / terminal (mac) 
       Run  maven command – 'mvn clean install test'
       All report will be shown on console ouput


### Output

Test outputs can be seen on console.

### HTML Report

Navigate to test-output folder, look for email ‘emailable-report.html’, open it in any browser


### Author
Shahzad Ali
QA Automation Expert