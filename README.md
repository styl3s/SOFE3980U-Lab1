# SOFE 3980U — Lab 1: Binary Calculator

A Maven-managed Java project built for Lab 1 (Software Project Management and Comprehension Tool). Implements a `Binary` class that stores a binary value as a string and supports addition, bitwise OR, bitwise AND, and multiplication.

## Project Structure

```
BinaryCalculator/
├── pom.xml
├── src/
│   ├── main/java/com/ontariotechu/sofe3980U/
│   │   ├── Binary.java   # add, or, and, multiply
│   │   └── App.java      # interactive CLI demo
│   └── test/java/com/ontariotechu/sofe3980U/
│       ├── AppTest.java
│       ├── BinaryTest.java        # 11 tests (constructor + add)
│       └── BinaryDesignTest.java  # 9 tests (OR, AND, multiply — 3 each)
```

## Building

```
mvn clean package site assembly:single
```

This compiles the project, runs all 21 tests, generates a Javadoc site under `target/site/`, and produces two jar files:

- `target/BinaryCalculator-1.0.0.jar` — plain jar, requires joda-time on the classpath separately
- `target/BinaryCalculator-1.0.0-jar-with-dependencies.jar` — self-contained, includes joda-time

## Running

```
java -jar target/BinaryCalculator-1.0.0-jar-with-dependencies.jar
```

Prompts for two binary numbers and prints their sum, bitwise OR, bitwise AND, and product.

## Testing

```
mvn test
```

Runs 21 tests across three test classes. Results are also viewable as an HTML report at `target/site/surefire-report.html` after running the full build above.

## Documentation

Generated Javadoc is available at `target/site/apidocs/index.html` after running `mvn site` (or the full build command above).

