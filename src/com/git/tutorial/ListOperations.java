package com.git.tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nakulkumar on 7/7/16.
 */
public class ListOperations {

    public static void main(String[] args) {
        List<Integer> coins = new ArrayList<>();
        coins.add(1);
        coins.add(5);
        for(int x : coins){
            System.out.println("Coin of Rs."+x);
        }
    }
}
