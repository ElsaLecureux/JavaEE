package org.example;
import org.example.Java1;
import org.example.Java2;
import org.example.Java3;
import org.example.Java4;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Java1.sum();
       String sentence1 = "Once in a blue moon";
       String sentence2 = "See eye to eye If the second string contains the first one?";
        System.out.println(Java2.compareStrings(sentence1, sentence2));
        int number = 25;
        int secondNumber=  37;
        int thirdNumber=  45;
        int fourthNumber=  23;
        System.out.println(Java3.compareNumbers(number, secondNumber, thirdNumber, fourthNumber));
        List<Integer> listOfNumbers= new ArrayList<>();
        System.out.println(Java4.sumOfNumbers(565, listOfNumbers));
    }
}