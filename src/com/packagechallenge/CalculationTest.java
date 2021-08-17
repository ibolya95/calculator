package com.packagechallenge;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CalculationTest {
    private Calculation calculation;

    @BeforeEach
    void setUp() {
        calculation = new Calculation();
    }

    @Test
    void testCalcAddition() {
        //GIVEN
        List<Double> numbers = new ArrayList<>();
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(10.0);
        numbers.add(15.0);
        double expected = 33.0;
        //WHEN
        double result = calculation.calcAddition(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalcSubtraction() {
        //GIVEN
        List<Double> numbers= new ArrayList<>();
        numbers.add(4.00);
        numbers.add(2.00);
        numbers.add(1.00);
        double expected = 1.00;

        //WHEN
        double result = calculation.calcSubtraction(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @Test

    void testCalcMultiplication() {
        //GIVEN
        List<Double> nums = new ArrayList<>();
        nums.add(10.0);
        nums.add(3.0);
        nums.add(2.0);

        double expected = 60;

        //WHEN
        double result = calculation.calcMultiplication(nums);

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testCalcDivision() {
        //GIVEN
        List<Double> numbers = new ArrayList<>();
        numbers.add(100.0);
        numbers.add(10.0);
        numbers.add(5.0);

        double expected = 2.0;

        //WHEN
        double result = calculation.calcDivision(numbers);

        //THEN
        Assertions.assertEquals(expected, result);
    }
}