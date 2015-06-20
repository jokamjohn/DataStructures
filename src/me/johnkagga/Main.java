package me.johnkagga;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Treet treet = new Treet("John","I am twenty two years now",new Date(1434789434000L));
        System.out.printf("This is the tweet: %s %n", treet);
    }
}
