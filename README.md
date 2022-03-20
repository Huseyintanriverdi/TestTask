TOOLS
Java: My framework is written using Java language

Maven: My framework created as a maven project, maven is used to manage dependencies and also run my tests as mvn
goals from terminal

Selenium WebDriver: a library/tool/api which is used to automate the browser, it interacts with the browser.

TestNG: used to group tests using xml files, do soft and hard assertions, create test methods, run in certain order

allure: my framework generates detailed json reports. To read them in html format, allure serve should be written in terminal.

IDE: I use IntelliJ in my current framework, but I am also quite comfortable with Eclipse.

Page Object model: my framework used page object model according to which I created a separate class for the pages of
my application.

PageFactory design: a design which makes it easy to access the page object class.
Below not Page factory design. it is class which has the same name as the PageFactory design:
PageFactory.initElements(driver, this)

Singleton Driver: My frameworks uses a singleton pattern to share the webdriver instance between different classes

TestBase: My framework has a testbase class which my tests extent. testbase class has the common steps for all my tests.

Configuration.properties file: used to store the important test data

Utilities: have reusable utilities which can be used across different classes of my framework

Packaging: I have create different packages for different types of classes and logic. Each page package only contains classes
with same functionality.

Naming conventions: Classes, methods variable are named on based on what they do and follow a standard


To use allure;
![Capture](https://user-images.githubusercontent.com/89145396/159188933-9ba9948b-b212-4b47-9319-1d06cad72265.PNG)
See the report above.

<dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-testng</artifactId>
            <version>2.17.3</version>
        </dependency>
        
 i used also.

 <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>4.4.3</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>test</scope>
        </dependency>
        

 
 
