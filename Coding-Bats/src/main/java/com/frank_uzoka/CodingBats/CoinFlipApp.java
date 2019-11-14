package com.frank_uzoka.CodingBats;

import org.springframework.web.server.session.HeaderWebSessionIdResolver;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipApp {

    public static void main(String[] args) {

        String userInput = null;
        System.out.println("Please enter Heads of Tales");

        Scanner Scan = new Scanner(System.in);
        System.out.println(userInput);
        String heads = "Heads";
        String tales = "Tales";
        if(userInput == heads){
            System.out.println("You Picked Heads");
        }



        Random rnd = new Random();

        int i = rnd.nextInt((2 - 1) + 1) + 1;

        if(i == 1){
            System.out.println(heads);
        }else{
            System.out.println(tales);
        }



    }


}
