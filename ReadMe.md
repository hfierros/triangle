# Triangle

## Description
For Quality Assurance class. Small project to play with karate, and JUnit. 

A spring boot "rest" application that receives a triangle sides in the form: 

    {
        "sideA" : 2,
        "sideB" : 3,
        "sideC" : 4
    }


And will return a 200 and the type of triangle: SCALENE, ISOSCELES or EQUILATERAL in the form: 

    {
        "type" : "SCALENE"
    }

## To run this project

Be sure to have Java 21 and maven 3.5.*+ installed

This is a maven project based on spring-boot framework. 

To run it, just type: 

```
./mvnw spring-boot:run
```

All the required dependencies will be downloaded, and the project will be compiled. 

## UNIT TEST BRANCH

This branch has changes that allow to run Unit tests. 
There was a couple of tests added into the system, under the 
test directory. 

The test suite can be executed by running 

```
./mvnw clean test
```

There is also  a new dependency/plugin added to the pom.xml file: 
Jacoco. This plugin generates a test coverage report. 

Open the file `target/site/jacoco/index.html` with your browser, after the 
test has ran. 

It will show the coverage for all source files. 

