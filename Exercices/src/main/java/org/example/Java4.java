package org.example;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Java4 {
    static int sumOfNumbers(int num, List<Integer> listOfNumbers){
        int total= 0;
        if(num/10 > 0) {
            sumOfNumbers(num/10, listOfNumbers);
        }
        listOfNumbers.add(num%10);
        for (int i=0; i < listOfNumbers.size(); i++) {
            total= total + listOfNumbers.get(i);
        }
        return total;
    }
}
