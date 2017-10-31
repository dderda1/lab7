package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    printReverse(sc); 
  }
    // done
    private static void printReverse(final Scanner sc) {
    while (sc.hasNextLine()) {
      final String lines = sc.nextLine();
      System.out.println(lines);
      printReverse(sc);
      System.out.println(lines);
    }

  }
}
