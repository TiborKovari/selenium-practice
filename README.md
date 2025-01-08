# 🚀 Selenium Maven Automation Framework

## 📚 Description

This project is a **Selenium Automation Framework** built with **Maven** and **JUnit 5**. It serves as a template for automating web application testing using industry best practices.

### 🔑 **Key Features:**
- **Page Object Model (POM)** design pattern.
- **JUnit 5 Parameterized Tests** with CSV data source.
- **Explicit Waits** for reliable element interactions.
- **Dynamic XPath Handling** for reusable locators.

---

## 🛠️ **Technologies Used**

- **Java 21** – Programming Language
- **Selenium 4.x** – Browser Automation Library
- **JUnit 5** – Test Framework
- **Maven** – Build and Dependency Management
- **CSV Files** – Parameterized Test Data Source

---

## 📂 **Project Structure**

```
selenium-practice/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── org.example.pages/  # Page Object Model classes
│   │   │   │   ├── BasePage.java
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── ButtonsPage.java
│   │   │   │   ├── CalculatorPage.java
│   │   ├── resources/  # Configuration files
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── org.example.tests/  # Test classes
│   │   │   │   ├── BaseTest.java
│   │   │   │   ├── ButtonTest.java
│   │   │   │   ├── CalculatorTest.java
│   │   ├── resources/  # Test data
│   │   │   ├── calculator_test_data.csv
│
├── pom.xml  # Maven configuration
└── README.md  # Project documentation
```

---

## ⚙️ **Setup and Execution**

### 1️⃣ **Clone the Project**

```bash
git clone https://github.com/TiborKovari/selenium-practice.git
cd selenium-practice
```

### 2️⃣ **Install Dependencies**

Maven will automatically download all dependencies:

```bash
mvn clean install
```

### 3️⃣ **Run All Tests**

Execute all tests using Maven:

```bash
mvn clean test
```

### 4️⃣ **Run a Specific Test Class**

For example, run only the `CalculatorTest`:

```bash
mvn -Dtest=CalculatorTest test
```

---

## 📊 **Test Data (CSV)**

Test data for parameterized tests is stored in:

**Path:** `src/test/resources/calculator_test_data.csv`

**Example CSV format:**
```csv
numberA,operation,numberB,expectedResult
1,+,2,3
5,+,5,10
10,+,20,30
```

---

## 🧪 **Test Types**

1. ✅ **Happy Path Tests:** Verifying basic functionality.
2. 📏 **Boundary Value Analysis:** Testing upper and lower limits.
3. 📊 **Equivalence Partitioning:** Testing different input classes.
4. 🚫 **Negative Tests:** Handling invalid inputs.
5. 🧩 **Edge Case Tests:** Testing extreme and rare scenarios.

### 📑 **JUnit Example for Parameterized Test with CSV:**

```java
@ParameterizedTest
@CsvFileSource(resources = "/calculator_test_data.csv", numLinesToSkip = 1)
public void testAddition(String numberA, String operation, String numberB, String expectedResult) {
    String result = calculatorPage.addNumbers(numberA, operation, numberB);
    Assertions.assertEquals(expectedResult, result, "Test failed for addition!");
}
```

---

## ✅ **How to Contribute**

1. **Fork** the repository on GitHub.  
2. **Clone** your fork locally:
   ```bash
   git clone https://github.com/YOUR_USERNAME/selenium-practice.git
   ```
3. **Create a new branch:**
   ```bash
   git checkout -b feature/new-feature
   ```
4. **Make your changes** and commit:
   ```bash
   git add .
   git commit -m "Add new feature"
   ```
5. **Push your changes:**
   ```bash
   git push origin feature/new-feature
   ```
6. Create a **Pull Request** on GitHub.

---

## 📑 **Best Practices Followed**

- **Page Object Model (POM)** for structured test automation.
- **Parameterized Testing** using CSV files for flexibility.
- **Explicit Waits** to handle dynamic web elements.
- **Reusable Utility Methods** for cleaner code.

---

## 📊 **Future Improvements**

- 🚀 Integrate with **Jenkins** for CI/CD pipelines.
- 📊 Generate detailed test reports using **Allure Reports**.
- 🌍 Add cross-browser testing support.


---

## 📝 **License**

This project is licensed under the **MIT License**. See the `LICENSE` file for more information.

---

## 📦 **Quick Commands Reference**

```bash
# Clone the repository
git clone https://github.com/TiborKovari/selenium-practice.git

# Install dependencies
mvn clean install

# Run all tests
mvn clean test

# Run specific test class
mvn -Dtest=CalculatorTest test
```

---

🎯 **If you find this project helpful, give it a ⭐ on GitHub!** 😊🚀
