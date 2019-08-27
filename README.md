#TigerSpike_Test
selenium-cucumber-java-maven-POM

selenium-cucumber : Automation Testing Using Page Object Model

selenium-cucumber is a behavior driven development (BDD) 
approach to write automation test script to test Web. 
It enables you to write and execute automated acceptance/unit tests. 
It is cross-platform, open source and free. 
Automate your test cases with minimal coding.

# Installation Pre requisite
Java
Maven
Intellij/Eclipse
Cucumber
Chrome browser
Firefox browser

# To Execute test
Run the Runner file with junit

Project-Name
	|
	|_src/main/java
	|	|_features
	|	|	|_SecurePay.feature
	|	|_pages
	|	|	|_GoogleHomePage.java
	|	|	|_SecurePayPage.java
	|	|	|_HomePage.java
	|   |   |_SPContactUsPage.java
	|	|_stepDefinitions
	|	|	|_NavigateContactUS.java
	|   |_testRunner
	|   |   |_Runner.java
	|   |_utilities
	|   |   |_BaseClass.java
	|_src/main/resources
	|   |_config
	|   |   |_config.properties
	|   |_Drivers
	|   |_chromedriver
	|   |_geckodriver
	|_src/test/java
	
src/main/java/features - all the cucumber features files (files .feature ext) goes here.
src/main/java/stepDefinitions - you can define step defintion under this package for your feature steps.
src/main/java/pages - All the pages for page object model can be defined here
src/main/java/testRunner - To Run the feature file
src/main/java/utilities - Base class to define browser and other page objects are defined here
src/main/resources/config - has the config property file to define browser, brands and other parameters
Writing a test

The cucumber features goes in the features library and should have the ".feature" extension.



