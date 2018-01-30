# Walmart_ChallengeSubmission
## Instructions

Before downloading and running the solution, make sure that Java is installed on your computer. This can be checked with:
```java
java -version
```
If you do not have Java Installed, then it can be installed [here](https://java.com/en/download/).

Once you have Java Installed, you can now build and execute the solution. Go to the directory where the files are located(src) and run the following command:

```java
javac Solution.java Seats.java  Venue.java  seatHolder.java SeatComparator.java
```


Once this has been completed, you will have compiled .class files.Then the following command can be run to run the solution:
```java
java Solution Seats Venue  seatHolder SeatComparator
```

Building and executing the test files is very similar to the procedure above.

To build the tests use the following command:

```java
javac YourTestFile.java
```
In the above case YourTestFile.java can be replaced with SeatTest.java or VenueTest.java. Dependencies should also be included. 

This should once again build .class files that can be compiled using:
```java
java org.junit.runner.JUnitCore YourTestFile
```

If any problems occur, then you should check the classpath or can troubleshoot at the following links:

[J-Unit Guide for running on command](https://github.com/junit-team/junit4/wiki/Getting-started)

[Stack Overflow thread adressing running Java files on command line](https://stackoverflow.com/questions/16137713/how-do-i-run-a-java-program-from-the-command-line-on-windows)


## Assumptions
1) The best seat in the theater is the seat at the center of the venue, or the seat that is closest to it.

2) Due to the fact that the Venue is in high demand, the problem of multiple threads/users attempting to use a single object should be considered and solved by synching the functions.

3) The user will want to see the total number of open seats and the beast seat at every window, as these are vital pieces of information for every decision they make.

4) The only time a user would want to hold a seat is when they want to reserve the seat in the future. 

