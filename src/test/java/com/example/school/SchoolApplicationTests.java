package com.example.school;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class SchoolApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Test!");
    }

    @Test
    void stringTest() {
        String name = "Ashkan";
        String sentence = "Today is a good day!";

        char[] s1 = sentence.toCharArray();
        System.out.println(s1[0]);
        System.out.println(s1.length);
        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {
            System.out.println(sentenceArray[i]);
        }

        int wordCounter = 0;

        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == ' ') {
                wordCounter++;
            }
        }
        wordCounter = wordCounter + 1;
        System.out.println("wordCounter = " + wordCounter);
    }

    @Test
    void biggestWord() {

        String sentence = "Today is a gooood day!";

        String[] sentenceArray = sentence.split(" ");

        int maxLength = 0;
        String longestWord = "";

        for (String s : sentenceArray) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestWord = s;
            }
        }
        System.out.println("The longest word is: " + longestWord);
        System.out.println("Maximum length of mentioned word is: " + maxLength);
    }
}
