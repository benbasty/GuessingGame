package com.corejava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        String secretWord = "papyrus";

        String guess = "";

        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;
        while(!guess.equals(secretWord) && !outOfGuesses) {
            if(guessCount < guessLimit ){
                System.out.print("Enter a guess - a paper used in ancient times as a writing surface - ");
                guess = input.nextLine();
                guessCount++;
            } else {
                outOfGuesses = true;
            }

        }
        if(outOfGuesses) {
            System.out.println("You reached your guess limit. Try again later");
        } else {
            System.out.println("You guessed right");
        }

    }
}
