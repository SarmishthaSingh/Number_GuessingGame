package com.number;

import java.util.Scanner;
import java.util.Random;

public class DynamicNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;

        // Generate a random number between the specified bounds
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        // Set the maximum number of attempts dynamically
        System.out.print("Enter the maximum number of attempts: ");
        int maxAttempts = scanner.nextInt();
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                break;
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry! You've run out of attempts. The correct number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}

