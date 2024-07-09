# Magical Arena

This is a simple simulation of a magical arena where two players fight each other until one of them dies.

## How to Run

1. **Clone the Repository**

```bash
git clone <repository-url>
cd <repository-directory>

javac *.java

java Main

Make sure you have JUnit 4.12 and Hamcrest 1.3 JAR files in the project directory

javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar ArenaTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore ArenaTest
