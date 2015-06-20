package me.johnkagga;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Treet treet = new Treet("John","projects going? on to spread` technology in Sub Saharan Africa. Hear some great stories #about how content that is traditionally   online is distributed offline, and how people have",new Date(1434789434000L));
        System.out.printf("This is the tweet: %s %n", treet);

        String example = "How old are you";
        //returns an array of strings
        /*
        with a space between: words are turned into an array
        with no space between : array of letters
         */
        String[] example2 = example.split(" ");
        System.out.print(example2[0]);
        System.out.print("\n" + example2.length + "\n");

        /* [^\w#,.`]+ used in Regex(regular expressions), \w words
        *[^] oppose (not words)
        * + add the spaces
        * http://www.ocpsoft.org/tutorials/regular-expressions/java-visual-regex-tester/
        * removes the other characters ? and others
         */
        //loop through the words
        for (String word : treet.getWords()){
            System.out.println(word);
        }


    }
}
