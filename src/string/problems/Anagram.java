package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    String word1 = "a gentleman";
    String word2 = "elegant man";

    char [] firstWord = word1.toCharArray();
    char [] secondWord= word2.toCharArray();

    Arrays.sort(firstWord);
    Arrays.sort(secondWord);

    boolean anagram  = Arrays.equals(firstWord, secondWord);

    if (anagram){
        System.out.println("Yes, they are");
    }else {
        System.out.println("No, they are not");
    }






    }
}
