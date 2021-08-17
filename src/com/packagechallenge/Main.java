package com.packagechallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the calculation (e.g. 5+4 or 12/6)");
        String inputString = scanner.nextLine();
        String [] myDivList =  inputString.split("/");
        String [] myMinusList = inputString.split("-");
        String [] myPlusList = inputString.split("\\+");
        String [] myMultipleList = inputString.split("\\*");
        List<Double> myList = new ArrayList<>();

        if(inputString.contains("+")){
            for (String a : myPlusList) {
                double myNum = Double.parseDouble(a);
                myList.add(myNum);
            }
            System.out.println(calculation.calcAddition(myList));
        }

        if(inputString.contains("-")) {
            for (String b : myMinusList) {
                double myNums = Double.parseDouble(b);
                myList.add(myNums);
            }
            System.out.println(calculation.calcSubtraction(myList));
        }

        if(inputString.contains("*")) {
            for (String c: myMultipleList) {
                double myNum = Double.parseDouble(c);
                myList.add(myNum);
            }
            System.out.println(calculation.calcMultiplication(myList));
        }

        if(inputString.contains("/")) {
            for (String a: myDivList) {
                double myNums = Double.parseDouble(a);
                myList.add(myNums);
            }
            System.out.println(calculation.calcDivision(myList));
        }
    }
}
