package com.frank_uzoka.CodingBats;

import org.springframework.web.server.session.HeaderWebSessionIdResolver;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipApp {

    public static void main(String[] args) {


            Random rnd = new Random();
            String userInput = null;
            System.out.println("Please enter Heads of Tales");

            Scanner Scan = new Scanner(System.in);
        do {
            userInput = Scan.nextLine().toLowerCase();
            if (userInput.equals("heads")) {
                System.out.println("You Picked Heads");
                int i = rnd.nextInt((2 - 1) + 1) + 1;
                if (i == 1) {
                    System.out.println("You win! Heads was the correct guess");
                } else if (i == 2) {
                    System.out.println("Sorry tales was the correct guess.");
                } else System.out.println("Please enter Heads of Tales");
            }

            if (userInput.equals("tales")) {
                System.out.println("You Picked Tales");
                int i = rnd.nextInt((2 - 1) + 1) + 1;
                if (i == 1) {
                    System.out.println("You win! Tales was the correct guess.");
                } else if (i == 2) {
                    System.out.println("Heads was the correct guess sorry");
                    System.out.println("Please enter Heads of Tales");
                } else System.out.println("Please enter heads or tales");
            } else {
                System.out.println("Please enter Heads of Tales!"); }


        }while (userInput != "heads" || userInput != "tales");

    }


}
