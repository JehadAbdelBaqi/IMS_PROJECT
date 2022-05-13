## IMPORTANT LINKS  
[GitHub repository link](https://github.com/JehadAbdelBaqi/IMS_PROJECT)
[Jira project management board](https://project-lucius.atlassian.net/jira/software/projects/IMS)

## Inventory Management System

This project is for an inventory management system which uses a relational database management system (MySQL) to create a relational database which is used to store customer, inventory and transactional information. The application should be able to create, read, update and delete data from and onto the database. The initial functionality of the application is to do this and this alone.

## Application builder

To run this application on you local machine you would need to clone the repository from [main](https://github.com/JehadAbdelBaqi/IMS_PROJECT) by clicking on code or forking the repository. You would then need to open the folder using the terminal command _**mvn clean package**_ which should build the file. After the file is succesfully build you would navigate to the target folder on the terminal and find the file **ims-0.0.1-jar-with-dependencies.jar** and execute the file by running **_java -jar ims-0.0.1-jar-with-dependencies.jar_** to run the file on your terminal. PS -you would need to ensure you have all the prerequisite software installed to run ir successfully - please see below. Some server connections to MySQL would need to be changed to ensure it is feeding information to the correct database. 


### Prerequisites

Here is the tech stack used and the places to download them.

[mySQL and mySQL Workbench](https://www.mysql.com/) - Relational database management.  
[Eclipse](https://www.eclipse.org/ide/) - Integrated development environment.  
[Maven](https://maven.apache.org/) - Software/application project dependency management.  
[Java](https://www.java.com/en/) - Object oriented programming language.  
[GitBash](https://git-scm.com/downloads) - Git version control command line emulator.  


## Running the tests

The automated tests are done by using JUnit which usually checks a function or method by running it and retreiving the results. An example of this is used in the create method for the DAO classes - the tester creates an instance of a class and uses a method within the classs - it then checks the result to see if they match what was passed into the method as an arguement. If the method return the same result as what is tested - the test have passed so the method is working.

### Unit Tests 

A unit test is to check individual units of source code to see if they are fit for use. For example to check individual functions of a class to ensure they are functioning correctly by giving them arguments and seeing if the result matchess the arguement given.

### Integration Tests 

Integratio testing is taking a multitude of different classes and fucntions and checking if they work together. For example a class instance is made in a test which the subclass inherits from. A method which reads the attributes of the class is then activates with the same attibutes as the instance of the class. In theory the return value of the read method should be the same as the attributes upon instantiation. We have now seen if this read function works well by creating an instance and testing it immediately to retrieve the results. 


## Built With


* [mySQL and mySQL Workbench](https://www.mysql.com/)  
* [Eclipse](https://www.eclipse.org/ide/)   
* [Maven](https://maven.apache.org/)  
* [Java](https://www.java.com/en/)   
* [GitBash](https://git-scm.com/downloads) 

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

[Help with downloading Maven succesfully on MAC](https://www.youtube.com/watch?v=j0OnSAP-KtU)   
[Create an ERD using MySQL](https://www.youtube.com/watch?v=E73JoLzNadc)  
[Free ERD and UML creating tools](https://online.visual-paradigm.com)  
[Information regaridng many to many relational database tables](https://support.microsoft.com/en-us/office/video-create-many-to-many-relationships-e65bcc53-8e1c-444a-b4fb-1c0b8c1f5653)
