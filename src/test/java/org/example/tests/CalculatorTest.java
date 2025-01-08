package org.example.tests;

import org.example.pages.CalculatorPage;
import org.example.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatorTest extends BaseTest {

    private HomePage homePage;
    private CalculatorPage calculatorPage;

    @ParameterizedTest
    @CsvFileSource(resources = "/calculator_test_data.csv", numLinesToSkip = 1)
    public void testCalculatorsAddition(String numberA, String operation, String numberB, String expectedResult) {
        homePage = new HomePage(driver);
        calculatorPage = new CalculatorPage(driver);

        homePage.clickElement(homePage.getCalculatorButton());
        String result = calculatorPage.addNumbers(numberA, operation, numberB);
        String expected = expectedResult;

        Assertions.assertEquals(expected, result, "result does not meet expectation");

    }

    // also need to test:
    // Equivalence Partitioning eg.: poz nums, neg nums, mixed nums, using nul
    // Boundary Value Analysis eg.: 0, 1, 9999....
    // Negative Test Cases eg.: empty field, not numeric chars, special symbols, null
    // Edge Case Test eg.: too much operations, small and big numbers


}