package com.frank_uzoka.CodingBats;

import org.springframework.web.server.session.HeaderWebSessionIdResolver;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipApp {

    public static void main(String[] args) {
        System.out.println("Please enter Haeds of Tales");

        Scanner Scan = new Scanner(System.in);
        String userInput = Scan.nextLine();

        if(userInput.equals("Heads")){
            System.out.println("You Picked Heads");
        }

        String heads = "Heads";
        String tales = "Tales";

        Random rnd = new Random();

        int i = rnd.nextInt((2 - 1) + 1) + 1;

        if(i == 1){
            System.out.println(heads);
        }else{
            System.out.println(tales);
        }



    }


}
