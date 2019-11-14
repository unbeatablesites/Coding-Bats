package com.frank_uzoka.CodingBats;

import org.springframework.web.server.session.HeaderWebSessionIdResolver;

import java.util.Random;

public class CoinFlipApp {

    public static void main(String[] args) {

        String heads = "Heads";
        String tales = "Tales";

        Random rnd = new Random();

        System.out.println(rnd.nextInt((2 - 1) + 1) + 1);

        System.out.println(heads);
        System.out.println(tales);
    }


}
