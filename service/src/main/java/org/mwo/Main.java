package org.mwo;

import java.util.Scanner;
import lombok.extern.log4j.Log4j2;
import org.mwo.code.Calculator;

@Log4j2
public class Main {

  private static final Calculator calculator = new Calculator();

  public static void main(String[] args) {
    log.info("Enter two numbers and an operator (+, -, *, /):");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();
    String[] inputArray = input.split(" ");

    int num1 = Integer.parseInt(inputArray[0]);
    int num2 = Integer.parseInt(inputArray[1]);
    String operator = inputArray[2];

    int result = 0;
    switch (operator) {
      case "+":
        result = calculator.add(num1, num2);
        break;
      case "-":
        result = calculator.subtract(num1, num2);
        break;
      case "*":
        result = calculator.multiply(num1, num2);
        break;
      case "/":
        try {
          result = (int) calculator.divide(num1, num2);
        } catch (ArithmeticException e) {
          log.info(e.getMessage());
          System.exit(1);
        }
        break;
      default:
        log.info("Invalid operator!");
        System.exit(1);
    }

    log.info("Result: " + result);
  }
}