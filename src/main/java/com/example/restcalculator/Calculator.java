package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Calculator {

    public int sum (
            int a,
            int b
    ) {
        return a+b;
    }

    public int min (
           int a,
           int b
    ) {
        return a-b;
    }

    public int mul (
            int a,
            int b
    ) {
        return a*b;
    }
    public int div (
            int a,
            int b
    ) {
        if (b == 0){
            throw new ArithmeticException("Divide by Zero isn`t possible!");
        }
        return a/b;
    }
    public int expo (
           int a,
           int b
    ) {
        int erg= a;
        for (int i = 1; i < b;i++) {
            erg = erg * a;
        }
        return erg;
    }

}
