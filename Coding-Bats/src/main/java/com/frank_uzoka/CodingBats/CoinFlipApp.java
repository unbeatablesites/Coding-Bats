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
        userInput = Scan.nextLine();
        if(userInput.equals("heads")){
            System.out.println("You Picked Heads");
        }



//
//
//        int i = rnd.nextInt((2 - 1) + 1) + 1;
//
//        if(i == 1){
//            System.out.println(heads);
//        }else{
//            System.out.println(tales);
//        }



    }


}
