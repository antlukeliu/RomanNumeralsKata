# RomanNumConverter

Built with Java and JUnit

This program is to convert Arabic Number to Roman Numeral.

Java must be installed

Locate repo in terminal/cmd

Compile RomanNumeralsConverter class
```
javac RomanNumeralsConverter
```

Compile the test: 
On Linux or MacOS
```
javac -cp .:junit-4.XX.jar RomanNumeralsConverterTest.java
```
and on Windows
```
javac -cp .;junit-4.XX.jar RomanNumeralsConverterTest.java
```

To run test:
Run test on Linux or MacOS
```
java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore RomanNumeralsConverterTest
```
Run test on Windows
```
java -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore RomanNumeralsConverterTest
```
