package org.example;

import org.example.controllers.CheckUniqueness;
import org.example.controllers.ScrambleWords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
        System.out.println("Enter serial number to perform operation");
        System.out.println("1.Scramble values");
        System.out.println("2.Abbreviate a word");
        System.out.println("3.Check uniqueness of a word");
        System.out.println("4.Exit");
            int serialNumber = sc.nextInt();
            switch (serialNumber) {
                case 1:
                    System.out.print("Enter the number of elements you want to store: ");
                    int n = sc.nextInt();
                    int[] inputArray = new int[n];
                    System.out.println("Enter the elements of the array: ");
                    for (int i = 0; i < n; i++) {
                        inputArray[i] = sc.nextInt();
                    }
                    ScrambleWords scrambleWords = new ScrambleWords();
                    scrambleWords.scramble(inputArray, 0, inputArray.length - 1);
                    scrambleWords.printOutput(inputArray);
                    break;
                case 2:
                    CheckUniqueness checkUniqueness1 = new CheckUniqueness();
                    System.out.println("Enter word to be abbreviated");
                    String word = sc.next();
                    System.out.println(checkUniqueness1.abbreviate(word));
                    break;
                case 3:
                    System.out.print("Please enter the number of strings you want to enter: ");
                    String[] words = new String[sc.nextInt()];
                    sc.nextLine();
                    for (int i = 0; i < words.length; i++) {
                        words[i] = sc.nextLine();
                    }
                    CheckUniqueness checkUniqueness2 = new CheckUniqueness(words);
                    checkUniqueness2.printAllUniques();
                    System.out.println("Enter the word to check uniqueness");
                    String inputWord = sc.next();
                    System.out.println(inputWord+" ->" + checkUniqueness2.isUnique(inputWord));
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Enter Valid Operation");
                    break;
            }
        }
    }
}