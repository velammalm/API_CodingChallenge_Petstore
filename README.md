# API_CodingChallenge_Petstore
Created tests using java for Petstore API (https://petstore.swagger.io/)

# Pre-requisite:
1. Install Java and Eclipse
2. Install cucumber plugin to eclipse IDE <br />
3. Ensure to import the project as Maven project in eclipse  <br />
File -->Import-->Maven-->Existing Maven Project

# Steps to execute the test script:
1.Find the RunCukesTest.java file under the following path in the project folder<br />
#src/test/java -->default package-->RunCukesTest.java <br />
2.Rightclick on testng.xml and Run as-->TestNG Suite <br />
3.The Reports can be obtained from 'target' Folder <br />
target -->reports--> test report -->index.html

# Solution for reports to integrate with CI
For reports we can use 'Extent Reports' which generates customized html report with required details and a pie chart with execution status. <br />
Also when integrated with Jenkins, once the build is scheduled and the execution gets completed, the necessary settings can be done for the reports to be shared via email.
