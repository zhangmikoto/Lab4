/*
 * 2017-Sep-24
 * TA Zhe Xu
 * for CS125 2017 Fall
 *
 * Do not create additional variables or print the same letter in two different places in your code. Complete the
program below to print out either “C” “D” “F” or “T” (cat, dog, fish or toy respectively). Use the following rules:
  A condo dweller gets a cat provided they have $13 or greater to spend.
  A house owner gets a dog provided they have more than $17 to spend.
  A dorm dweller with $5 or more, and also house owner with exactly $5, gets a fish.
  All others should get a stuffed toy.
 *
 * */
import java.util.Scanner;

public class PurrfectPetsRecommendation {
   public static void main (String[] args) {
      System.out.println("Do you live in a Dorm, Condo or House?");
      System.out.println("Type D C or H and press return");
      Scanner in = new Scanner(System.in);
      char type = in.next().charAt(0);  // assume either D C or H
      System.out.println("Dollars you can spend on your pet each week?");
      int dollars = in.nextInt(); // assume a valid integer

   } // end of main method
}    // end of class