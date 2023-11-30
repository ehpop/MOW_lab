package org.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mwo.code.Calculator;

public class CalculatorTest {

  private static Calculator calculator;

  @Before
  public void setUp() throws Exception {
    calculator = new Calculator();
  }

  @Test
  public void test_add() {
    // given
    int num1 = 1;
    int num2 = 2;
    int expected = 3;

    // when
    int actual = calculator.add(num1, num2);

    // then
    assertEquals(expected, actual);
  }

  @Test
  public void test_subtract() {
    // given
    int num1 = 1;
    int num2 = 2;
    int expected = -1;

    // when
    int actual = calculator.subtract(num1, num2);

    // then
    assertEquals(expected, actual);
  }

  @Test
  public void test_multiply() {
    // given
    int num1 = 1;
    int num2 = 2;
    int expected = 2;

    // when
    int actual = calculator.multiply(num1, num2);

    // then
    assertEquals(expected, actual);
  }

  @Test
  public void test_divide() {
    // given
    int num1 = 1;
    int num2 = 2;
    double expected = 0.5;

    // when
    double actual = calculator.divide(num1, num2);

    // then
    assertEquals(expected, actual, 0.0001);
  }

  @Test(expected = ArithmeticException.class)
  public void test_divideByZero() {
    // given
    int num1 = 1;
    int num2 = 0;

    // when
    calculator.divide(num1, num2);

    // then
  }
}