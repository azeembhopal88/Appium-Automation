# Appium Assessment

Application: Selendroid Test App (Android)

## Test Cases

###### Verify that, user's inputs on the Registration form displayed on the review screen. 
    
        - Test Class: RegistrationTest.java
        - Page Objects: RegistrationPage.java, HomeScreenPage.java, VerifyUserPage
        - Test Data: Registration_Test_Data.csv

###### Verify that the toast message should be displayed when the user taps on the "Displays a Toast" button. 

        - Test Class: ToastMsgTest.java
        - Page Object: HomeScreenPage.java

###### Verify that the text message should be displayed when the user taps on the "Display text view" button.

        -  Test Class: DisplayTextTest.java
        -  Page Object: HomeScreenPage.java

###### Verify that "Long Press" label should be displayed when user long press on the screen.

        - TouchActionTest.java
        - TouchActionPage.java

## Installation Pre-requisites:

        - Install JDK
        - Install Eclipse - LUNA IDE
        - Install Android SDK
        - Install npm
        - Install nodejs
        - Setup all environmental variable

## Miscellaneous Pre-requisites

        - Create a new Emulator in Android Studio
               - AVD Name: Nexus S API 27
               - Android Version: 8.1
        - The Appium server should be started before running the test
        - The emulator should be started before running the test

## How to Execute

        - Import the project into your Eclipse using Maven
        - Clean build the project
        - How to run a specific test
                 * Go to Test Class
                 * Run single that class as TestNG
        - How to run all test cases
                 * Right-click on testng.xml file 
                 * Run as TestNG Suite
## How to Execute using terminal

	   - Open Terminal (cmd) 
	   - Go to directory where the project is downloaded
	   - Type mvn clean and Enter
	   - Type mvn test and Enter
	   
## Resources

        - Test Data and Apk are located in src/test/resources

         
## Reports

        - Reports will be generated here: /selendroid/target/surefire-reports