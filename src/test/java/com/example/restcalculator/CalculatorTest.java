package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sumTest(){
        // Arange
        int a = 5;
        int b= 6;
        int expected = 11;

        //Act
        int result = calculator.sum(a,b);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void minTest(){
        // Arange
        int a = 10;
        int b= 6;
        int expected = 4;

        //Act
        int result = calculator.min(a,b);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void mulTest(){
        // Arange
        int a = 10;
        int b= 6;
        int expected = 60;

        //Act
        int result = calculator.mul(a,b);

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void divTest(){
        // Arange
        int a = 15;
        int b= 5;
        int expected = 3;

        //Act
        int result = calculator.div(a,b);

        //Assert
        assertEquals(expected, result);
    }
    @Test
    void divTestZeroTest(){
        int a = 30;
        int b= 0;


        assertThrows(ArithmeticException.class, () -> {
            calculator.div(a, b);
        });
    }

    @Test
    void expoTest(){
        // Arange
        int a = 5;
        int b= 3;
        int expected = 125;

        //Act
        int result = calculator.expo(a,b);

        //Assert
        assertEquals(expected, result);
    }



}