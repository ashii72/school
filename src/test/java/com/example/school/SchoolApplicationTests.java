package com.example.school;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

    @Test
    void wordMaxCount() {

        String input = "Tonight is a good night and tomorrow night will be an good night";

        String[] sentenceArray = input.split(" ");

        Map<String, Integer> map = new HashMap<>();

        //int counter;

        for (int i=0;i<sentenceArray.length;i++){
            map.put(sentenceArray[i],1);
        }

        for(int i=0; i<sentenceArray.length; i++) {
            for (int j=i+1; j<sentenceArray.length; j++)  {
                if (sentenceArray[i].equals(sentenceArray[j])) {
                   Integer counter = map.get(sentenceArray[j]);
                    System.out.println(counter+"="+sentenceArray[j]);
                    if (counter!=null)
                    counter++;
                    System.out.println(counter);
                    if (!sentenceArray[j].equals("0"))
                    map.put(sentenceArray[j],counter);
                    sentenceArray[j]="0";
                }
            }
        }

//        System.out.println(counter);
        System.out.println(map);

//        Map<String,String> nameMap = new HashMap<>();
//
//        nameMap.put("33347","Ardeshir");
//        nameMap.put("0016508882","Ashkan");
//
//        System.out.println(nameMap.get("33347"));

//        for (String word : sentenceArray) {
//            map.merge(word, 1, Integer::sum);
//        }
//
//        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//	    System.out.println("Max Occurrence of Word in the given String is : " + key + " and it is repeated " + map.get(key) + " times.");

        // bishtarin tekar va tedad tekrar --> for word & char
    }

    @Test
    void charMaxCount() {

        String input = "Tonight is a good night and tomorrow night will be an good night";

        char[] sentenceArray = input.toCharArray();

//        Map<Character, Integer> map = new HashMap<>();
//        for (Character c : sentenceArray) {
//            map.merge(c, 1, Integer::sum);
//        }
//
//        Character key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//        System.out.println("Max Occurrence of Character in the given String is : " + key + " and it is repeated " + map.get(key) + " times.");

    }
}
