package com.frank_uzoka.CodingBats;

import org.springframework.web.server.session.HeaderWebSessionIdResolver;

import java.util.Random;

public class CoinFlipApp {

    public static void main(String[] args) {

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
