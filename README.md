# Java 16 Feature Demo Project

## Overview

This project demonstrates several new features introduced in Java 16. It is structured as a Maven project and uses the Java Platform Module System (JPMS). The code is organized under the `com.java16` package, with services showcasing different Java 16 capabilities.

## Java 16 Features Used

### 1. Records
- **File:** `Person.java`
- **Description:** The `record` keyword is used to declare a compact, immutable data carrier class. Records automatically provide implementations for `equals()`, `hashCode()`, and `toString()`.
- **Example:**
  ```java
  public record Person(int age, String name) { }
  ```

### 2. Stream.toList()
- **File:** `StreamToListService.java`
- **Description:** Java 16 introduced the `toList()` terminal operation for streams, which returns an unmodifiable list containing the elements of the stream.
- **Example:**
  ```java
  List<String> list = Stream.of("1","2","3").toList();
  ```

### 3. Stream.mapMulti()
- **File:** `MapMultiService.java`
- **Description:** The `mapMulti` method allows mapping each element to zero or more elements, providing a more flexible alternative to `flatMap`.
- **Example:**
  ```java
  List<String> list = Stream.of("Map", "Multi")
      .<String>mapMulti((str, downStream) -> {
          for(char ch: str.toCharArray()) {
              downStream.accept(String.valueOf(ch));
          }
      }).toList();
  ```

### 4. Pattern Matching for instanceof
- **File:** `PatternMatchingService.java`
- **Description:** Pattern matching for `instanceof` simplifies type checks and casting by allowing you to declare a variable in the `instanceof` expression.
- **Example:**
  ```java
  if (object instanceof String str) {
      System.out.println(str.length());
  }
  ```

### 5. Java Platform Module System (JPMS)
- **File:** `module-info.java`
- **Description:** The project uses a module descriptor, which is a feature from Java 9+, but its use is modern and recommended for modular applications.

## How to Build and Run

1. **Requirements:** Java 16 and Maven.
2. **Build:**  
   ```
   mvn clean package
   ```
3. **Run:**  
   Run the main class `com.java16.app.App` using your IDE or:
   ```
   java -p target/classes -m java16/com.java16.app.App
   ```

## Project Structure

- `src/com/java16/service/` — Contains service classes demonstrating Java 16 features.
- `src/com/java16/app/App.java` — Main application entry point.
- `src/module-info.java` — Module descriptor.
- `pom.xml` — Maven build configuration (set to Java 16). 