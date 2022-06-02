package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// str k zum commiten
// str shift k zum pushen
// http://localhost:8080/sum?a=817234&b=19824
@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    public int sum (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a+b;
    }
    @RequestMapping("/min")
    public int min (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a-b;
    }

    @RequestMapping("/mul")
    public int mul (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a*b;
    }
    @RequestMapping("/div")
    public int div (
            @RequestParam int a,
            @RequestParam int b
    ) {
        return a/b;
    }
    @RequestMapping("/expo")
    public int expo (
            @RequestParam int a,
            @RequestParam int b
    ) {
        int erg= a;
        for (int i = 1; i < b;i++) {
            erg = erg * a;
        }
        return erg;
    }
}
