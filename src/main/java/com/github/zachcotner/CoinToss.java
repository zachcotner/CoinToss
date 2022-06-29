package com.github.zachcotner;

import java.util.Random;

public class CoinToss {

    public static void main( String[] args ){
      Random r = new Random();
      int i = r.nextInt(2);
        if (i == 0){
            System.out.println("The coin shows HEADS.");
        } else {
            System.out.println("The coin shows TAILS.");
        }
    }
}
