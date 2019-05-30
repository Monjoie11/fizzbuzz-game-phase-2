package edu.cnm.deepdive.model;

/**
 * Includes several public methods and constants.
 *
 * <p> This class includes <code>static</code> methods that take <code>int</code> parameters and return boolean and {@link String} results indicating whether the specified values are divisible by 3 (fizz) or
 * five(buzz). Multiples of both are fizzbuzz.</p>
 *
 * @author JA Franken Deep &amp; Dive Coding 7
 * @version 1.0.0
 */
public class FizzBuzz {

/** String value indicating a number divisible by 3*/
  public static final String FIZZ = "Fizz";
  /** String value indicating a number divisible by 5*/
  public static final String BUZZ = "Buzz";

  private FizzBuzz(){}

  /**
   * Computes and returns "fizz", "buzz", or a string representation of <code>value</code> depending on whether <code>value</code> is divisible by 3 or 5.
   * @param value Integer value to be tested for divisibility by 3 and 5.
   * @return fizz, buzz, or value as a {@link String}
   */
  public static String fizzBuzzValue(int value) {
    if (value <= 0) {
      throw new IllegalArgumentException();
    }
    String result = "";
    if (isFizz(value)) {
      result += FIZZ;
    }
    if (isBuzz(value)) {
      result += BUZZ;
    }
    if (result.isEmpty()) {
      result += value;
    }
    return result;
  }

  /**
   * Uses remainder to determine is <code>value</code> is a multiple of 3, returning "fizz" if true
   * @param value Integer between a range of numbers selected by user
   * @return Fizz or {@link String} representation of <code>Value</code>
   */
  public static boolean isFizz(int value) {
    return value % 3 == 0;
  }
  /**
   * Uses remainder to determine is <code>value</code> is a multiple of 5, returning "buzz" if true
   * @param value Integer between a range of numbers selected by user
   * @return Buzz or string representation of <code>Value</code>
   */
  public static boolean isBuzz(int value) {
    return value % 5 == 0;
  }
}