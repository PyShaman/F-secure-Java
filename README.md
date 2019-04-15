# F-secure
_User guide_
###### Author: Michał Bek
###### Email: michal.bek@gmail.com


**List of contents**

**1. Java version and installation**

**2. Installing required dependencies**

**3. Usage**

_1. Java version and installation_

This test framework is written in Java 11 and it should be ran on 
this version. User can download newest version of Java at 
[Java download site](https://jdk.java.net/11/).

After installing Java on your OS user should clone project 
[repository](https://github.com/PyShaman/F-secure-Java.git).
The main branch will be the _master_.

_2. Installing required dependencies_

After cloning repository all necessary dependencies will be downloaded.

_3. Usage_

In the following file:

```
/src/test/resources/default.properties
```

user should select browser to perform tests. To do that user should 
write browser=chrome to run tests in Chrome or browser=firefox for Firefox.

After setting up browser user should run test that is under
```
/src/test/resources/features/jobSearch.feature
```
file.
