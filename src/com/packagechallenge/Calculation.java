package com.packagechallenge;

import java.util.List;

public class Calculation {

    public double calcAddition(List<Double> myList) {
        double sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum = myList.get(i) + sum;
        }
        return sum;
    }

    public double calcSubtraction(List<Double> myList) {
        double minusNum = 0;
        for (int i = 0; i < myList.size() - 1; i++) {
            if (i == 0) {
                minusNum = myList.get(i) - myList.get(i + 1);
            } else {
                minusNum = minusNum - myList.get(i + 1);
            }
        }
        return minusNum;
    }

    public double calcMultiplication(List<Double> myList) {
        double multiple = 1;
        for (int i = 0; i < myList.size(); i++) {
            multiple = myList.get(i) * multiple;
        }
        return multiple;
    }

    public double calcDivision(List<Double> myList) {
        double div = 1;
        for (int i = 0; i < myList.size() - 1; i++) {
            if (i == 0 && myList.get(i) != 0) {
                div = myList.get(i) / myList.get(i + 1);
            } else if (myList.get(i + 1) != 0 && i != 0) {
                div = div / myList.get(i + 1);
            }
        }
        return div;
    }


}
