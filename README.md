# RomanNumConverter

Built with Java and JUnit

This program is to convert Arabic Number to Roman Numeral(AraNumToRomNumConverter) and Roman Numeral to Arabic Number (RomNumToAraNumConverter)

Java must be installed

Locate repo in terminal/cmd

Compile AraNumToRomNumConverter class
```
javac AraNumToRomNumConverter.java
```

Compile the test: 
On Linux or MacOS
```
javac -cp .:junit-4.XX.jar AraNumToRomNumConverterTest.java
```
and on Windows
```
javac -cp .;junit-4.XX.jar AraNumToRomNumConverterTest.java
```

To run test:
Run test on Linux or MacOS
```
java -cp .:junit-4.XX.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AraNumToRomNumConverterTest
```
Run test on Windows
```
java -cp .;junit-4.XX.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore AraNumToRomNumConverterTest
```
Follow the same steps for Roman Numeral to Arabic Number tests except replace AraNumToRomNumConverter with RomNumToAraNumConverter
